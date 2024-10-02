package tests;

import org.testng.annotations.Test;

import pageobjects.CartPage;
import pageobjects.ItemPage;
import pageobjects.LoginPage;

public class DeleteItemTest extends BaseTest{

	@Test(description="login")
	public void tc01_login() {
		
		LoginPage lp = new LoginPage(driver);
		lp.login("ntndavidov7@gmail.com", "Nd12101994");

	}
	
	@Test
	public void tc02_goToCartPage() {
		ItemPage itp = new ItemPage(driver); 
		itp.goToCartPage();	
		
	}
	
	@Test
	public void tc03_viewCartPage() {
		CartPage crp = new CartPage(driver); 
		crp.clickViewCartPage();

	}
	
	@Test
	public void tc04_deleteItems() {
		CartPage crp = new CartPage(driver); 
		crp.deleteItems();

	}
	
}
