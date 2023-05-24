package Advance_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class droopdown_demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		Thread.sleep(5000);
		Select sl = new Select(driver.findElement(By.id("gh-cat")));
		//sl.selectByVisibleText("Art") ; //by visible
		sl.selectByIndex(6);// By index
		//sl.selectByValue(null)
		
	}

}
