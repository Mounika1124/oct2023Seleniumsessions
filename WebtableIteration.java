package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableIteration {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> tableList = driver.findElements(By.xpath("//table[@id='customers']//td"));
		//driver.findElements(By.cssSelector("table[id='customers'] td"));
  
		System.out.println(tableList.size());
		
		//tableList.stream().forEach(ele -> System.out.println(ele.getText()));
		
		
		for(WebElement ele : tableList) {
			System.out.println(ele.getText());
		}
		
		
		
		System.out.println("-----------------------");
		
		
		//table[@id='customers']/tbody/tr/td[1]
		//table[@id='customers']/tbody/tr/td[2]
		//table[@id='customers']/tbody/tr/td[3]
		
		//write table everytime which is a good practice
		//table[@id='customers']/table/tbody/tr/td[1]
		for(int i=1; i<=3; i++) {
			
			System.out.println("column-------"+i+"-----------");
			
		List<WebElement> columnData = 	driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td["+i+"]"));
		columnData.stream().forEach(ele -> System.out.println(ele.getText()));
		
		
		
		}
		
		//print name column and second page also using select class upto 10 pages
		//for loop for 10 pages--select index--wait and inner loop
		//page dropdown one more loop
		//crcinfo print batsman name
		//form[@id='vContactsForm']/table//tr//td[4]/span
	}

}
