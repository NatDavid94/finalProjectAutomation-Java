package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage{
	
	@FindBy(css=".sidebar.sidebar-main .item a")
	private List<WebElement> ShopByCategory;
	
	public CategoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void chooseShopCategory(String name) {
		
		for(WebElement el : ShopByCategory) {
			if(el.getText().equalsIgnoreCase(name)) {
				click(el);
 				break;	
			}	
			 
		}
		
	

}

	
	
}