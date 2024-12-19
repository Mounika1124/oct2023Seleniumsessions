package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplictWaitConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//global wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    //global wait--by default it will for all the webelements
		//only applicable for webelement and webelements
		//whenever you are using FE(find element) and FEs -- imp wait will be applied
		//not applicable for non webelements--alerts, url, title
		
		driver.get("https://classic.crmpro.com/");
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("batchautomation");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	
		
		//home page
		//override implicit
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    //e4
		//e5
	
		//nullify the implicit wait
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	
		//e6
		//e7
		//e8 e9 e10
		//loginpage:
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
	
	
	
	
	
	}

}
