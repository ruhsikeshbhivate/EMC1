package com.hellohero.testcases;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import com.hellohero.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();

	String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();

	public static WebDriver driver;

	public static Logger logger;

	@BeforeClass
	public void setup()
	{
		String browser = "chrome";

		switch(browser.toLowerCase())
		{
		case "chrome":

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			driver = null;
			break;
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		logger = LogManager.getLogger("HelloHero");

		//Open url...
		driver.get(url);
		logger.info("url opened");

	}

	/*@AfterClass
	public void Down()
	{
		driver.close();
		driver.quit();
	} */

	public void captureScreenShots(WebDriver driver, String testName) throws IOException
	{
		TakesScreenshot screeshot = ((TakesScreenshot)driver);
		File source = screeshot.getScreenshotAs(OutputType.FILE);

		File desc = new File(System.getProperty("user.dir") + "ScreenShots" + testName + ".png");
		FileUtils.copyFile(source, desc);
	}

}

