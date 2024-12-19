package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class CustomCssSelectors {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//css selector: it is a locator not an attribute
		//id - #id or tag#id
		//class -- .className or tag.className
		//.c1.c2.c3----cn
		//.form-control.private-form__control.login-email
		
		
		//#username
		//input#username
		//input.form-control.private-form__control.login-email
		//input.login-email
		//#username.login-email
		//#username.form-control.private-form__control.login-email
		//.login-email#username
		//input.login-email#username
		
		
		By e1 = By.cssSelector("#username");
		By e2 = By.cssSelector(".form-control.private-form__control.login-email");
		By e3 = By.xpath("input[@class='.form-control.private-form__control.login-email']");
		By e4 = By.className("form-control private-form__control login-email");//--wrong

		//input[@name = 'username']--xpath
		// tag[attr = 'value']
		//input[name = 'username']--css
		// tag[attr = 'value'][attr = 'value']
		//input[name = 'username'][type='text']
		//input[name = 'username'][type='text'][placeholder='Username']--css
		//input[@name = 'username'and @type='text' and @placeholder='Username']--xpath
		
		
		//parent to child:
		
		//tag.className(space) or > child tag
		//div.private-form__input-wrapper input#username--mostly preferable
		//div.private-form__input-wrapper >input#username
		//ul.navbar-right a
	
	By footerLinks = By.cssSelector("ul.kTjuIu li a");
	
	//child to parent: can't do that
	
	//input[id*='user']--contains represented by *
	//input[id*='-origin-airport']
	
	
	//input[id^='user'] --starts with
	//input[id$='user'] --ends with
	
	//comma in css selector:
	//input#username, input#password, button#loginBtn, path.private-checkbox__icon__inner
	
	By loginFormLocators = By.cssSelector("input#username, input#password, button#loginBtn, path.private-checkbox__icon__inner");
	  int loginFormElementsCount= driver.findElements(loginFormLocators).size();
	  
	  if(loginFormElementsCount == 5) {
		  System.out.println("My login page is displayed with all mandatory elements");
	  }
	
	//following-sibling in css:
	  //input[name='username']+ input
	  
	  //limitation of css:
	  //we can't jump from one to another regarding webtable
	  
	  //solution is absolute path we need to break the xpath which is not recommended to use
	
	
	  //not operator in css:
	  
	  //form-control private-form__control login-email
	  //form-control private-form__control login-password m-bottom-3
	
	  
	  
	  //input.form-control.private-form__control:not(#username)
	  
	  //index in css: nth-of-type()
	 // ul.list-unstyled li:nth-of-type(9) a --specific index
	// ul.list-unstyled li:nth-of-type(n) a --for all elements
	  
	  
	//table[@id='customers']/tbody/tr/td
	  
	  
	  
	  
	  
	}

}
