package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseItem extends BasePage{

	@FindBy(css=".product-item-link")
	private List<WebElement> listItems;
	
	
	
	public ChooseItem(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void chooseItem(String name) {
		
		for(WebElement el : listItems) {
			if(el.getText().equalsIgnoreCase(name)) {
				click(el);
				break;	
			}		
		}	
	}

}
