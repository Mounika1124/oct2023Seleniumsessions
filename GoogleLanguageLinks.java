package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//to get links on specific section
		
		driver.get("https://www.google.co.in/");
//		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id = 'SIvCob']/a"));
//		System.out.println(langLinks.size()); //9
//		for(int i = 0; i<langLinks.size(); i++) {
//			String text = langLinks.get(i).getText();
//			System.out.println(text);
//			
//			if(text.equals("मराठी")) {
//				langLinks.get(i).click();
//				break;
	//}
		
		
		By langLinks =  By.xpath("//div[@id = 'SIvCob']/a");
		clickElement(langLinks, "తెలుగు");
				
			}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
		
		
	
	
	public static void clickElement(By locator, String value) {
	
		List<WebElement> eleList = getElements(locator);
		System.out.println(eleList.size()); //9
		
		
		for(int i = 0; i<eleList.size(); i++) {
			String text = eleList.get(i).getText();
			System.out.println(text);
			
			if(text.equals(value)) {
				eleList.get(i).click();
				break;
			}
	}



}
	}
	
