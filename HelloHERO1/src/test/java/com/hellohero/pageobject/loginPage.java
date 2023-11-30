package com.hellohero.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver ldriver;

	//constructor
	public loginPage(WebDriver rdriver)
	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@id=\"login\"]")
	WebElement userName;

	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement passWord;

	@FindBy(xpath = "(//button[@type=\"submit\"])[1]")
	WebElement LoginButton;

	public void enterUsername(String USERNAME)
	{
		userName.sendKeys(USERNAME);
	}

	public void enterPassword(String pass)
	{
		passWord.sendKeys(pass);
	}

	public void clickOnLoginButton()
	{
		LoginButton.click();
	}
}
