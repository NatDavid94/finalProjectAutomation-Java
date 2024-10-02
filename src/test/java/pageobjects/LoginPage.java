package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
	
	@FindBy(css="a[href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']")
	private WebElement signInBtn1;
	
	@FindBy(css="#email")
	private WebElement emailEl;
	
	@FindBy(css="[name='login[password]']")
	private WebElement passEl;
	
	@FindBy(css=".action.login.primary")
	private WebElement signInBtn2;
	
	
	@FindBy(css=".message-error > div:nth-child(1)")
	private WebElement errorLabel;
	
	@FindBy(css="#email-error")
	private WebElement emailErrorLabel;
	
	@FindBy(css="#pass-error")
	private WebElement passErrorLabel;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);

	}
	
	
	public void login(String email,String  pass) {
		
		
		sleep(2000);
		click(signInBtn1);
		fillText(emailEl, email);
		fillText(passEl, pass);
		click(signInBtn2);
		
		sleep(2000);

	}
	

	
	//Validation
	
	public String getErrorMsg() {
		
		return getText(errorLabel);
	}
	
	
	// email error
	public String getEmailErrorMsg() {
		
		return getText(emailErrorLabel);
	}
	
 
	// pass error
	public String getPassErrorMsg() {
		
		return getText(passErrorLabel);
	}
	

}
