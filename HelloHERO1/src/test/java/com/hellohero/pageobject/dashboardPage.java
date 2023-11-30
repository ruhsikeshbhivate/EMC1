package com.hellohero.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardPage {


	WebDriver ldriver;

	//constructor
	public dashboardPage(WebDriver rdriver)
	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}

			
	@FindBy(xpath = "//span[text()='Scheduling']")
	WebElement Scheduling;
	
	@FindBy(xpath = "(//a[@href=\"https://stage.hellohero.com/event-list\"])[1]")
	WebElement Events;
	
	@FindBy(xpath = "//a[@onclick=\"addReferral()\"]")
	WebElement AddReferral;
	
			
	public void clickOnScheduling()
	{
		Scheduling.click();
	}
	
	public void clickOnEvents()
	{
		Events.click();
	}
	
	public void clickOnAddReferral()
	{
		AddReferral.click();
	}
}
