package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
     WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
			
	driver.get("https://www.orangehrm.com/30-day-free-trial");
	
	By country = By.id("Form_getForm_Country");
	
//	Select select_country = new Select(driver.findElement(country));
//	//select_country.selectByIndex(4); //static dropdown we use like months , weeks may change index values
//	select_country.selectByVisibleText("India"); //more preferable
//	select_country.selectByValue("Andorra") ;  //value tag
	
	//if we have more dropdown we have to create select class everytime so we created generic functions
	
         //doselectByVisibleText(country, "Finland");
         //doselectByIndex(country, 10);
	

//         Select select_country = new Select(driver.findElement(country));
//        List<WebElement> country_list =  select_country.getOptions();
//        System.out.println("total country options : " + country_list.size());
//        
//        for(WebElement e : country_list ) {
//        	String text = e.getText();
//        	System.out.println(text);
//        }
	
	//getDropdownOptionValues(country);
	
	List<String> countryList = getDropdownOptionValues(country);
	System.out.println(countryList.size());
	
	System.out.println(countryList);
	
	if(countryList.contains("India")) {
		System.out.println("PASS");
	}
	
	
	}
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doselectByIndex(By locator, int index) {
		Select select= new Select( getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doselectByVisibleText(By locator, String text) {
		Select select= new Select( getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doselectByValue(By locator, String value) {
		Select select= new Select( getElement(locator));
		select.selectByValue(value);
	}
	
	
	public static List<String> getDropdownOptionValues(By locator) {
		List<String> OptionsValList = new ArrayList<>();
		
		 Select select= new Select(getElement(locator));
	        List<WebElement> optionsList =  select.getOptions();
	        
	       	   for(WebElement e : optionsList ) {
	        	String text = e.getText();
	        	OptionsValList.add(text);
	        }
	       	   return OptionsValList;
		
	}
	
	
	
}
