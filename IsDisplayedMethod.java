package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedMethod {
	

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://www.freshworks.com/");
		
		//By is a class, locators are coming or created with the help of from By class
		//locators are created with the help of identifiers
		By h1 = By.tagName("h1");
		By header1 = By.tagName("h2");
		By freetrial = By.linkText("Free trial");
		
		//System.out.println(driver.findElement(freetrial).isDisplayed());
		 if(doIsDisplayed(freetrial)) {
			 System.out.println("freetrial is displayed");
		 }
		 else {
			 System.out.println("freetrial is displayed"); 
		 }
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

}
