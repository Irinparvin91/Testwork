package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dell_testcase3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
			driver.get("https://www.dell.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("mh-search-input")).sendKeys("product");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@class='mh-search-btn mh-search-submit']")).click();

	}

}
