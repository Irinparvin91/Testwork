package Advance_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_pratice_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.awt.color")).click();

	}

}
