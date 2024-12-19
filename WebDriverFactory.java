package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverFactory {
	
	WebDriver driver;
	
	
	/**
	 * This method is used to initialize the webdriver on the basis of given browser name
	 * @param browserName
	 * @return it returns webdriver
	 */
	
	public WebDriver init_driver(String browserName) {
	
	if(browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	else if(browserName.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	else if(browserName.equals("safari")) {
		driver = new SafariDriver();
	}
	else {
		System.out.println("please pass the correct browser : " +browserName);
	}
	
	return driver;
	
	}
	
	public void launchUrl(String Url) {
		driver.get(Url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
}
