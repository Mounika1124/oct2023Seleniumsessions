package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsMethods {

	//actions click and sendkeys
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
     WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
			
	driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
      
	By emailId = By.id("input-email");
	By password = By.id("input-password");
	By loginButton = By.xpath("//button[@type='submit']");
	By forgotPwdLink = By.linkText("Forgotten Password");
	
//	Actions action = new Actions(driver);
//	
//	action.sendKeys(driver.findElement(emailId), "mounika12@gmail.com").perform();
//	action.sendKeys(driver.findElement(password), "mounika123").perform();
//	
//	action.click(driver.findElement(loginButton)).perform();
//	Thread.sleep(2000);
//	action.click(driver.findElement(forgotPwdLink)).perform();
	
	doActionsSendKeys(emailId, "mounika12@gmail.com");
	doActionsSendKeys(password, "mounika123");
	doActionsClick(loginButton);
	Thread.sleep(2000);
	doActionsClick(forgotPwdLink);
	
	
	
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
