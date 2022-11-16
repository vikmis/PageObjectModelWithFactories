package com.w2a.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.HomePageLocators;

public class HomePage  extends Page{
	
	public HomePageLocators homepagelocator;
	
	public HomePage() {
		
		this.homepagelocator = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.homepagelocator);
	}
	 
	public HomePage gotoFlight() {
		
		homepagelocator.flightTab.click();
		return this;
	}
	public void  gotoHotels() {
		
	}
	
	public int  findTapCount() {
		
				
		return homepagelocator.tapCount.size();
	}
	
	public void bookFlight(String from, String to,String departing,
			String noOfAdults,String noOfChildren,String noOfInfants) throws InterruptedException {
		
		homepagelocator.oneWayRadiobtn.click();
		 homepagelocator.fromCity.sendKeys(from);
		 Thread.sleep(1000);
		 homepagelocator.toCity.sendKeys(to);
		 Thread.sleep(1000);
		 homepagelocator.departOn.sendKeys(departing);
		 Thread.sleep(1000);
		 homepagelocator.adults.sendKeys(noOfAdults);
		 Thread.sleep(1000);
		 homepagelocator.children.sendKeys(noOfChildren);
		 Thread.sleep(1000);
		 homepagelocator.infants.sendKeys(noOfInfants);
		 Thread.sleep(1000);
		 homepagelocator.searchFlights.click();
		
	}

}
