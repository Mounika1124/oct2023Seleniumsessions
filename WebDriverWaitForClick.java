package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForClick {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		
		By forgotpwd = By.linkText("Forgot Password?11111");
		
		
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(forgotpwd));
//        element.click();
		
		
		//Exception in thread "main" org.openqa.selenium.TimeoutException: Expected condition failed:
		//waiting for element to be clickable: 
		//By.linkText: Forgot Password?11111
		//(tried for 10 second(s) with 500 milliseconds interval)--intervak time or poling time
	
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickWhenReady(forgotpwd, 10);
	
	
	
	}

}
