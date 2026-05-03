package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class LoginPage extends BrowserUtility {

	static final By Email_Text_Box_Locator = By.xpath("//input[@id=\"email\"]");
	static final By Password_Text_Box_Locator = By.xpath("//input[@id=\"passwd\"]");
	static final By Submit_Button_Locator = By.xpath("//button[@id=\"SubmitLogin\"]"); 
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	public MyAccountPage doLoginWith(String emailAddress,String password) {
		enterText(Email_Text_Box_Locator, emailAddress);
		enterText(Password_Text_Box_Locator, password);
		clickOn(Submit_Button_Locator);
		MyAccountPage myAccountPage = new MyAccountPage(getDriver());
		return myAccountPage;
	}

}
