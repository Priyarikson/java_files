package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Exception {
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
		
		//JavascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//Locate web element using JavascriptExecutor
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='12345'");
		
		//Scroll down using javascript
		Thread.sleep(3000);
		jse.executeScript("window, scrollBy(0, 500)");
		
		//Scroll down using javascript
		Thread.sleep(3000);
		jse.executeScript("window, scrollBy(0, -500)");
		

	}

}
