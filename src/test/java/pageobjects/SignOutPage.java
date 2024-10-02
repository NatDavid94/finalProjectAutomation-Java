package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOutPage extends BasePage{

	@FindBy(css=".panel.header .action.switch")
	private WebElement arrowBtn;
	
	@FindBy(css="[href='https://magento.softwaretestingboard.com/customer/account/logout/']")
	private WebElement signoutBtn;
	
	
	public SignOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void clickSignOut() {
		
		click(arrowBtn);
		sleep(2000);
		click(signoutBtn);
		sleep(7000);
		
	}

}
