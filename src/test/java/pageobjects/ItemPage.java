package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 

public class ItemPage extends BasePage{

	
	@FindBy(css=".swatch-option.text")
	private List<WebElement> listSizes;
	
	
	@FindBy(css=".swatch-option.color")
	private List<WebElement> listColors;
	
	@FindBy(css="#product-addtocart-button")
	private WebElement addToCartBtn;
	             
	@FindBy(css=".action.showcart .counter.qty")
	private WebElement cartPageBtn;
	
	
	@FindBy(css="#top-cart-btn-checkout")
	private WebElement procToCheckout;
	
	
	public ItemPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	public void chooseSize(String size) {
		sleep(2000);
		for(WebElement el : listSizes) {
			System.out.println("size is : " + el.getText()+"\n");
			
			if(el.getText().equalsIgnoreCase(size)) {
				click(el);
				break;	
			}	
		}	
	}
	
	
	public void chooseColor(String color) {
		sleep(2000);
		for(WebElement el : listColors) {
			System.out.println("color is : " + el.getAttribute("option-label")+"\n");
			
			if(el.getAttribute("option-label").equalsIgnoreCase(color)) {
				click(el);
				break;	
			}		
		}	
	}
	
	
	public void addToCart() {	
		click(addToCartBtn);	
		sleep(3000);
	}
	
	
	public void goToCartPage() {
		sleep(2000); 
		click(cartPageBtn);
	}
	
	
	public void goToCheckoutPage() {
		click(procToCheckout);
		sleep(5000);
	}
}
