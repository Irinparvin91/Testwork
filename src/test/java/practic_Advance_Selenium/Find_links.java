package practic_Advance_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
		System.out.println(Alllinks.size());
		for (int i=0;i<Alllinks.size();i++) {
			System.out.println(Alllinks.get(i).getAttribute("href"));
		}

	}

}
