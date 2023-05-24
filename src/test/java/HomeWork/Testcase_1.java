package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.demoblaze.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("sign-username")).sendKeys("Falgun");
		driver.findElement(By.id("sign-password")).sendKeys("Jahan1234");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();

	}

}
