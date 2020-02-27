package com.mobiotics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.Constant.BaseTest;

public class HamburgerMenuPage extends BasePage{
	public HamburgerMenuPage(WebDriver driver1)
	{
		super(driver1);
		PageFactory.initElements(BaseTest.driver1, this);
	}

	@FindBy(xpath="//div[@id='hamburger-signin-button']")
	private WebElement signInButton;
	
	public void clickOnSigninButton()
	{
		waitTillElementIsClickable(signInButton);
		signInButton.click();
	}
	
	
	
	

}
