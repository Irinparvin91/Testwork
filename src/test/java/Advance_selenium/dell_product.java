package Advance_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dell_product {

	public static void main(String[] args) {
		
	System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
			driver.get("https://www.dell.com/");
			driver.manage().window().maximize();
			
	}

}
