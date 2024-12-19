package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
	
	static WebDriver driver; //instead of creating object we made it as static to use in main as it is static

	public static void main(String[] args) {
	
		String browser = "chrome";
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\IM-LP-1617\\Documents\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\IM-LP-1617\\Documents\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("safari")) {
			//no need of exe file as selenium handles safari internally
			driver = new SafariDriver();
		}
		else {
			System.out.println("please pass the correct browser : " +browser);
		}
		
		 driver.manage().window().maximize();
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
			
			driver.quit(); //close the browser
			
		
		
	}

}
