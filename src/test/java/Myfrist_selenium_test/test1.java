package Myfrist_selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");

    WebDriver driver = new ChromeDriver ();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
    driver.findElement(By.id("logInModal")).click();
    //driver.findElement(By)
	
	
	
	}
}
