package pageobjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage extends BasePage{
	
	
	@FindBy(css=".action.viewcart")
	private WebElement viewCartBtn;
	
	@FindBy(css=".action.action-delete")
	private WebElement deleteItemBtn;
	
	@FindBy(css=".action.action-delete")
	private List<WebElement> deleteItemList;
	
	// for choosing and identifying the item
	@FindBy(css=".item-info .product-item-name")
	private List<WebElement> itemNamesList;
	// adding every item to allProducts list
	public List<List<String>> allProducts = new ArrayList<>();

	
	
	
	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void clickViewCartPage() {		
		click(viewCartBtn);
		sleep(2000);
	}
	
	
	
	public void compareItemsNames(List<List<String>> allProductsAdded) {
		sleep(2000);

        
		int countInt =3 ; //count of element start with '3'
		// adding the item's product list to list - allProducts
		for(WebElement el : itemNamesList) {
			
			String countStr = Integer.toString(countInt); // casting to string
			
			String itemEl = "#shopping-cart-table > tbody:nth-child("+countStr+") > tr.item-info > td.col.item > div";
			String valueEl = itemEl+" dl.item-options dd"; // list of values
 
			
			List<String> productInfo = new ArrayList<>();// create list of product
			productInfo.add("Product Name: "+el.getText()); // add the Product Name
			
			// create list of values for example : M(size) , Red(Color)
			List<WebElement> valuesList = driver.findElements(By.cssSelector(valueEl));
			
			// There are items that don't have size and color
            if (!valuesList.isEmpty()) {
        		productInfo.add("Size: "+valuesList.get(0).getText());
        		productInfo.add("Color: "+valuesList.get(1).getText());
            }
            // add the product to products list
            allProducts.add(productInfo);
            

    		countInt++; // increasing counter
    		
 			}
		
		
		// print allProducts list
        for (List<String> product : allProducts) {
            for (String info : product) {
                System.out.println(info);
            }
            System.out.println("----------------------");
        }
		
		
		
		
		// sort the allProductsAdded that we got on parameter
		allProductsAdded.sort(Comparator.comparing(list -> list.get(0)));
		// sort the allProducts that we create now
		allProducts.sort(Comparator.comparing(list -> list.get(0)));
		
		
		// *** testing ***
        // comparing between the lists
        Assert.assertEquals(allProductsAdded, allProducts);
		
		}
	
	
   
	public void deleteItems() {
		
		int size_of_list = deleteItemList.size();
		
		for(int i =0;i <size_of_list;i++) {
			
			click(deleteItemBtn);
			sleep(4000);
		}
		
		
		
	
	}
	 

}
