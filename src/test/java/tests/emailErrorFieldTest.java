package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LoginPage;

public class emailErrorFieldTest extends BaseTest{
	
	
	  @Test(dataProvider="getData", description="use incorect email login")
		public void l1_loginFailed(String email,String password) {
		  
			//login failed
			LoginPage loginPage = new LoginPage(driver);
			//Using the variables we get from the @DataProvider method
			loginPage.login(email, password);
			
			//Should check that we get the right message 
			String expected = "Please enter a valid email address (Ex: johndoe@domain.com).";
			String actual = loginPage.getEmailErrorMsg();
			Assert.assertEquals(actual, expected);

		} 


		@DataProvider
		public Object[][] getData(){
			Object[][] myData = {
					{"IncorectEmail1","123"},
					{"Gudsds","123"},
					{"%TDSF#@EDD","1#444"},
					{"hffg@.c","rrrxca"},
					
			};
			return myData;
		}
}
