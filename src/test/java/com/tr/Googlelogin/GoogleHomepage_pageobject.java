package com.tr.Googlelogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomepage_pageobject {
WebDriver driver;
WebElement element = null;

By loginbtn = By.id("gb_70");

	public GoogleHomepage_pageobject(WebDriver driver){
		this.driver = driver;
	}
	
	public Object clicklogin(){
		element = driver.findElement(loginbtn);
		element.click();
		return new GoogleLoginpage_pageobject(driver);
	}

	

}
