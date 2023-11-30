package com.hellohero.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.hellohero.pageobject.EventListPage;
import com.hellohero.pageobject.dashboardPage;
import com.hellohero.pageobject.loginPage;

public class TC_CreateEventTest extends BaseClass {

	@Test
	public void createEvent() throws InterruptedException
	{
		
		driver.manage().window().maximize();
		loginPage page = new loginPage(driver);
		page.enterUsername("sagar_admin");
		page.enterPassword("sagar_admin");
		page.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dashboardPage dashPage = new dashboardPage(driver);
		dashPage.clickOnScheduling();
		dashPage.clickOnEvents();
		Thread.sleep(4000);
		EventListPage eventList = new EventListPage(driver);
		eventList.clickOnAddEventButton();
		
		eventList.clickOnBuildSchedule();
		Thread.sleep(5000);
		eventList.selectOrganization("295");
		Thread.sleep(2000);
		eventList.selectscheduleTypes("Assessment");
		eventList.selectScheduleSubTypes("Eligibility Assessment");
		eventList.selectSpecialty("Speech Therapy");
		eventList.selectVideoPlatform("HelloHERO Video");
		eventList.selectParticipant("James Barnes");
		eventList.clickOnAddParticipant();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		eventList.selectTherapist("6");
		eventList.selectOwner("28371"); //Therapist Logan..
		eventList.clickOnAddOwnerButton();
		
		WebElement SubmitButton = driver.findElement(By.xpath("//button[@id=\"create_event_btn\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", SubmitButton);
		Thread.sleep(2000);
		
		WebElement  ScheduleButton= driver.findElement(By.xpath("//input[@value=\\\"schedule\\\"]"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", ScheduleButton);
		//eventList.clickOnScheduleButton();
		
		eventList.clickOnEventButton();
		Thread.sleep(5000);
		WebElement STARTDate = driver.findElement(By.xpath("//input[@name=\"event_start_date\"]"));
		JavascriptExecutor Executor = (JavascriptExecutor)driver;
		Executor.executeScript("arguments[0].click();", STARTDate);
		
		
		Thread.sleep(3000);
		eventList.clickOnEventStartTime();
		eventList.clickOnIncreaseStartTime();
		eventList.clickOnIncreaseStartTime();
     	Thread.sleep(3000);
		eventList.enterSessionLength("3");
		eventList.enterGeneralNotes("This schedule is created by automation");
		WebElement submitButton = driver.findElement(By.xpath("//button[@id=\"create_event_btn\"]"));
		JavascriptExecutor Executor1 = (JavascriptExecutor)driver;
		Executor1.executeScript("arguments[0].click();", submitButton);
		
		
	}
}
