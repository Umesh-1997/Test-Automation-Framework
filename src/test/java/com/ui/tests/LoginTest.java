package com.ui.tests;

import static com.constants.Browser.CHROME;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;
import com.ui.pojo.User;
import com.utility.LoggerUtility;

@Listeners(com.ui.listeners.TestListener.class)
public class LoginTest extends TestBase {
	
	
	
	

//	@Test(description = "Verifies if valid user is able to login into the application",groups= {"e2e","sanity"},dataProviderClass= com.ui.dataProviders.LoginDataProvider.class,dataProvider = "LoginTestDataProvider")
//	public void loginTest(User user) {
//		
//		Assert.assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(),user.getPassword()).getUserName(),"Umesh Parab");
//		
//	}
//	
//	@Test(description = "Verifies if valid user is able to login into the application",groups= {"e2e","sanity"},dataProviderClass= com.ui.dataProviders.LoginDataProvider.class,dataProvider = "LoginTestCSVDataProvider")
//	public void loginCSVTest(User user) {
//		
//		Assert.assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(),user.getPassword()).getUserName(),"Umesh Parab");
//		
//	}
//	
	
	@Test(description = "Verifies if valid user is able to login into the application",groups= {"e2e","sanity"},dataProviderClass= com.ui.dataProviders.LoginDataProvider.class,dataProvider = "LoginTestCSVDataProvider",
			retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)
	public void loginExcelTest(User user) {
		
		
		Assert.assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(),user.getPassword()).getUserName(),"Umesh Parab");
		
	}

}
//https://tawdevivah.com/index.php?option=com_comprofiler&view=userprofile&user=111162&Itemid=111