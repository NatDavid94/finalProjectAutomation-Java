package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LoginPage;

public class emptyCredentialsFieldsTest extends BaseTest{

	
	
	  @Test(dataProvider="getData", description="use incorect login information")
		public void l1_loginFailed(String email,String password) {
		  
			//login failed
			LoginPage loginPage = new LoginPage(driver);
			//Using the variables we get from the @DataProvider method
			loginPage.login(email, password);
			
			//Should check that we get the right message 
			String expectedEmailError = "This is a required field.";
			String actualEmailError = loginPage.getEmailErrorMsg();
			Assert.assertEquals(actualEmailError, expectedEmailError);
			
			String expectedPassError = "This is a required field.";
			String actualPassError = loginPage.getPassErrorMsg();
			Assert.assertEquals(actualPassError, expectedPassError);


		} 


	  
	
		@DataProvider
		public Object[][] getData(){
			Object[][] myData = {
					{"",""},

					
			};
			return myData;
		}
}
