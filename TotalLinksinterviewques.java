package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinksinterviewques {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//total no of links on page
		//you have to print the text of each link with their index number( ignore the blank text)
		//you have the print the href value(url) of each link(having text)
		//called as webscraping
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//return type of findelements it will return list<webElement>(array of webElement)
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("Total links: " + linksList.size());
       
		for(int i = 0; i<linksList.size(); i++) {
			String text = linksList.get(i).getText();
			
			
			//ignore blank text
			
			if(!text.isEmpty()) {
				System.out.println(i +  "-->" + text);	
				String url = linksList.get(i).getAttribute("href");
				System.out.println(url);
			}
			
			
			//System.out.println(i +  "-->" + text);
			//System.out.println(text);
			//System.out.println(url);
		}
	}

}
