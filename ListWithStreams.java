package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//JAVA8 new feature
//Java 8 :streams : will be applied on List
//improve the performance of the script by using streams

public class ListWithStreams {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		
     WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 
	 driver.get("https://www.amazon.in/");
	 List<WebElement> linksList = driver.findElements(By.tagName("a"));
	 System.out.println(linksList.size());
	 
	 long stTime = System.currentTimeMillis();
	 
	 
	 //-> lamda symbol, foreach is method here
	 //sequential stream
	 //linksList.stream().forEach(ele -> System.out.println(ele.getText()));
      
	 
	 //parallel stream: no order: faster
	linksList.parallelStream().forEach(ele -> System.out.println(ele.getText()));
	
	 long endTime = System.currentTimeMillis();
	 
	 System.out.println("time taken " +(endTime-stTime)); 
	 //3134(seq)
	 //3099(parallel)
	 
	
	}

	
}