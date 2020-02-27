package com.mobiotics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.Constant.BaseTest;

public class LookupPage extends BasePage{
	public LookupPage(WebDriver driver1)
	{
		super(driver1);
		PageFactory.initElements(BaseTest.driver1, this);
	}
	@FindBy(xpath="//*[@id='journey-email-lookup']")
	private WebElement userName;
	@FindBy(xpath="//div/button[@class='button-design grad-btn btn']")
	private WebElement btnLogin;
	
	public void setUserName(String UserName)
	{
		
		waitTillTheElementVisible(userName);
		userName.sendKeys(UserName);
	}
	public void clickToProceed() 
	{
		waitTillElementIsClickable(btnLogin);
		btnLogin.click();
	}
}