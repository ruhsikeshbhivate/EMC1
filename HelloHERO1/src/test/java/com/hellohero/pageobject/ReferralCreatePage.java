package com.hellohero.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ReferralCreatePage {

	WebDriver ldriver;
	
	public ReferralCreatePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//select[@id=\"referralSearchOrgSelect2\"]")
	WebElement searchOrganization;
	
	@FindBy(xpath = "(//b[@role=\"presentation\"])[4]")
	WebElement selectStudent;
	
	@FindBy(xpath = "//input[@role=\"searchbox\"]")
	WebElement searchBox;
	
	@FindBy(xpath = "//button[@id=\"goToNext\"]")
	WebElement Next1;
	
	@FindBy(xpath = "//input[@name=\"student_first_name\"]")
	WebElement StudentFname;
	
	@FindBy(xpath = "//input[@name=\"student_last_name\"]")
	WebElement StudentLname;
	
	@FindBy(xpath = "//input[@id=\"student_dob\"]")
	WebElement StudentDOB;
	
	@FindBy(xpath = "//input[@name=\"student_school_id\"]")
	WebElement StudentSchoolId;
	
	@FindBy(xpath = "//input[@name=\"student_nick_name\"]")
	WebElement StudentNickName;
	
	@FindBy(xpath = "//select[@name=\"student_pronouns\"]")
	WebElement StudentProunoun;
	
	@FindBy(xpath = "//input[@name=\"student_address1\"]")
	WebElement StudentAddress;
	
	@FindBy(xpath = "//input[@name=\"student_city\"]")
	WebElement City;
	
	@FindBy(xpath = "//input[@name=\"student_zipcode\"]")
	WebElement ZipCode;
	
	@FindBy(xpath = "//select[@id=\"parent_country_dropdown\"]")
	WebElement Country;
	
	@FindBy(xpath = "//select[@name=\"parent_state\"]")
	WebElement State;
	
	@FindBy(xpath = "//select[@name=\"timezone\"]")
	WebElement Timezone;
	
	@FindBy(xpath = "(//button[text()='Next'])[1]")
	WebElement Next2;
	
	@FindBy(xpath = "//th[text()='April 2023']")
	WebElement month;
		
	public void SelectOrganization(String org)
	{
		Select Organization = new Select(searchOrganization);
		Organization.selectByVisibleText(org);
	}
	
	public void SelectStudent() throws InterruptedException
	{
		selectStudent.click();
		Thread.sleep(3000);
		
		Actions act = new Actions(ldriver);
		searchBox.sendKeys("Add New Student");
		act.keyDown(Keys.ENTER).build().perform();
	}
	
	public void clickOnNext1()
	{
		Next1.click();
	}
	
	public void enterStudentFname(String Fname)
	{
		StudentFname.sendKeys(Fname);
	}
	
	public void enterStudentLname(String Lname)
	{
		StudentLname.sendKeys(Lname);
	}
	
	public void enterStudentDOB() throws InterruptedException
	{
		StudentDOB.click();
	}
	
	public void enterStudentSchoolId(String Id)
	{
		StudentSchoolId.sendKeys(Id);
	}
	
	public void enterStudentNickName(String Nickname)
	{
		StudentNickName.sendKeys(Nickname);
	}
	
	public void enterStudentAddress(String address)
	{
		StudentProunoun.sendKeys(address);
	}
	
	public void enterCity(String city)
	{
		City.sendKeys(city);
	}
	
	public void enterZipCode(String zip)
	{
		StudentProunoun.sendKeys(zip);
	}
	
	public void selectCountry(String country)
	{
		Country.sendKeys(country);
	}
	
	public void selectState(String state)
	{
		State.sendKeys(state);
	}
	
	
	
	public void selectTimezone(String timezone)
	{
		Timezone.sendKeys(timezone);
	}
	
	public void clickOnNext2()
	{
		Next2.click();
	}
	
}

