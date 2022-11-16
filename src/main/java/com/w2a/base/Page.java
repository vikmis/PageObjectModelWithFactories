package com.w2a.base;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.w2a.pages.actions.TopNavigation;
import com.w2a.utilities.ExcelReader;
import com.w2a.utilities.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {
	
	
	/*Webdriver
	 * 
	 *Excel Reader
	 *WebDriver Wait
	 *Logs
	 *Extent Report
	 * 
	 */
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	public static WebDriverWait wait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	//public static String browser;
	public static TopNavigation tnav ;
	
	
	public static void intiConfugration() {
		
		if(Constants.browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.debug("Firefox is launching");
		}else if(Constants.browser.equalsIgnoreCase("chrome")){
			
			/*System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
*/
			Map<String,Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			
			ChromeOptions options = new ChromeOptions();
			//ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");

			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			log.debug("Launching Chrome");
		}else if(Constants.browser.equalsIgnoreCase("ie")){
			
			/*System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");*/
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			log.debug("Launching IE");
		}
		
		driver.get(Constants.testsiteurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.implicitWait));
		
		tnav = new TopNavigation(driver);
	}
	
	public static void quitBrowser() {
		
		driver.quit();
		
	}

}
