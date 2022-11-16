package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninLocator {
	
	
	
	@FindBy(xpath="//input[@data-testid='email']")
	public WebElement emailEntr;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement passEntr;
	
	@FindBy(xpath="//span[text()='Log in']")
	public WebElement Login;
	
	
	
	

}
