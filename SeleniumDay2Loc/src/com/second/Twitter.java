package com.second;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Twitter {

	public static void main(String[] args) throws InterruptedException {
		
		//setting the property to the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TEMP.DESKTOP-PHPVAIG.009\\Desktop\\01106_Pavani\\SeleniumDay2\\Driver\\chromedriver.exe");
						
WebDriver driver= new ChromeDriver();
//calling the browser

driver.get("https://twitter.com/login");

driver.manage().window().maximize();

		//To get the Title
String Title= driver.getTitle();
System.out.println(Title);
//To get the Current url
String currenturl=driver.getCurrentUrl();
System.out.println(currenturl);

//To Locate the User name
driver.findElement(By.className("js-username-field email-input js-initial-focus")).sendKeys("PAVANI");
Thread.sleep(3000);
driver.findElement(By.className("js-password-field")).sendKeys("GUDAVALLI");
Thread.sleep(3000);

//Try to Execute but due to the DOM Structure having multiple DIV's 


	}
	
	
	
}
