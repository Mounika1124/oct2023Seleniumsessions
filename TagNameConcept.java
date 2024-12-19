package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver =  new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://www.freshworks.com/");
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
//		
//		String header1 = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header1);
//		
//		String freetrial = driver.findElement(By.linkText("Free trial")).getText();
//		System.out.println(freetrial);
//		
		By h1 = By.tagName("h1");
		By header1 = By.tagName("h2");
		By freetrial = By.linkText("Free trial");
		
		System.out.println(doGetText(h1));
		System.out.println(doGetText(header1));
		System.out.println(doGetText(freetrial));
	

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}

}
