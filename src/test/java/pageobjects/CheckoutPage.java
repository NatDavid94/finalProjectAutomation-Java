package pageobjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CheckoutPage extends BasePage{

	@FindBy(css="[name='firstname']")
	private WebElement firstName;
	
	@FindBy(css="[name='lastname']")
	private WebElement lastName;
	
	@FindBy(css="[name='company']")
	private WebElement company;
	
	@FindBy(css="[name='street[0]']")
	private WebElement street0;
	
	@FindBy(css="[name='street[1]']")
	private WebElement street1;
	
	@FindBy(css="[name='street[2]']")
	private WebElement street2;
	
	@FindBy(css="[name='city']")
	private WebElement city;
	
	@FindBy(css="[name='postcode']")
	private WebElement postcode;
	
	@FindBy(css="[name='telephone']")
	private WebElement telephone;
	
	@FindBy(css=".radio")
	private List<WebElement> listRadio;
	
	@FindBy(css="[data-bind=\"i18n: 'Next'\"]")
	private WebElement nextBtn;
	
	@FindBy(css=".action.action-show-popup")
	private WebElement newAddress;
	
	@FindBy(css=".action.primary.action-save-address")
	private WebElement shipHere;
	
	@FindBy(css="[name='region']")
	private WebElement stateEl;
	
	@FindBy(css="[name='country_id']")
	private WebElement countryDropdown;
	
	
	@FindBy(css=".action.primary.checkout")
	private WebElement placeOrder;
	
	@FindBy(css=".action.primary.continue")
	private WebElement continueShop;
	
	
	
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void clickNewAddress() {	
		sleep(2000);
		click(newAddress);	
	}
	

	public void fillCredentails(String fname,String lname,String cmpy,String st0,String st1 ,String st2,String cty,String stateProvince,String pstcd,String country,String tlph) {
		
		sleep(2000);

		fillText(firstName, fname);
		fillText(lastName, lname);
		fillText(company, cmpy);
		fillText(street0, st0);
		fillText(street1, st1);
		fillText(street2, st2);
		fillText(city, cty);

		Select selectCountry = new Select(countryDropdown);
		selectCountry.selectByVisibleText(country);
		
		fillText(stateEl, stateProvince);
		fillText(postcode, pstcd);
		fillText(telephone, tlph);
	
	}
	
	public void clickshipHere() {		
		click(shipHere);
	}
	
	public void chooseRadio(String radioName) {
		//value="tablerate_bestway"
		//value="flatrate_flatrate"
		for(WebElement el : listRadio) {			
			if(el.getAttribute("value").equalsIgnoreCase(radioName)) {
				click(el);
				break;	
			}	
		}	
	}
	

	public void clickNext() {
		click(nextBtn);
		
	}
	
	
	public void clickPlaceOrder() {
		click(placeOrder);		
		sleep(10000);
	}	
	
	
	
	
	public void clickContinueShop() {
		click(continueShop);
	}
	
}
