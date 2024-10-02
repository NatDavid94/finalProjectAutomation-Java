package tests;

import org.testng.annotations.Test;

import pageobjects.CategoriesPage;
import pageobjects.CategoryPage;
import pageobjects.LoginPage;
import pageobjects.NewTab;

public class NewTabTest extends BaseTest{
	
	
	@Test(description="login")
	public void tc01_login() {
		
		LoginPage lp = new LoginPage(driver);
		lp.login("ntndavidov7@gmail.com", "Nd12101994");

	}
	
	
	@Test
	public void tc02_chooseCategory() {
		
		CategoriesPage cp = new CategoriesPage(driver);
		cp.chooseCategory("Men");

	}
	
	
	@Test
	public void tc03_chooseShopCategory() {
		
		CategoryPage cp = new CategoryPage(driver);
		cp.chooseShopCategory("Hoodies & Sweatshirts");

	}
	
	
	@Test
	public void tc04_clickForNewTab() {
		
		NewTab nt = new NewTab(driver);
		nt.clickItem("Grayson Crewneck Sweatshirt");
	}
	
	
	@Test
	public void tc05_clickForNewTab() {
		
		NewTab nt = new NewTab(driver);
		nt.clickItem("Hero Hoodie");
	}
	
	
	
}
