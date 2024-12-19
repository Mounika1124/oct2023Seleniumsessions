package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//1. Open the browser: chrome
		//2. enter url: 
		//3. get the title of the page
		//4. Verify the title
		//5. close the browser
		
		
		//WebDriver driver = new WebDriver();
		//Topcasting
		
		
		//windows
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IM-LP-1617\\Documents\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //1. Open the browser: chrome
		
		//MAC/linux no need of .exe extension
		//System.setProperty("webdriver.chrome.driver","/Users/IM-LP-1617/Documents/chromedriver-win32/chromedriver-win32/chromedriver");
	     
		//driver.manage().window().fullscreen();
	     driver.manage().window().maximize();
		
	     
	     
		//driver.get("www.google.com");  //InvalidArgumentException
		//driver.get("https://google.com"); //it works but prefer exact URL
		driver.get("https://www.google.com"); //enter url
		
		String title = driver.getTitle(); //get the title of page
		System.out.println("page title is : " +title);
		
		
		
		//verification point: checkpoint (actual vs expected result)
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.quit(); //close the browser
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
