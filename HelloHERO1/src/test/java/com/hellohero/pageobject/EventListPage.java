package com.hellohero.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EventListPage {

	WebDriver ldriver;

	public EventListPage(WebDriver rdriver)
	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//button[text()='+ Add Event']")
	WebElement AddEventButton;
	
	@FindBy(xpath = "//a[text()='Build a schedule']")
	WebElement BuildSchedule;
	
	@FindBy(xpath = "//select[@name=\"organization_id\"]")
	WebElement AddOrganization;
	
	@FindBy(xpath = "//select[@name=\"schedule_type_id\"]")
	WebElement scheduleTypes;
	
	@FindBy(xpath = "//select[@name=\"schedule_subtype_id\"]")
	WebElement scheduleSubTypes;
	
	@FindBy(xpath = "//select[@name=\"specialty_id\"]")
	WebElement scheduleSpecialty;
	
	@FindBy(xpath = "//select[@name=\"video_platform\"]")
	WebElement videoPlatfom; 
	
	@FindBy(xpath = "//select[@name=\"participants\"]")
	WebElement  Participant;
	
	@FindBy(xpath = "//button[@id=\"add_participant\"]")
	WebElement AddParticipantButton;
	
	@FindBy(xpath = "//select[@id=\"rolesId\"]")
	WebElement Therapist;
	
	@FindBy(xpath = "//select[@id=\"ownerId\"]")
	WebElement owner;
	
	@FindBy(xpath = "//button[@id=\"add_owner\"]")
	WebElement AddOwnerButton;
	
	@FindBy(xpath = "//input[@name=\"event_start_date\"]")
	WebElement EventStartDate;
	
	@FindBy(xpath = "//input[@name=\"event_start_time\"]")
	WebElement eventStartTime;
	
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-chevron-up\"])[1]")
	WebElement increaseStartTime;
	
	@FindBy(xpath = "//input[@name=\"schedule_session_length\"]")
	WebElement sessionLength;
	
	@FindBy(xpath = "//textarea[@id=\"event_description\"]")
	WebElement GeneralNotes;
	
	@FindBy(xpath = "//button[@id=\"create_event_btn\"]")
	WebElement SubmitButton;
	
	@FindBy(xpath = "//input[@value=\"schedule\"]")
	WebElement ScheduleButton;
	
	@FindBy(xpath = "//input[@value=\"event\"]")
	WebElement eventButton;
	
	public void clickOnAddEventButton()
	{
		AddEventButton.click();
	}
	
	public void clickOnBuildSchedule()
	{
		BuildSchedule.click();
	}
	
	public void selectOrganization(String value)
	{
		Select org = new Select(AddOrganization);
		org.selectByValue(value);
	}
	
	public void selectscheduleTypes(String scheduleId)
	{
		Select schedule = new Select(scheduleTypes);
		schedule.selectByVisibleText(scheduleId);
	}
	
	public void selectScheduleSubTypes(String subTypes)
	{
		Select subId = new Select(scheduleSubTypes);
		subId.selectByVisibleText(subTypes);
	}
	
	public void selectSpecialty(String Specialty)
	{
		Select specialId = new Select(scheduleSpecialty);
		specialId.selectByVisibleText(Specialty);
	}
	
	public void selectVideoPlatform(String platform)
	{
		Select Platform = new Select(videoPlatfom);
		Platform.selectByVisibleText(platform);
	}
	
	public void selectParticipant(String participantId)
	{
		Select participant = new Select(Participant);
		participant.selectByVisibleText(participantId);
	}
	
	public void clickOnAddParticipant()
	{
		AddParticipantButton.click();
	}
	
	public void selectTherapist(String TherapistId)
	{
		Select therapist = new Select(Therapist);
		therapist.selectByValue(TherapistId);
	}
	public void selectOwner(String Id)
	{
		Select OwnerId = new Select(owner);
		OwnerId.selectByValue(Id);
	}
	
	public void clickOnAddOwnerButton()
	{
		AddOwnerButton.click();
	}
	
	public void clickOnEventStartDate()
	{
		EventStartDate.click();
	}
	public void clickOnEventStartTime()
	{
		eventStartTime.click();
	}
	
	public void clickOnIncreaseStartTime()
	{
		increaseStartTime.click();
	}
	
	public void enterSessionLength(String length)
	{
		sessionLength.sendKeys(length);
	}
	
	public void enterGeneralNotes(String Notes)
	{
		GeneralNotes.sendKeys(Notes);
	}
	
	public void clickOnScheduleButton()
	{
		ScheduleButton.click();
	}
	
	public void clickOnEventButton()
	{
		eventButton.click();
	}
	
	public void clickOnSubmit()
	{
		SubmitButton.click();
	}
}
