package com.w2a.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.TopNavigationLocator;

public class TopNavigation {
	
	public TopNavigationLocator tNL;
	
	public TopNavigation(WebDriver driver) {
		this.tNL= new TopNavigationLocator();
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(Page.driver,10); OR if webdrive in not static 
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.tNL);
	}
	
	
	public void gotoSupport() {
		
	}
	
	public Signin goToLogin() {
		
		tNL.loginBtn.click();
		tNL.login_signup.click();
		tNL.continueWithEmail.click();
		return new Signin();
		
	}

}
