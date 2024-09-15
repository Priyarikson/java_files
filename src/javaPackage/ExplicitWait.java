package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "/Users/priyankaraju/eclipse-workspace/chromedriver-mac-arm64/chromedriver");
		
		//Launching chrome browser instance
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//open url using get()method		
		driver.get("https://www.facebook.com/");
		
		//Enter Username
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		//Fetch input box attribute value
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		
		//Use Explicit Wait to check is password field is visible
		WebDriverWait wt = new WebDriverWait(driver, 50);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcd");
		
		
	}

}
