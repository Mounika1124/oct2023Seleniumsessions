package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		
		WebDriverFactory wf =  new WebDriverFactory();
		WebDriver driver = wf.init_driver("chrome");
		
		String title = wf.getPageTitle();
		System.out.println("Page title is : " +title);
		
		System.out.println(wf.getPageUrl());
		
		By url = By.id("Form_submitForm_subdomain");
		By firstname = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By submitBtn = By.id("submit_button");
		
		

		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(url, "testingautomation");
		eleUtil.doSendKeys(firstname, "testing");
		eleUtil.doSendKeys(lastname, "test");
		eleUtil.doClick(submitBtn);
		
		wf.quitBrowser();
	}

}
