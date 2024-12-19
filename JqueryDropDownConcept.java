package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
     WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
			
	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
       
	Thread.sleep(2000);
	driver.findElement(By.id("justAnInputBox")).click();
	Thread.sleep(2000);
//	List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//	for(WebElement e : choiceList) {
//		String text = e.getText();
//		System.out.println(text);
//		
//		if(text.equals("choice 2")) {
//			e.click();
//			break;
//		  }
//	  }
	
	By choices = By.xpath("//span[@class='comboTreeItemTitle']");
	
	//1. SIngle selection :
	
	selectChoiceFromDropdown(choices, "choice 3");
//selectChoiceFromDropdown(choices, "choice 6 2 3");
//	
//	selectChoiceFromDropdown(choices, "choice 6 2 3");
	
	//selectChoiceMultiFromDropdown(choices, "choice 3");
	//selectChoiceMultiFromDropdown(choices, "choice 7"); //boundary value analysis
	
    //2.multi seelction
	//selectChoiceMultiFromDropdown(choices, "choice 2", "choice 3", "choice 6 2 3");
	
	
	//All selection
	
	//selectChoiceFromDropdown(choices, "ALL");
	
	}
	
	
	
	
//	public static void selectChoiceFromDropdown(By locator, String value) {
//	List<WebElement> choiceList = driver.findElements(locator);
//	for(WebElement e : choiceList) {
//		String text = e.getText();
//		System.out.println(text);
//		
//		if(text.equals(value)) {
//			e.click();
//			break;
//		  }
//	  }
//	}
//	
//	
//	//String... three dot parameter multi array string parameter
//	//we have to do regression it should not affect single choice
//	//just for understanding i am writing seperate methods
//	public static void selectChoiceMultiFromDropdown(By locator, String... value) {
//		List<WebElement> choiceList = driver.findElements(locator);
//		for(WebElement e : choiceList) {
//			String text = e.getText();
//			System.out.println(text);
//			
//			for(int i=0; i<value.length; i++) {
//				if(text.equals(value[i])) {
//					e.click();
//					break;
//					
//				}
//			}
//			
//			
//		}	
//



/**
 * This function handles three test cases 1.single selection
 * 2.multi selection
 * 3.All selection: Please pass "all/ALL/All"
 * @param locator
 * @param value
 */
public static void selectChoiceFromDropdown(By locator, String... value) {
	List<WebElement> choiceList = driver.findElements(locator);
	if(!value[0].equalsIgnoreCase("ALL")) {  //we can pass all, All, so equalsignore case method
	
	for(WebElement e : choiceList) {
		String text = e.getText();
		System.out.println(text);
		
		for(int i=0; i<value.length; i++) {
			if(text.equals(value[i])) {
				e.click();
				break;
				
			}
		 
		}
		
		
	 }	
	
 }
	
	//all selection:
	else {
		try {
		for(WebElement e: choiceList) { //as it is with in we can keep outside if
			e.click();
		}
		}
		catch (Exception e) {
			
		}
	}
 
	
	
	
	
	
	//element not interactable exception as we have choice 7 upto 14 position 14 of 44 matches remaining are hidden
	//so we keep try catch
}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
