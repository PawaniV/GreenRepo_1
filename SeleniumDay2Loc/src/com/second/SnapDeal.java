
	package com.second;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class SnapDeal {

		public static void main(String[] args) throws InterruptedException {
			
			//setting the property to the browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TEMP.DESKTOP-PHPVAIG.009\\Desktop\\01106_Pavani\\SeleniumDay2\\Driver\\chromedriver.exe");
							
	WebDriver driver= new ChromeDriver();
	//calling the browser

	driver.get("https://www.snapdeal.com/login");

	driver.manage().window().maximize();

			//To get the Title
	String Title= driver.getTitle();
	System.out.println(Title);
	//To get the Current url
	String currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);

	//To Locate the User name
	driver.findElement(By.id("userName")).sendKeys("9949907253");
	Thread.sleep(3000);





		}
		
		
		
	}
