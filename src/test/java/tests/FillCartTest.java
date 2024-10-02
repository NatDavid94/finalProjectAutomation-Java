package tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import pageobjects.CartPage;
import pageobjects.CategoriesPage;
import pageobjects.CategoryPage;
import pageobjects.ItemPage;
import pageobjects.ItemsPage;
import pageobjects.LoginPage;
import pageobjects.SignOutPage;



public class FillCartTest extends BaseTest{

	public List<List<String>> allProducts = new ArrayList<>();

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
		
		List<String> productInfo = new ArrayList<>();
		productInfo.add("Product Name: "+"Ariel Roll Sleeve Sweatshirt");
		productInfo.add("Size: "+"M");
		productInfo.add("Color: "+"Green");
		allProducts.add(productInfo);
			
	}
	

	
	
	
	@Test
	public void tc05_chooseItem2() {
		
		ItemsPage itp = new ItemsPage(driver);
		itp.chooseItem("Phoebe Zipper Sweatshirt","XL", "Purple");
		
		List<String> productInfo = new ArrayList<>();
		productInfo.add("Product Name: "+"Phoebe Zipper Sweatshirt");
		productInfo.add("Size: "+"XL");
		productInfo.add("Color: "+"Purple");
		allProducts.add(productInfo);

	}
	 
	
	@Test
	public void tc06_chooseItem3() {
	
		ItemsPage itp = new ItemsPage(driver);
		itp.chooseItem("Hera Pullover Hoodie","M", "Orange");
		
		List<String> productInfo = new ArrayList<>();
		productInfo.add("Product Name: "+"Hera Pullover Hoodie");
		productInfo.add("Size: "+"M");
		productInfo.add("Color: "+"Orange");
		allProducts.add(productInfo);

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
		
		List<String> productInfo = new ArrayList<>();
		productInfo.add("Product Name: "+"Lono Yoga Short");
		productInfo.add("Size: "+"33");
		productInfo.add("Color: "+"Red");
		allProducts.add(productInfo);
	 

			
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
		
		List<String> productInfo = new ArrayList<>();
		productInfo.add("Product Name: "+"Quest Lumaflex™ Band");
		allProducts.add(productInfo);

	}
	
	

	
	@Test
	public void tc13_signoutFromAcoount() {
		
		SignOutPage sgo = new SignOutPage(driver);
		sgo.clickSignOut();
	
	}
	
	
	@Test(description="login")
	public void tc14_login() {
		
		LoginPage lp = new LoginPage(driver);
		lp.login("ntndavidov7@gmail.com", "Nd12101994");
		
 	}
	
	@Test
	public void tc15_goToCartPage() {
		ItemPage itp = new ItemPage(driver); 
		itp.goToCartPage();	
		
	}
	
	@Test
	public void tc16_viewCartPage() {
		CartPage crp = new CartPage(driver); 
		crp.clickViewCartPage();
		crp.compareItemsNames(allProducts);
		
	}
	
	
	
}
