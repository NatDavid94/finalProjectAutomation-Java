package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import pageobjects.LoginPage;





public class EmailNotExistErrorFeildTest extends BaseTest{

	

	  @Test(dataProvider="getData", description="use incorect login information")
		public void l1_loginFailed(String email,String password) {
		  
			//login failed
			LoginPage loginPage = new LoginPage(driver);
			//Using the variables we get from the @DataProvider method
			loginPage.login(email, password);
			
			//Should check that we get the right message 
			String expected = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
			String actual = loginPage.getErrorMsg();
			Assert.assertEquals(actual, expected);
 
		} 



		@DataProvider
		public Object[][] getData(){
			Object[][] myData = {
					{"email1@walla.co.il","123"},
					{"email2@gmail.com","123"},
					{"email3@homail.com","1#444"},
					{"email4@outlook.com","secret_sauce"},
					
			};
			return myData;
		}
	
	

	
	
}
