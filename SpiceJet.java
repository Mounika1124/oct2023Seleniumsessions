package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		
     WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
			
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	
	
	By addons = By.xpath("//div[text()='Add-ons']");
	By travelSerivices = By.xpath("//div[text()= 'Travel Assistance Services']");
	By subMenuStudentDiscount = By.xpath("//div[text()='Student Discount']");
	
	ElementUtil eleUtil = new ElementUtil(driver);
	
	Thread.sleep(2000);
	
	eleUtil.clickOnSubMenu(addons, travelSerivices);
	Thread.sleep(2000);
	eleUtil.clickOnSubMenu(addons,subMenuStudentDiscount);

     }
	
}
