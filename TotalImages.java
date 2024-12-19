package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//total no of images on page
		//you have to print the url of each image
		//you have the print the href value(url) of each link(having text)
		//called as webscraping
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
				driver.get("https://www.amazon.in/");

				List<WebElement> imageList = driver.findElements(By.tagName("img"));
				System.out.println(imageList.size());
				
				//for normal for loop we have to traverse through index but for each we can directly gettext or attribute name
				
				for(WebElement e : imageList ) {
					String srcUrl = e.getAttribute("src");
					System.out.println(srcUrl);
				}

	}

}
