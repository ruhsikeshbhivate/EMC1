package com.hellohero.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.hellohero.pageobject.ReferralContactInformation;
import com.hellohero.pageobject.ReferralCreatePage;
import com.hellohero.pageobject.dashboardPage;
import com.hellohero.pageobject.loginPage;

public class TC_AddReferralTest extends BaseClass {
	@Test
	public void addReferral() throws InterruptedException
	{
		driver.manage().window().maximize();
		
		driver.manage().window().maximize();
		loginPage page = new loginPage(driver);
		page.enterUsername("sagar_admin");
		page.enterPassword("sagar_admin");
		page.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dashboardPage dashPage = new dashboardPage(driver);
		dashPage.clickOnAddReferral();
		
		driver.navigate().refresh();
		dashPage.clickOnAddReferral();

		ReferralCreatePage obj = new ReferralCreatePage(driver);
		obj.SelectOrganization("Test_Organization");
		//obj.SelectStudent("Add New Student");
		obj.SelectStudent();
		Thread.sleep(4000);
		obj.clickOnNext1();
		obj.enterStudentFname("David");
		obj.enterStudentLname("Henry");
		obj.enterStudentDOB();
		obj.enterStudentSchoolId("56");
				
		obj.enterStudentAddress("1884 Ashford Drive");
		obj.enterCity("Washington");
		obj.enterZipCode("202005");
		obj.selectCountry("United States");
		obj.selectState("Virginia");
		obj.selectTimezone("(GMT -04:00) America/New_York");
		obj.clickOnNext2();
		
		ReferralContactInformation info = new  ReferralContactInformation(driver);
		info.enterMainContactFname("Matt");
		info.enterMainContactLname("Henry");
		info.enterPhone("1234567890");
		info.enterMainContactEmail("matt@gmail.com");
		info.enterMainContactRelationship("Parent");
		info.clickOnNext();
		
		info.SelectService("Speech Therapy");
		info.selectScheduleType("Assessment");
		info.selectScheduleSubType("Eligibility Assessment");
		info.clickOnAddService();
		info.clickOnSubmit();
		
	}

}
