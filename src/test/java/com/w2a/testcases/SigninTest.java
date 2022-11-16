package com.w2a.testcases;

import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.actions.HomePage;
import com.w2a.pages.actions.Signin;

public class SigninTest {

	
	@Test
	public void signInTest() {

		Page.intiConfugration();
		Signin sgn = Page.tnav.goToLogin();
		//
		sgn.doLogin("abc@gmail.com", "12345");

	}

}
