package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

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
		driver.get("https://money.rediff.com/gainers");
		
		//Create List - All Companies
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total Companies : "+allCompanies.size());
		
		//Create List - Current Price
		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total Current Price : "+currentPrice.size());
		
		String expResult = "National Oxygen";
		
		for(int i = 0; i < allCompanies.size(); i++) {
			if(allCompanies.get(i).getText().equalsIgnoreCase(expResult)) {
				System.out.println(allCompanies.get(i).getText()+"==="+currentPrice.get(i).getText());
				allCompanies.get(i).click();
				break;
			}
		}
		
	}

}
