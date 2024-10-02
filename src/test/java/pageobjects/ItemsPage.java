package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class ItemsPage extends BasePage{
		
	@FindBy(css=".product-item-link")
	private List<WebElement> listItemsNames;
	

	public ItemsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void chooseItem(String name,String size,String color) {
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
    
		// create listSizesEl Element
		String listSizesStr = elementStr + " .swatch-option.text";
		  
		List<WebElement> listSizesEl = driver.findElements(By.cssSelector(listSizesStr));
		    
		// create listColorsEl Element
	  	String listColorssStr = elementStr + " .swatch-option.color";
			  
		List<WebElement> listColorsEl = driver.findElements(By.cssSelector(listColorssStr));
				
		// create addToCartBtn Element
		String addToCartStr = elementStr + " .action.tocart.primary";
				
		WebElement addToCartBtn = driver.findElement(By.cssSelector(addToCartStr));
		    
		    

        // choose the required size  
  		for(WebElement el : listSizesEl) {
			
			if(el.getText().equalsIgnoreCase(size)) {
				click(el);
				break;	
			}	
		}	
  		
  		
  		
  		// choose the required color  
		for(WebElement el : listColorsEl) {			
			if(el.getAttribute("option-label").equalsIgnoreCase(color)) {
				click(el);
				break;	
			}		
		}	
		
		// click addToCartBtn
		click(addToCartBtn);
		
		
		
		
		
	}
	
	public void chooseItemNoDress(String name) {
		
		sleep(2000);
		
		Actions actions = new Actions(driver);

		
		// finding the item's number
		int i = 0;
		for(WebElement el : listItemsNames) {
			i++;
			if(el.getText().equalsIgnoreCase(name)) {
				// move the mouse on the item for identifying the button 
				actions.moveToElement(el).perform();
				break;	
			}
		}
		String num = Integer.toString(i);
 
		

		// create the string element of chosen item by --> child(num)
		String elementStr = "#maincontent > div.columns > div.column.main > div.products.wrapper.grid.products-grid > ol > li:nth-child("+num+")";
		

		// create addToCartBtn Element
		String addToCartStr = elementStr + " .action.tocart.primary";
				
		WebElement addToCartBtn = driver.findElement(By.cssSelector(addToCartStr));
		
		// click addToCartBtn
				click(addToCartBtn);
		
	}
	
	
	
}

