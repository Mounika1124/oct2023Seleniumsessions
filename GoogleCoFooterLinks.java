package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleCoFooterLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
     WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
			
	driver.get("https://www.google.co.in/");
	
//	List<WebElement> footerlinks = driver.findElements(By.xpath("//div[@class='KxwPGc SSwjIe']"));
//	System.out.println(footerlinks.size());
//	for(int i = 0; i<footerlinks.size(); i++) {
//		String footertext = footerlinks.get(i).getText();
//		System.out.println(footertext);
//	}
	
	By footerlinks = By.xpath("//div[@class='KxwPGc SSwjIe']");
	footerText(footerlinks);
	
	
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	public static void footerText(By locator) {
		for(int i = 0; i<getElements(locator).size(); i++) {
			String footertext = getElements(locator).get(i).getText();
			System.out.println(footertext);
		}
		
	}
}
