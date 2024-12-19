package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCheckboxWithStreams {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
     WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
			
	driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
	
	List<WebElement> CheckBoxList = driver.findElements(By.cssSelector("td.select-checkbox"));
	
	System.out.println(CheckBoxList.size());
	
	//CheckBoxList.stream().forEach(ele -> ele.click());
	
	CheckBoxList.parallelStream().forEach(ele -> ele.click());


           }

}