package com.hellohero.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

WebDriver ldriver;
	
	public UsersPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//span[text()=\"Users\"]")
	WebElement users;
	
	@FindBy(xpath = "//a[@href=\"https://stage.hellohero.com/users\"]")
	WebElement UserSearch;
	
	@FindBy(xpath = "//input[@id=\"userSearchNameInput\"]")
	WebElement searchName;
	
	@FindBy(xpath = "//button[@id=\"btnFiterSubmitSearch\"]")
	WebElement SearchButton;
	
	@FindBy(xpath = "//a[text()=\"Next\"]")
	WebElement Next;
	
	@FindBy(xpath = "//a[text()=\"View Profile\"]")
	WebElement ViewProfile;
	
	@FindBy(xpath = "//span[text()=\"Documents\"]")
	WebElement Documents;
	
	@FindBy(xpath = "//a[@title=\"Clinical\"]")
	WebElement Clinical;
	
	@FindBy(xpath = "//button[@onclick=\"getModal(1)\"]")
	WebElement Upload;
	
	@FindBy(xpath = "(//input[@name=\"folder_name\"])[1]")
	WebElement FolderName;
	
	@FindBy(xpath = "//label[@class=\"custom-file-upload\"]")
	WebElement ChooseFile;
	
	@FindBy(xpath = "//button[text()=\"Upload\"]")
	WebElement UploadButton;
	
}
