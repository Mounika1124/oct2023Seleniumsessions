package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Axes {

			
		//right--followingsibling, left---preceding sibling--traversing
		
		//a[text()='Ali Baba']//parent::td//preceding-sibling::td/input[@type='checkbox']
		//a[text()='Anand Reddy']//parent::td//preceding-sibling::td/input[@type='checkbox']
		
		
		//cricinfo--dynamic web table
		
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			
			
	     WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		driver.get("https://www.espncricinfo.com/series/asian-cricket-council-under-19s-asia-cup-2023-24-1411739/india-under-19s-vs-nepal-under-19s-10th-match-group-a-1411756/full-scorecard");
		
//		String text = driver.findElement(By.xpath("(//a[@title='Deepak Bohara']//parent::div//parent::td//following-sibling::td)[1]")).getText();
//		
//		System.out.println(text);
		
		//getWicketTakerName("Gulsan Jha");
		
		getPlayerScoreCard("Hader Ali").stream().forEach(ele -> System.out.println(ele));
		
//		List<WebElement> scoreList = driver.findElements(By.xpath("//a[@title='Deepak Bohara']//parent::div//parent::td//following-sibling::td"));
//		for(int i = 0; i<scoreList.size();i++) {
//			String text = scoreList.get(i).getText();
//			System.out.println(text);
//		}
		
		}
		
		//generic methods
		
//		public static String getWicketTakerName(String playerName) {
//			
//			String text = driver.findElement(By.xpath("(//a[@title='"+playerName+"']//parent::div//parent::td//following-sibling::td)[1]")).getText();
//			
//		return text;
//		}
		
		
//		public static void getPlayerScoreCard(String playerName) {
//			System.out.println();
//			List<WebElement> scoreList = driver.findElements(By.xpath("//a[@title='"+playerName+"']//parent::div//parent::td//following-sibling::td"));
//			for(int i = 0; i<scoreList.size();i++) {
//				String text = scoreList.get(i).getText();
//				System.out.println(text + " ");
//			}
		
		public static List<String> getPlayerScoreCard(String playerName) {
			System.out.print(playerName + "-->");
			//covert to string first
			List<String> scoreCardList = new ArrayList<String>();
			List<WebElement> scoreList = driver.findElements(By.xpath("//a[@title='"+playerName+"']//parent::div//parent::td//following-sibling::td"));
			for(int i = 0; i<scoreList.size();i++) {
				String text = scoreList.get(i).getText();
				//System.out.println(text + " ");
				scoreCardList.add(text);
			}
			
			return scoreCardList;

}

}
		

