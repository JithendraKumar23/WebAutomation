package com.mobiotics.Constant;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

import com.mobiotics.Page.LookupPage;

import generic.Property;

public class BaseTest implements AutomationConstant {
	public static WebDriver driver1;
	
	public static String URL;
	public static String UN;
	public static String PW;
	public static String homePageURL;
	public static String loginPageURL;
	
	
	
	public void initFrameWork() {
		URL=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "URL");
		UN=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "UN");
		PW=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "PW");
	    }
	
	@BeforeSuite
	public void initApplication() throws Exception {
		System.setProperty(CHROME_KEY, DRIVER_PATH + CHROME_FILE);
		ChromeOptions options= new ChromeOptions();
		ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File(DRIVER_PATH)).usingAnyFreePort().build();
		driver1 = new ChromeDriver(service, options);
		initFrameWork();
		//System.out.println(URL+"\n"+UN+"\n"+"PW");

        //driver1.manage().window().maximize();
        driver1.get(URL);
        //preCondition();
	}
	
	public void preCondition() throws Exception {
			LookupPage loginpage=new LookupPage(driver1);
			System.out.println(URL);
			Thread.sleep(5000);
			loginpage.setUserName(UN);
			loginpage.clickToProceed();
			Thread.sleep(5000);		
	}
}