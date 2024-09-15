package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

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
		driver.get("https://jqueryui.com/droppable/");
		
		//Switching frame
		driver.switchTo().frame(0);
		System.out.println("Switched to frame");
		
		//draggable web element
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']")) ;
		
		//droppable web element
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']")) ;
				
		//drag and drop using actions class
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		

	}


}
