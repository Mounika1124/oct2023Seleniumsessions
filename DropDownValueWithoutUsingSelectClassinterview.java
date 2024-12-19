package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValueWithoutUsingSelectClassinterview {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
     WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
			
	driver.get("https://www.orangehrm.com/30-day-free-trial");
	
	By country = By.xpath("//select[@id = 'Form_getForm_Country']/option");
	
	//Dont use the Select class--interview
	//but there is a select tag
	//and select the value from the dropdown
	
//	List<WebElement> countryList = driver.findElements(country);
//	System.out.println(countryList.size());
//	
//	
//	for(WebElement e : countryList) {
//		String text = e.getText();
//		System.out.println(text);
//		
//	}
	
	selectDropDownValue(country,"India");
	

         }
	
	public static void selectDropDownValue(By locator, String value) {
		List<WebElement> optionsList = driver.findElements(locator);
		System.out.println(optionsList.size());
		
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			
			if(text.equals(value)) {
				e.click();
				break;
			}
			
		}
	}
	
}
