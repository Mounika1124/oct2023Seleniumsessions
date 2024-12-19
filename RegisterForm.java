package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterForm {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		//we can collect elements based on any locator
		
		List<WebElement> textFieldList = driver.findElements(By.className("form-control"));
		
		System.out.println(textFieldList);
		
		//just for understanding bad approach to fill from as we are filling same name
		//for i = 0 , form-control it is pointing to search whoch we don't want so we kept i =1 value from firstname
		for(int i = 1; i<textFieldList.size();i++) {
			textFieldList.get(i).sendKeys("mounika");
		}
	}

}
