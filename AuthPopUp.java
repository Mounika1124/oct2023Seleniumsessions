package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		
     WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	//username and password not visible in url when it launched
	//enterprise level--login page not avaialble or developed
	//some application running on cloud at admin level we go there write username and password
			
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	

   }
	
}
