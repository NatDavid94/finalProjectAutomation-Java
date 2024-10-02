package tests;

import org.testng.annotations.Test;

import pageobjects.CategoriesPage;
import pageobjects.CategoryPage;
import pageobjects.CheckoutPage;
import pageobjects.ItemPage;
import pageobjects.ItemsPage;
import pageobjects.LoginPage;




public class BuyProductsTest extends BaseTest{
	
	@Test(description="login")
	public void tc01_login() {
		
		LoginPage lp = new LoginPage(driver);
		lp.login("ntndavidov7@gmail.com", "Nd12101994");

	}
	
	
	
	@Test
	public void tc02_chooseCategory() {
		
		CategoriesPage cp = new CategoriesPage(driver);
		cp.chooseCategory("Women");

	}
	
	
	@Test
	public void tc03_chooseShopCategory() {
		
		CategoryPage cp = new CategoryPage(driver);
		cp.chooseShopCategory("Hoodies & Sweatshirts");

	}
	
	
	@Test
	public void tc04_chooseItem1() {
		
		ItemsPage itp = new ItemsPage(driver);
		itp.chooseItem("Ariel Roll Sleeve Sweatshirt","M", "Green");
			
	}
	

	
	
	
	@Test
	public void tc05_chooseItem2() {
		
		ItemsPage itp = new ItemsPage(driver);
		itp.chooseItem("Phoebe Zipper Sweatshirt","XL", "Purple");

	}
	 
	
	@Test
	public void tc06_chooseItem3() {
	
		ItemsPage itp = new ItemsPage(driver);
		itp.chooseItem("Hera Pullover Hoodie","M", "Orange");

	}
	
	@Test
	public void tc07_chooseCategory() {
		
		CategoriesPage cp = new CategoriesPage(driver);
		cp.chooseCategory("Men");

	}
	 
	
	@Test
	public void tc08_chooseShopCategory() {
		
		CategoryPage cp = new CategoryPage(driver);
		cp.chooseShopCategory("Bottoms");

	}
	
	@Test
	public void tc09_chooseItem4() {
		
		ItemsPage itp = new ItemsPage(driver);
		itp.chooseItem("Lono Yoga Short","33", "Red");
			
	}
	
	
	
	
	
	@Test
	public void tc10_chooseCategory() {
		
		CategoriesPage cp = new CategoriesPage(driver);
		cp.chooseCategory("Gear");

	}
	
	
	
	@Test
	public void tc11_chooseCategory() {
		
		CategoryPage cp = new CategoryPage(driver);
		cp.chooseShopCategory("Fitness Equipment");

	}
	
	@Test
	public void tc12_chooseItem5() {
		
		ItemsPage itp = new ItemsPage(driver);
		itp.chooseItemNoDress("Quest Lumaflex™ Band");
			
	}
	
	
	@Test
	public void tc13_goToCartPage() {
		ItemPage itp = new ItemPage(driver); 
		itp.goToCartPage();	
		
	}
	
	
	@Test
	public void tc14_goToCheckoutPage() {
		
		ItemPage itp = new ItemPage(driver); 
		itp.goToCheckoutPage();	
		
	}
	
	
	@Test
	public void tc15_newAddress() {
		
		CheckoutPage chp = new CheckoutPage(driver);
 		chp.clickNewAddress();
 		
	}
	
	
	
	@Test
	public void tc16_fillCreChecklou() {
		
		CheckoutPage chp = new CheckoutPage(driver);
		chp.fillCredentails("Nat", "Dav", "Intel", "Ako", "Jer", "15", "ako", "North","17362","Israel", "0546709393");
		chp.clickshipHere();
		sleep(2000);
	}
	
		
	
	@Test
	public void tc17_clickNext() {
		
		CheckoutPage chp = new CheckoutPage(driver);
		chp.clickNext();
		sleep(4000);
		
	}
	
	
	
	@Test
	public void tc18_clickPlaceOrder() {
 		CheckoutPage chp = new CheckoutPage(driver);
		chp.clickPlaceOrder();
		
	}
	
	@Test
	public void tc19_clickContinueShop() {
		
		CheckoutPage chp = new CheckoutPage(driver);
		chp.clickContinueShop();
	}
	
	
}
