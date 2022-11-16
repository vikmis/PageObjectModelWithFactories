package com.w2a.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.HomePageLocators;
import com.w2a.pages.locators.SigninLocator;

public class Signin extends Page {
	
public SigninLocator signinlc;
	
	public Signin() {
		
		this.signinlc = new SigninLocator();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.signinlc);
	}
	
	public void doLogin(String username,String password) {
		
		signinlc.emailEntr.sendKeys(username);
		signinlc.passEntr.sendKeys(password);
		signinlc.Login.click();
	}

}
