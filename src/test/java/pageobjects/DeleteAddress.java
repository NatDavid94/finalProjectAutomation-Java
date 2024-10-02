package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAddress extends BasePage{

	
	@FindBy(css=".panel.header .action.switch")
	private WebElement settingsBtn;
	
	@FindBy(css="a[href='https://magento.softwaretestingboard.com/customer/account/']")
	private WebElement myAccount;
	
	@FindBy(css="a[href='https://magento.softwaretestingboard.com/customer/address/']")
	private WebElement addressBook;
	
	@FindBy(css="[role='delete-address']")
	private List<WebElement> listDeleteBtn;
	
	@FindBy(css="[role='delete-address']")
	private WebElement DeleteBtn;
	
	// [role='delete-address']  .action.delete
	
	@FindBy(css=".action-primary.action-accept")
	private WebElement okBtn;
	
	public DeleteAddress(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void goToAdrressPage() {
		sleep(2000);
		click(settingsBtn);
		sleep(2000);
		click(myAccount);
		sleep(2000);
		click(addressBook);
		
	}
	
	
	
	public void deleteAdress() {
		
		sleep(2000);
        int listSize = listDeleteBtn.size();

		for(int i =0;i<listSize;i++) {

			click(DeleteBtn);
			sleep(1000);
			click(okBtn);
			sleep(5000);
			
		}
		
		
	}
	
	
	
	
	
}
