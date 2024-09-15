
package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "/Users/priyankaraju/eclipse-workspace/chromedriver-mac-arm64/chromedriver");
		
		//Launching chrome browser instance
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//open url using get()method		
		driver.get("https://www.google.com/");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff works");
		
		//Handling Auto Suggestion
		List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		for(int i = 0; i<AllSuggestions.size(); i++) {
			String expResult = "how stuff works podcast";
			if(AllSuggestions.get(i).getText().equalsIgnoreCase(expResult)) {
				AllSuggestions.get(i).click();
				break;
			}
		}
				

	}

}
