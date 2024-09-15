package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverMnager1 {

	static WebDriver driver;

	public static void main(String[] args) {
		//WebDriverManager is a class
		System.out.println("Hello World");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://facebook.com/");



	}


}
