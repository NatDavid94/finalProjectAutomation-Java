package tests;

import org.testng.annotations.Test;

import pageobjects.DeleteAddress;
import pageobjects.LoginPage;
import pageobjects.NewAddress;

public class NewAddressTest extends BaseTest{
	
	
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
	public void tc03_clickNewAddress() {
		
		NewAddress na =new NewAddress(driver);
		na.clickAddNewAddress();
	}
	
	
	@Test
	public void tc04_fillCredentials() {
		
		NewAddress na =new NewAddress(driver);
		na.fillCredentials("Nat","Dav","Philips","050-62648324","Burla","Haifa","North","753264","Israel");
	}
	
	
	@Test
	public void tc05_clickSaveAddress() {
		
		NewAddress na =new NewAddress(driver);
		na.clickSaveAddress();
	}
}
