package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseinterview {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IM-LP-1617\\Documents\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("page title is : " +title);
		
		 //close the browser
		//driver.quit(); //close the browser
		//System.out.println(driver.getTitle());
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		driver.close();
		//NoSuchSessionException: invalid session id
		System.out.println(driver.getTitle());
		

	}

}
