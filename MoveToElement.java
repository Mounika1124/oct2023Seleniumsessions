package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//parent and submenu handling concepts
public class MoveToElement {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
     WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
			
	driver.get("http://mrbool.com/");
	WebElement parentMenuLink = driver.findElement(By.className("menulink"));
	
	By parentMenu =  By.className("menulink");
	By subMenuCourses = By.linkText("COURSES");
	 
//	Actions action = new Actions(driver);
//	
//	action.moveToElement(parentMenuLink).perform();
	
	
	
	ElementUtil eleUtil = new ElementUtil(driver);
//	eleUtil.doMoveToElement(parentMenu);
//	
//    
//	
//	Thread.sleep(2000);
//	
//	//driver.findElement(By.linkText("Courses")).click(); //No such ele exception
//  
//	//driver.findElement(By.linkText("COURSES")).click();
//	
//	eleUtil.doActionsClick(subMenuCourses);
	  
	
	eleUtil.clickOnSubMenu(parentMenu, subMenuCourses);
	
	
	}
	
	
}
