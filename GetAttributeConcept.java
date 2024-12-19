package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://app.hubspot.com/login");
//		String email = driver.findElement(By.id("username")).getAttribute("type");
//		String forgot_password = driver.findElement(By.linkText("Forgot my password")).getAttribute("href");
//          System.out.println(email);
//          System.out.println(forgot_password);
		
		
		String email = doGetAtrribute(By.id("username"), "type");
		String forgot_password = doGetAtrribute(By.linkText("Forgot my password"), "href");
		System.out.println(email);
        System.out.println(forgot_password);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetAtrribute(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}

}
