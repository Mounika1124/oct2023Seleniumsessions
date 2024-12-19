package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorOrangeHrm {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IM-LP-1617\\Documents\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/orangehrm-30-day-free-trial");
		
			
		
//		getElement(url).sendKeys("mounika@gmail.com");
//		getElement(firstname).sendKeys("mounika");
//		getElement(lastname).sendKeys("perli");
//		getElement(submitBtn).click();
		
		By url = By.id("Form_submitForm_subdomain");
		By firstname = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By submitBtn = By.id("submit_button");	
		
		doSendKeys(url, "testautomation");
		doSendKeys(firstname, "testing");
		doSendKeys(lastname, "automation");
		doClick(submitBtn);
		
		
		
		

	} 
	
	//Generic functions
	
	//this method responsible for creating webelement
	public static WebElement getElement(By locator) {
		return driver.findElement(locator); //as it is giving webElement
		
	}
	
	//this method for click
	public static void doClick(By locator) {
		getElement(locator).click();
     }
	
	//this method for sendkeys--value to enter string so passing it
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
     }
	
	

}