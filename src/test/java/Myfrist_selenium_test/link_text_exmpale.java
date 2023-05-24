package Myfrist_selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_text_exmpale {

	public static void main(String[] args) {
		System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.demoblaze.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.findElement(By.linkText("Contact")).click();

	}

}
