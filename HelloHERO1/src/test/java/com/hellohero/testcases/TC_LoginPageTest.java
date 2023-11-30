package com.hellohero.testcases;

import org.testng.annotations.Test;

import com.hellohero.pageobject.loginPage;

public class TC_LoginPageTest extends BaseClass {

	@Test
	public void VerifyUserLogin() throws InterruptedException
	{
		driver.manage().window().maximize();
		loginPage page = new loginPage(driver);
		page.enterUsername("sagar_admin");
		page.enterPassword("sagar_admin");
		page.clickOnLoginButton();
		 
	}

}
