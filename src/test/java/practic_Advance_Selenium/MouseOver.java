package practic_Advance_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
			driver.get("https://www.dell.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().deleteAllCookies();	
		    Actions ac = new Actions(driver);
		    ac.moveToElement(driver.findElement(By.xpath("//span[text()='Solutions']"))).build().perform();
		 //   ac.moveToElement(driver.findElement(By.linkText("Skip to main content"))).click();
			
	}

}
