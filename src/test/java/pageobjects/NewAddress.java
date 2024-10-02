package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewAddress extends BasePage{

	@FindBy(css="[role='add-address']")
	private WebElement addNewAddress;
	
	@FindBy(css="#firstname")
	private WebElement fName;
	
	@FindBy(css="#lastname")
	private WebElement lName;
	
	@FindBy(css="#company")
	private WebElement companyName;
	
	@FindBy(css="#telephone")
	private WebElement telNumber;
	
	@FindBy(css="#street_1")
	private WebElement streetEl;	
	
	@FindBy(css="#city")
	private WebElement cityEl;
	
	@FindBy(css="#region")
	private WebElement regionEl;
	
	@FindBy(css="#zip")
	private WebElement zipEl;
	
	@FindBy(css="#country")
	private WebElement countryDropdown;
	
	@FindBy(css=".action.save.primary")
	private WebElement saveAddressBtn;
	
	
	public NewAddress(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void clickAddNewAddress() {
		sleep(3000);
		click(addNewAddress);
		sleep(4000);
	}
	
	
	public void fillCredentials(String firstName,String lastName,String company,String tel,String street,String city,String region,String zip,String country) {
		
		fillText(fName, firstName);
		fillText(lName, lastName);
		fillText(companyName, company);
		fillText(telNumber, tel);
		
		Select selectCountry = new Select(countryDropdown);
		selectCountry.selectByVisibleText(country);
		
		fillText(streetEl, street);
		fillText(cityEl, city);
		fillText(regionEl, region);
		fillText(zipEl, zip);
		
	}
	
	public void clickSaveAddress() {
		click(saveAddressBtn);
		sleep(2000);
	}
	

}
