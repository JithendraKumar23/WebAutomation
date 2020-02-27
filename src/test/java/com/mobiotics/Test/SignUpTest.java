package com.mobiotics.Test;

import org.testng.annotations.Test;

import com.mobiotics.Constant.BaseTest;
import com.mobiotics.Page.EnterDetailPage;
import com.mobiotics.Page.GendeAndLocationPopUpPage;
import com.mobiotics.Page.HamburgerMenuPage;
import com.mobiotics.Page.HomePage;
import com.mobiotics.Page.LookupPage;
import com.mobiotics.Page.PayPage;
import com.mobiotics.Page.SelectPackPage;

public class SignUpTest extends BaseTest{
	
	
	@Test
	public void lookuppage_login() throws InterruptedException
	{
	HomePage homepage = new HomePage(driver1);
	HamburgerMenuPage hamburgermenu = new HamburgerMenuPage(driver1);
	LookupPage lookuppage = new LookupPage(driver1);
	SelectPackPage selectpackpage = new SelectPackPage(driver1);
	EnterDetailPage enterdetailpage = new EnterDetailPage(driver1);
	
	PayPage paypage = new PayPage(driver1);
	
	GendeAndLocationPopUpPage genandloc = new GendeAndLocationPopUpPage(driver1);
	
	
	
	
	homepage.clickOnHambergermenu();
	hamburgermenu.clickOnSigninButton();
	
	lookuppage.setUserName(UN);
	lookuppage.clickToProceed();
	selectpackpage.clickOnSelectPack();
	enterdetailpage.setNewPassword(PW);
	enterdetailpage.selectAgeRange();
	
	paypage.clickBackFromPayPage();
	
	selectpackpage.clickBackFromSelectpackPage();

	genandloc.FillGenAndLocationPoppu();
	
	
	
	
	}
	

}