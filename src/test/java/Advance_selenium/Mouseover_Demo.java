package Advance_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover_Demo {

	public static void main(String[] args) {
		System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.dell.com/");
		driver.manage().window().maximize();
		
	  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.manage().deleteAllCookies();	
	    Actions ac = new Actions(driver);
	    ac.moveToElement(driver.findElement(By.xpath("//span[text()='Products']"))).build().perform();
	    driver.findElement(By.linkText("Servers")).click();

	}

}
