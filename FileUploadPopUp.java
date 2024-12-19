package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		
     WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
			
	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	
	
	//type = 'file' should be important attribute to upload file
	
	driver.findElement(By.name("upfile")).sendKeys("C:/API responses/TEXT DOC.txt");
	//driver.findElement(By.xpath("//input[@type='submit']")).click();
	

          }
	
}
