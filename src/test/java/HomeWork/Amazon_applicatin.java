package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_applicatin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.findElement(By.id("nav_cs_2")).click();
		driver.findElement(By.linkText("Customer Service")).click();
		driver.findElement(By.linkText("Your Account")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h2[contains(text(),'Orders')]")).click();

	}	

}
