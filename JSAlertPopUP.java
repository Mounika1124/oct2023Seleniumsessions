package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlertPopUP {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		
     WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
			
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.name("proceed")).click();
	Thread.sleep(4000);
	
	Alert alert = driver.switchTo().alert(); //alert method gives alert ref so store in alert ref
         String text = alert.getText();
         System.out.println(text);
	
         
         alert.accept(); //accept
        // alert.dismiss();// cancel
         
         driver.switchTo().defaultContent();
	
       }

	
}