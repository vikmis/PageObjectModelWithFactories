package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocator {
	
	@FindBy(xpath="//p[text()='Log in']")
	public WebElement loginBtn;
	
	@FindBy(xpath="//button[text()='Log in / Sign up']")
	public WebElement login_signup;
	
	@FindBy(xpath="//span[text()='Continue with Email']")
	public WebElement continueWithEmail;
	
	

}
