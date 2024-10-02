package pageobjects;


import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class NewTab extends BasePage{

	@FindBy(css=".fotorama__arr.fotorama__arr--next .fotorama__arr__arr")
	private WebElement showItemEl;
	
	@FindBy(css=".product-item-link")
	private List<WebElement> listItemsNames;
	
	public NewTab(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void clickItem(String name) {
		
		sleep(2000);
		
		// finding the item's number
		int i = 0;
		for(WebElement el : listItemsNames) {
			i++;
			if(el.getText().equalsIgnoreCase(name)) {
				break;	
			}
		}
		String num = Integer.toString(i);
		

		// create the string element of chosen item by --> child(num)
		String elementStr = "#maincontent > div.columns > div.column.main > div.products.wrapper.grid.products-grid > ol > li:nth-child("+num+")";
		
		WebElement elBtn = driver.findElement(By.cssSelector(elementStr));
		
		// click elBtn and open the item on new tab
	    Actions actions = new Actions(driver);
	    actions.keyDown(Keys.CONTROL).click(elBtn).keyUp(Keys.CONTROL).build().perform();  // For Windows/Linux

	    
	    // Switch to the newly opened tab
	    Set<String> allWindowHandles = driver.getWindowHandles();
	    String originalWindow = driver.getWindowHandle();

	    for (String windowHandle : allWindowHandles) {
	        if (!windowHandle.equals(originalWindow)) {
	            driver.switchTo().window(windowHandle);
	            break;
	        }
	    }
	    
	    sleep(2000);
	    
	    for (int j =0 ; j<3 ;j++) {
	    	sleep(2000);
		    click(showItemEl);
		    
	    }

	    
	    sleep(5000);
	    
	 // Close the new tab
	    driver.close();
	    
	 // Switch back to the original tab
	    driver.switchTo().window(originalWindow);
	    
		//click(showItemEl);
		
	 
		
	}
	
	
	
}
