package com.hellohero.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReferralContactInformation {

	WebDriver ldriver;
	
	public ReferralContactInformation(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//input[@id=\"main_contact_first_name\"]")
	WebElement MainContactFname;
	
	@FindBy(xpath = "//input[@id=\"main_contact_last_name\"]")
	WebElement MainContactLname;
	
	@FindBy(xpath = "/input[@id=\"main_contact_phone\"]")
	WebElement Phone;
	
	@FindBy(xpath = "//input[@id=\"main_contact_email\"]")
	WebElement MainContactEmail;
	
	@FindBy(xpath = "//select[@id=\"main_contact_relationship\"]")
	WebElement MainContactLnRelationship;
	
	@FindBy(xpath = "//button[@id=\"goToTherapyInfo\"]")
	WebElement Next;
	
	@FindBy(xpath = "//select[@id=\"service_requested\"]")
	WebElement selectService;
	
	@FindBy(xpath = "//select[@id=\"schedule_type\"]")
	WebElement scheduleType ;
	
	@FindBy(xpath = "//select[@id=\"schedule_subtype\"]")
	WebElement scheduleSubType;
	
	@FindBy(xpath = "(//button[@type=\"button\"])[11]")
	WebElement addService;
	
	@FindBy(xpath = "//button[text()=\"Submit\"]")
	WebElement submit;
	
	public void enterMainContactFname(String fname)
	{
		MainContactFname.sendKeys(fname);
	}
	
	public void enterMainContactLname(String Lname)
	{
		MainContactLname.sendKeys(Lname);
	}
	
	public void enterPhone(String phone)
	{
		Phone.sendKeys(phone);
	}
	public void enterMainContactEmail(String email)
	{
		MainContactEmail.sendKeys(email);
	}
	
	public void enterMainContactRelationship(String id)
	{
		Select relation = new Select(MainContactLnRelationship);
		relation.selectByVisibleText(id);
	}
		
	public void clickOnNext()
	{
		Next.click();
	}
	
	public void SelectService(String service)
	{
		Select Service = new Select(selectService);
		Service.selectByVisibleText(service);
	}
	
	public void selectScheduleType(String Schedule)
	{
		Select Type = new Select(scheduleType);
		Type.selectByVisibleText(Schedule);
	}
	
	public void selectScheduleSubType(String subtype)
	{
		Select relation = new Select(scheduleSubType);
		relation.selectByVisibleText(subtype);
	}
	
	public void clickOnAddService()
	{
		addService.click();
	}
	public void clickOnSubmit()
	{
		submit.click();
	}

}
