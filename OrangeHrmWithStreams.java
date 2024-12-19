package SeleniumSessions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmWithStreams {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
     WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
			
	driver.get("https://www.orangehrm.com/30-day-free-trial");
	
	List<WebElement> countryList = driver.findElements(By.xpath("//select[@name='Country']/option"));
	
   System.out.println(countryList.size());
   
//   countryList.stream()
//                  .filter(ele -> !ele.getText().isEmpty())
//                  .filter(ele -> ele.getText().contains("India"))
//                  .map(ele -> ele.click());
	

            
			
						
    				
					



	
   }
	
}
