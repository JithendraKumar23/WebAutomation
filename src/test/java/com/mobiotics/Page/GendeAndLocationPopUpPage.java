package com.mobiotics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.Constant.BaseTest;

public class GendeAndLocationPopUpPage extends BasePage{
	
	public GendeAndLocationPopUpPage(WebDriver driver1)
	{
		super(driver1);
		PageFactory.initElements(BaseTest.driver1,this);	
	}
	
	@FindBy(xpath="(//*[@id='ch-state-slct']/div/div/div[1]/div/ul/li[2]/label)[1]")
	private WebElement selectFemaleOption;
	
	@FindBy(xpath="(//*[@id='ch-state-slct1]/div/div/div[3]/select)[1]")
	private WebElement selectLocation;
	
	public void FillGenAndLocationPoppu()
	{
		waitTillElementIsClickable(selectFemaleOption);
		selectFemaleOption.click();
		
		selectLocation.click();
	}

}
