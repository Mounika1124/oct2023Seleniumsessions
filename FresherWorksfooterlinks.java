package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FresherWorksfooterlinks {

	static WebDriver driver;

		public static void main(String[] args) {
			
			
	     WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				
		driver.get("https://www.freshworks.com/?tactic_id=3419410&utm_source=google-adwords&utm_medium=FWorks-Search-India&utm_campaign=FWorks-Search-India&utm_term=freshworks&device=c&matchtype=e&network=g&gclid=EAIaIQobChMIof6HqaqyggMVeotLBR3beQzeEAAYASAAEgJz5PD_BwE&gad_source=1");
		
		By fresherfooterlinks = By.xpath("//div[@class='sc-6293d692-0 jrSUEJ']");
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.footerText(fresherfooterlinks);
	}

}
