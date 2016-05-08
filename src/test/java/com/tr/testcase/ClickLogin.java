package com.tr.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tr.Googlelogin.GoogleHomepage_pageobject;
import com.tr.Googlelogin.GoogleLoginpage_pageobject;

public class ClickLogin {
	
		WebDriver driver;
		WebElement element;
		String url = "https://www.google.co.in/"; 
		
		int wait = 30;
		String pagetitle = null;
		GoogleLoginpage_pageobject objlogin = null;
		GoogleHomepage_pageobject objHome = null;
		
@BeforeTest
			public void setup() 
			{
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
			driver.manage().window().maximize();	
			}

@Test
			public void enterlogin()
			{
				objHome = new GoogleHomepage_pageobject(driver);
				objHome.clicklogin();
			}

@AfterTest
			public void teardown(){
			driver.quit();
}	


	}

	


