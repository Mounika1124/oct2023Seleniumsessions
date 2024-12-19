package SeleniumSessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StreamsWithListAndFilter {

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		
     WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 
	 driver.get("https://www.amazon.in/");
	 
	 List<WebElement> linksList = driver.findElements(By.tagName("a"));
	 System.out.println(linksList.size());
	 
	 //to eliminate blanks
//	 List<String> collectList = linksList.stream()
//	 				 .filter(ele -> !ele.getText().equals("")) //filter the balnk text
//	 				 .map(ele -> ele.getText())     //give the filtered text
//	 				 .collect(Collectors.toList()); //Collectors class collect method returns list of string
//	 
//	 
//	 collectList.stream().forEach(ele -> System.out.println(ele)); //we can write  any instead of ele but meaningful name ele--element
	 				 
	 
	 
	 
	 
	 //print the text of each link contains Amazon keyword
//	 List<String> amazonLinkList = linksList.stream()
//	 				.filter(ele -> !ele.getText().equals("") && ele.getText().contains("Amazon"))
//	 				.map(ele -> ele.getText()) 
//	 				.collect(Collectors.toList());
	 
	 
	 List<String> amazonLinkList = linksList.stream()
						.filter(ele -> !ele.getText().isEmpty())
						.filter(ele -> ele.getText().contains("Amazon"))
						.map(ele -> ele.getText()) 
						.collect(Collectors.toList());
	 
	 
	 
	 
	 
	 amazonLinkList.stream().forEach(ele -> System.out.println(ele));
	 			    
	 
	 
	}
	
}
