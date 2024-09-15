package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) throws Exception {
		
		//Setting the property of chrome browser and passing chromedriver path
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyankaraju/eclipse-workspace/chromedriver-mac-arm64/chromedriver");
		
		//Launching chrome browser instance
		WebDriver driver = new ChromeDriver();
		
		//open url using get()method		
		driver.get("https://www.facebook.com/");
		
		//maximize the window
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//delete all cookies
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		//open url using navigate method
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		
		//refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//Navigate to back
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Navigate to forward
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//Fetch current url
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		//get title of the webpage 
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		//close the browser
		driver.close();
		
	}

}
