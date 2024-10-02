package tests;

import org.testng.annotations.Test;

import pageobjects.DeleteAddress;
import pageobjects.LoginPage;

public class DeleteAddressTest extends BaseTest{
	
	
	@Test(description="login")
	public void tc01_login() {
		
		LoginPage lp = new LoginPage(driver);
		lp.login("ntndavidov7@gmail.com", "Nd12101994");

	}
	
	@Test
	public void tc02_goToAddresses() {
		
		DeleteAddress da =new DeleteAddress(driver);
		da.goToAdrressPage();

	}
	
	
	@Test
	public void tc03_delAddresses() {
		
		DeleteAddress da =new DeleteAddress(driver);
		da.deleteAdress();

	}
	

}
