package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

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
		driver.get("https://www.flipkart.com/");
		
		//create electronics web element ref
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		//Mouse simulation using actions class
		Actions act = new Actions(driver);
		//Mouse hover to Electronics
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();
		
		//Keyboard operations
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement fash = driver.findElement(By.xpath("//*[text()='Fashion']"));
		Thread.sleep(2000);
		act.sendKeys(fash, Keys.ENTER).build().perform();
		System.out.println("Fashion option clicked");
		
		//Right click on b page
		Thread.sleep(2000);
		act.contextClick().build().perform();
		

	}

}
