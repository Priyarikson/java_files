package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "/Users/priyankaraju/eclipse-workspace/chromedriver-mac-arm64/chromedriver");
		
		//Launching chrome browser instance
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//open url using get()method		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		Thread.sleep(2000);
		
		//1st way
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id ='month']/option"));
		System.out.println("Total Dropdown Values :- " + birthMonth.size());
		birthMonth.get(8).click();
		
		//2nd way
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bm);
		Thread.sleep(2000);
		month.selectByVisibleText("Apr"); //Apr
		Thread.sleep(2000);
		month.selectByValue("12"); //dec
		Thread.sleep(2000);
		month.selectByIndex(7); //aug
		
		System.out.println(month.getFirstSelectedOption().getText());//aug- current selected value
		
		//3rd way
		List<WebElement> dropdown = month.getOptions();
		for(int i = 0; i < dropdown.size(); i++) {
			if(dropdown.get(i).getText().equalsIgnoreCase("Sep")) {
				dropdown.get(i).click();
			}
		}
		
		//4th way
		WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));
		bm1.sendKeys("Jun");
		
		//5th way
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("Mar");
		
		// check if dropdown support multi selection
		System.out.println(month.isMultiple()); //false
		month.selectByVisibleText("Apr"); //Apr
		month.selectByValue("12"); //dec
		month.selectByIndex(7); //Aug
		
		//deselect the multiselect value from dropdown
		month.deselectByVisibleText("Apr");//Apr
		month.deselectByValue("12"); //dec
		month.deselectByIndex(7); //Aug
		month.deselectAll(); // deselect all selected values
		
		
		
	}

}
