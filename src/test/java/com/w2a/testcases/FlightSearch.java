package com.w2a.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.actions.HomePage;

public class FlightSearch {
	
	@Test
	public void flighSearchTest() throws InterruptedException {	
		
		Page.intiConfugration();		
		HomePage home = new HomePage();
		Assert.assertEquals(home.findTapCount(), "9");
		Thread.sleep(2000);
		home.gotoFlight().bookFlight("BLR - Bangalore, IN", "BOM - Mumbai, IN", "Sun, May 15", "1", "0", "0");
		Thread.sleep(2000);
		Page.quitBrowser();
	
	}
}
