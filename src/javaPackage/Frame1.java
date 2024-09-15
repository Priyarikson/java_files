package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

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
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	
		Thread.sleep(5000);


		//Find the total number of frames present 
		int allFrames =driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames : "+allFrames);

		//Check if the element is present or not 
		for(int i=0; i<allFrames; i++) {
			driver.switchTo().frame(i); driver.switchTo().frame(i);

			String expText = "Open Paytm App";

			String abc = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();

			if(abc.equalsIgnoreCase(expText)) { 
				System.out.println("Element found");
			}else { 
				System.out.println("Element not found"); }

		}

	}

}
