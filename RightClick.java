package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//In terms of webpage or UI we call rightclick called as context menu
public class RightClick {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
     WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
			
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	Actions action = new Actions(driver);
	action.contextClick(rightClickEle).perform();
	
	//before quit there is a seperator so total 7
	//to avoid that we took only span text
	
	List<WebElement> optionsList = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
	System.out.println(optionsList.size());
	
	for(WebElement e : optionsList) {
		String text = e.getText();
		System.out.println(text);
		
			if(text.equals("Paste")) {
			e.click();
			break;
		}
	}
	

   }
	
}
