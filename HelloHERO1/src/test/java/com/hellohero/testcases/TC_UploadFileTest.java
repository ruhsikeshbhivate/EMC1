package com.hellohero.testcases;

import com.hellohero.pageobject.loginPage;

public class TC_UploadFileTest extends BaseClass{

	public void uploadFileForUser() throws InterruptedException
	{
		driver.manage().window().maximize();
		loginPage page = new loginPage(driver);
		page.enterUsername("sagar_admin");
		page.enterPassword("sagar_admin");
		page.clickOnLoginButton();
		 
		
	}
}
