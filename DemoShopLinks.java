package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoShopLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		By shopLinks = By.xpath("//div[@class='list-group mb-3']/a");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickElement(shopLinks, "Forgotten Password");

	}

}
