package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesPage extends BasePage{
	
	@FindBy(css="#ui-id-2 [role='presentation'] a")
	private List<WebElement> listCategories;
	
	
	public CategoriesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public void chooseCategory(String name) {
		sleep(2000);
		for(WebElement el : listCategories) {
			if(el.getText().equalsIgnoreCase(name)) {
				click(el);
				break;	
			}		
		}		
	}
	
	
	
	
	
	
	
	
	

}
