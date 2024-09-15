package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		
		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "/Users/priyankaraju/eclipse-workspace/udemy_selenum_java/chromedriver-mac-arm64/chromedriver");
		
		//Launching chrome browser instance
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//open url using get()method		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		
		//first way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click(); // female
		driver.findElement(By.xpath("//input[@value='2']")).click(); //male
		driver.findElement(By.xpath("//input[@value='-1']")).click(); //custom
		
		//2nd way
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total Radio Buttons :- " + radios.size());
		System.out.println(radios.get(0).isSelected()); // false
		System.out.println(radios.get(1).isEnabled()); // true
		System.out.println(radios.get(2).isDisplayed()); // true
		Thread.sleep(2000);
		radios.get(1).click(); // Male
		System.out.println(radios.get(2).isSelected()); // false
		
		//3rd way
		List<WebElement> radiosText = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total Radio Buttons Text : "+ radiosText.size());
		String expResult = "Female";
		for (int i = 0; i < radiosText.size(); i++) {
			
		if (radiosText.get(i).getText().equalsIgnoreCase(expResult)) {
		radiosText.get(i).click();
		System.out.println(expResult + " Clicked");
		break;
		}

		}
	}
	
	}
