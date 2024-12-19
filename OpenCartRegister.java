package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartRegister {

	public static void main(String[] args) {
		
		WebDriverFactory wf = new WebDriverFactory();
		WebDriver driver = wf.init_driver("chrome");
		wf.launchUrl("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		System.out.println(wf.getPageTitle());
		System.out.println(wf.getPageUrl());
		
		
		
		
		
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By password = By.id("input-password");
		By newsletter = By.id("input-newsletter-no");
		By checkbox = By.xpath("//input[@type = 'checkbox']");
		By continuebtn = By.xpath("//button[@type = 'submit']");
		
		
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendKeys(firstname, "Testing");
		eleutil.doSendKeys(lastname, "Demo");
		eleutil.doSendKeys(email, "testingdemo@gmail.com");
		eleutil.doSendKeys(password, "Testing@123");
		eleutil.doClick(newsletter);
		eleutil.doClick(checkbox);
		eleutil.doClick(continuebtn);
		
		wf.closeBrowser();
		
		
		
	
	}

}
