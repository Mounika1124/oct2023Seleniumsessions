package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		
     WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
			
	driver.get("http://londonfreelance.org/courses/frames/index.html");
	
	//driver.switchTo().frame(2);
	//driver.switchTo().frame("main");
	driver.switchTo().frame(driver.findElement(By.name("main")));
    String header = driver.findElement(By.xpath("/html/body/h2")).getText();
    System.out.println(header);
    driver.switchTo().defaultContent();
               
	
	
	}
	
}
