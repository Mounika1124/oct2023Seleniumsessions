package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public  WebElement getElement(By locator) {
		return driver.findElement(locator); 
	}
	
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	public  void doClick(By locator) {
		getElement(locator).click();
     }
	
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
     }
	
   public void doActionsSendKeys(By locator, String value) {
		
		Actions action = new Actions(driver);
		//action.sendKeys(getElement(locator), value).perform();
		//more robust which makes less chances of code failure
		action.moveToElement(getElement(locator)).sendKeys(value).build().perform();
	}
	
	public  void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		//action.click(getElement(locator)).perform();
		//more robust which makes less chances of code failure
		action.moveToElement(getElement(locator)).click().build().perform();
		
	}
	
	public  void doMoveToElement(By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).perform();
		
	}
	
	public void clickOnSubMenu(By parentMenu, By firstSubMenu) throws InterruptedException { //locators
		doMoveToElement(parentMenu);
		Thread.sleep(2000);
		doActionsClick(firstSubMenu);
	}
	
	public void clickOnSubMenu(By parentMenu, By firstSubMenu, By secondSubMenu) throws InterruptedException { //locators
		doMoveToElement(parentMenu);
		Thread.sleep(2000);
		doActionsClick(firstSubMenu);
		Thread.sleep(2000);
		doActionsClick(secondSubMenu);
	}
	
	
	public  String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public  String doGetAtrribute(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}
	
	public  boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	
		
	public  void clickElement(By locator, String value) {
	
		List<WebElement> eleList = getElements(locator);
		System.out.println(eleList.size());
		
		
		for(int i = 0; i<eleList.size(); i++) {
			String text = eleList.get(i).getText();
			System.out.println(text);
			
			if(text.equals(value)) {
				eleList.get(i).click();
				break;
			}
		}
	
	}
	
//	public  boolean checkElementPresent(By locator) {
//		List<WebElement> eleList = driver.findElements(locator);
//		if(eleList.size()>0) {
//			return true;
//		}
//	return false;


	public boolean checkElementPresent(By locator) {
		if(getElements(locator).size()>0) {
			return true;
		}
	return false;
}
	
	public void footerText(By locator) {
		for(int i = 0; i<getElements(locator).size(); i++) {
			String footertext = getElements(locator).get(i).getText();
			System.out.println(footertext);
		}
		
		}
	


	
	
	
	
	//**************Dropdown Utils********************************
	
	//Select class Dropdown Utils
	
	public  void doselectByIndex(By locator, int index) {
		Select select= new Select( getElement(locator));
		select.selectByIndex(index);
	}
	
	public  void doselectByVisibleText(By locator, String text) {
		Select select= new Select( getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public  void doselectByValue(By locator, String value) {
		Select select= new Select( getElement(locator));
		select.selectByValue(value);
	}
	
	public  List<String> getDropdownOptionValues(By locator) {
		List<String> OptionsValList = new ArrayList<>();
		
		 Select select= new Select(getElement(locator));
	        List<WebElement> optionsList =  select.getOptions();
	        
	       	   for(WebElement e : optionsList ) {
	        	String text = e.getText();
	        	OptionsValList.add(text);
	        }
	       	   return OptionsValList;
		
	}
	
	
	public  void selectDropDownValue(By locator, String value) {
		List<WebElement> optionsList = getElements(locator);
		for(WebElement e : optionsList) {
			String text = e.getText();
			
			if(text.equals(value)) {
				e.click();
				break;
			}
        }
		
	}

/*********************************wait utils 
 * @return *********************/

	
	/**
	 * An expectation for checking that all elements present on the web page that match the locator are visible.
	 *Visibility means that the elements are not only displayed but also have a height and width that is greater than 0
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public List<WebElement> visibiltyOfAllElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	
	
	public void getPageElements(By locator, int timeOut) {
		visibiltyOfAllElements(locator,timeOut).stream().forEach(ele -> System.out.println(ele.getText()));
	}
	
	
	
	
	
	
	//presenceOfElementLocated:
	/** An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.*/

public  WebElement waitForElementPresent(By locator, int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver, timeOut);
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}

/**
* An expectation for checking that an element, known to be present on the DOM of a page, 
* is visible. Visibility means that the element is not only displayed but also has a height andwidth that is greater than 0.
* @param locator
* @param timeOut
* @return
*/

public  WebElement waitForElementVisible(By locator, int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver, timeOut);
	return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
}

 
public Boolean waitForUrlToBe(String urlvalue, int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver, timeOut);
	return wait.until(ExpectedConditions.urlContains(urlvalue));
}

/**
 *

An expectation for checking an element is visible and enabled such that you can click it.
  
 * @param locator
 * @param timeOut
 */
public void clickWhenReady(By locator, int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver,timeOut);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    element.click();
}

public Alert waitForAlert(int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver,timeOut);
	return wait.until(ExpectedConditions.alertIsPresent());
}

public void acceptJSAlert(int timeOut) {
	waitForAlert(timeOut).accept();
}

public void dismissJSAlert(int timeOut) {
	waitForAlert(timeOut).dismiss();
}

public String getAlertText(int timeOut) {
	return waitForAlert(timeOut).getText();
}

public String waitForTitleToBe(String title, int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver, timeOut);
	wait.until(ExpectedConditions.urlContains(title));
	return driver.getTitle();
}



}
