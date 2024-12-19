package SeleniumSessions;

import org.openqa.selenium.By;

public class Custom_xpath_1 {

	public static void main(String[] args) {
	
		//xpath: is a locator not an attribute
		//two types of xpath:
		    //1. absolute xpath: from the parent to child via hierarchy
		       ///html/body/div[1]/header/nav/div/div/ul/li[3]/span
		       // risky xpath as it is not fixed
		
		
		    //2. relative xpath: xpath using xpath functions, attribute
		       //(custom xpath)
		
		//htmltag[@attr = 'value']
		//ex:  //input[@id='username']
		//input[@type='email']
		
		//htmltag[@attr1 = 'value' and @attr2 = 'value']
		 //ex:  //input[@id='username' and @type='email'] //we can more attr..........
	
	    //input[@id and @type] //no need to give value everytime but there should be only one match
        //input
		//a
		
		//contains():
		//dynamic id
		//<input "id" = "test_123">
		//<input "id" = "test_133">
		//<input "id" = "test_143">
		
		//tag[contains(@attr, 'value')]
		//input[contains(@id, 'username')]
		//input[contains(@id, 'user')]
		//input[contains(@id, 'test_')]
		
		//aygi-origin-airport
		//KjRP-origin-airport
		//c5W7P-origin-airport
		
		//input[contains(@id, '-origin-airport')]
		
		//input[contains(@id, 'user') and @type='email']
		
		//input[contains(@id, 'user') and contains(@type='email')]
		
		
		
		//contains() with text():
		//tag[contains(text(),'Companies & Contacts')]
		//h3[contains(text(),'Companies & Contacts')]
		//h3[contains(text(),'Companies')]
		//h3[text()='Contact Management')]
		
		
		
		//starts-with()
		
		//h3[starts-with(text(), 'Get')]
		//input[starts-with(@name, 'user')]
		
		
		//parent to child:
		//ul[@class='nav navbar-nav navbar-right']/li/a
		//ul[@class='list-unstyled']//child::li//child::a
		//ul[@class='list-unstyled']//child::li
		//ul[@class='nav navbar-nav navbar-right']//a
		
		By ele = By.xpath("//ul[@class='nav navbar-nav navbar-right']/li/a");//right
		By ele1 = By.className("nav navbar-nav navbar-right");//wrong
		//input[@class='form-control private-form__control login-email']
		
		//indexing comcept xpath
	//	(//div[@class='private-form__input-wrapper']/input)[1]
		
		By.xpath("(//div[@class='private-form__input-wrapper']/input)[1])");
		
		//( //ul[@class='list-unstyled']/li/a)[1]
		//( //ul[@class='list-unstyled']/li/a)[position()=1]
		//( //h3)[19]
  
		
		
		//child to parent:
		//backward traversing in xpath: using /..
		//span[text()='Platform']/../../../../../../../..
		//input[@id='username']//parent::div
		//input[@id='username']/parent::div
		//input[@id='username']//ancestor::div
		//input[@id='username']//ancestor::form
			
		
		
		
	
	
	
	
	}

}
