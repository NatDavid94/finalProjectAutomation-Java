package tests;

import org.testng.annotations.Test;

import pageobjects.CategoriesPage;
import pageobjects.CategoryPage;
import pageobjects.CheckoutPage;
import pageobjects.ChooseItem;
import pageobjects.ItemPage;
import pageobjects.LoginPage;




public class BuyProductTest extends BaseTest{
	
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
		cp.chooseShopCategory("Jackets");

	}
	
	
	@Test
	public void tc04_chooseItem() {
		
		ChooseItem ci = new ChooseItem(driver);
		ci.chooseItem("Mars HeatTech™ Pullover"); 

	}
	
	
	@Test
	public void tc05_chooseSizeItem() {
		
		ItemPage itp = new ItemPage(driver);
		itp.chooseSize("L");
 
	}
	
	
	@Test
	public void tc06_chooseColorItem() {
		
		ItemPage itp = new ItemPage(driver); 
		itp.chooseColor("Black");
 
		
		

	}
	
	@Test
	public void tc07_addToCart() {
		
		ItemPage itp = new ItemPage(driver); 
		itp.addToCart();	
	}
	
	
	@Test
	public void tc08_goToCartPage() {
		ItemPage itp = new ItemPage(driver); 
		itp.goToCartPage();	
		
	}
	
	
	@Test
	public void tc09_goToCheckoutPage() {
		
		ItemPage itp = new ItemPage(driver); 
		itp.goToCheckoutPage();	
		
	}
	
	
	@Test
	public void tc10_newAddress() {
		
		CheckoutPage chp = new CheckoutPage(driver);
 		chp.clickNewAddress();
 		
	}
	
	
	
	@Test
	public void tc11_fillCreChecklou() {
		
		CheckoutPage chp = new CheckoutPage(driver);
		chp.fillCredentails("Nat", "Dav", "Intel", "Ako", "Jer", "15", "ako", "North","17362","Israel", "0546709393");
		chp.clickshipHere();
		sleep(2000);
	}
	
//	@Test
	public void tc12_choosRadio() {
		CheckoutPage chp = new CheckoutPage(driver);
		chp.chooseRadio("flatrate_flatrate");

	}
	
	
	@Test
	public void tc13_clickNext() {
		
		CheckoutPage chp = new CheckoutPage(driver);
		chp.clickNext();
		sleep(4000);
		
	}
	
	
	
	@Test
	public void tc14_clickPlaceOrder() {
 		CheckoutPage chp = new CheckoutPage(driver);
		chp.clickPlaceOrder();
		
	}
	
	@Test
	public void tc15_clickContinueShop() {
		
		CheckoutPage chp = new CheckoutPage(driver);
		chp.clickContinueShop();
		sleep(10);
		
	}
	
}
