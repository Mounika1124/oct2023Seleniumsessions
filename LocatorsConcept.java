package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IM-LP-1617\\Documents\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
	
		//create a webelement( by using locator) --> perform action on it (click, sendkeys, gettext)
		//first approach
		//send requests again and again 
//		driver.findElement(By.id("input-email")).sendKeys("mounika@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("mounika@123");

		
//		//second approach
//		//reusability--creating webelement once and can use many times
//		//sending request only once
		//everytime we are creating and storing elemnt and hitting the server unnecessarily
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		email.sendKeys("mounika@gmail.com");
//		password.sendKeys("mounika@123");
		
		
		//Third approach
		//Using By locator: creating object repository
		//whenever its needed then only wea re creating webelement
		//just maintain by locator, when needed we create webelement on basis of by locator and perfrom action 
	   By emailId = By.id("input-email"); //id method returning By class obj only so storing in By class reference
		By password = By.id("input-password");
//		
//		driver.findElement(emailId).sendKeys("mounika@gmail.com");
//		driver.findElement(password).sendKeys("mounika@123");
//		
		
		getElement(emailId).sendKeys("mounika@gmail.com");
		getElement(password).sendKeys("mounika@123");
		
		//1.id is unique
				//2.name and 3.className is not unique
				//don't use all class names together with by.className
				//form-control private-form_control login-email
				//form-control private-form_control login-password m-bottom-3
				
				driver.get("https://app.hubspot.com/login");
				driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
				
				//4.xpath is a locator, its not an attribute or property
				driver.findElement(By.className("login-password")).sendKeys("test@123");
				driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tyu@gmail.com"); //right click-->copy-->copy xpath
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("test@123");
				
				By fn = By.xpath("//*[@id=\"username\"]");
				By pw =By.xpath("//*[@id=\"password\"]");
				
				doSendKeys(fn, "naveen");
				doSendKeys(pw, "test@234");
				
				
				//5.cssSelector:is a locator, its not an attribute or property
				//css: cascaded style sheet
				driver.findElement(By.cssSelector("#username"));//#id is css,  right click-->copy-->copy selector
				
				
				//6.link text: only for links (on the basis of the text of the link)
				
				driver.findElement(By.linkText("Privacy Policy")).click();
				
				By privacyPolicy = By.linkText("Privacy Policy");
				doClick(privacyPolicy);
				
				//7. partial link text (on the basis of the partial text of the link)
				
				driver.findElement(By.partialLinkText("privacy")).click();
				
				//8. tagName
				
				
		
				
		
		
	}
	
	

	
	
	
	
	//4th approach
//	public static void getElement(By locator) {
//		driver.findElement(locator);
//		
//	}
	
	
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator); //as it is giving webElement
		
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
     }
	
	
	public static  void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
     }
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
