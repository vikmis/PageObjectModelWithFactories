package com.w2a.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	
	@FindBy(xpath="//div[text()='Flights']")	
	public WebElement flightTab;
	
	//locators for flight booking
	
	@FindBy(xpath="(//span[contains(@class,'radio__circle bs-border bc-neutral-500 bw-1 ba')])[1]")	
	public WebElement oneWayRadiobtn;
	@FindBy(xpath="(//input[@placeholder='Any worldwide city or airport'])[1]")	
	public WebElement fromCity;
	@FindBy(xpath="(//input[@placeholder='Any worldwide city or airport'])[2]")	
	public WebElement toCity;
	@FindBy(xpath="//button[contains(@class,'pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900')]")	
	public WebElement departOn;
	@FindBy(xpath="(//select[contains(@class,'br-4 pl-2 p-relative zIndex-5')])[1]")	
	public WebElement adults;
	@FindBy(xpath="(//select[contains(@class,'br-4 pl-2 p-relative zIndex-5')])[2]")	
	public WebElement children;
	@FindBy(xpath="(//select[contains(@class,'br-4 pl-2 p-relative zIndex-5')])[3]")	
	public WebElement infants;
	@FindBy(xpath="//button[contains(@class,'bw-1 br-4 lh-solid box-border')]")	
	public WebElement searchFlights;
	
	@FindBy(xpath="//ul//li//a//div")
	public List<WebElement> tapCount;
}
