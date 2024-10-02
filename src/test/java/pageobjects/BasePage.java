package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	 
	
	WebDriver driver;
	JavascriptExecutor  js; 
	
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		js=(JavascriptExecutor)driver; 
		PageFactory.initElements(driver, this);
	}

	public void fillText(WebElement el,String text) {
		
		
		highlightElement(el,"yellow");
		el.clear();
		el.sendKeys(text);
	}

	public void click(WebElement el) {
		
		highlightElement(el,"yellow");
		el.click();
	}

	public String getText(WebElement el) {
		
		highlightElement(el,"yellow");
		return el.getText();
	}

	
	public void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
 
    

     // Call this method with your element and a color like (red,green,orange etc...)

    private void highlightElement(WebElement element, String color) {
    		//keep the old style to change it back
    		String originalStyle = element.getAttribute("style");
    		String newStyle = "background-color:yellow;border: 1px solid" + color + ";" + originalStyle;
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		
    		// Change the style 
    		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '" + newStyle + "');},0);",
    				element);

    		// Change the style back after few miliseconds
    		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
    				+ originalStyle + "');},400);", element);

    	}

	
	
}