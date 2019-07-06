package com.orange2.testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orange2.pageobject.loginpage;

public class TC_LOGINTEST_001 extends  BaseClassorange2 {
	
	
	
	@Test
	public void logintest() throws Exception {
		
		driver.get(baseurl);
		logger.info("url is opended...........");
		
		
		
		loginpage lp=new loginpage(driver);
		
		lp.setusername(username);
		logger.info("username entered...........");
		
		lp.setpassword(password);
		logger.info("password entered...........");
		
		lp.clicklogin();
		logger.info("clicked on loginbutton...........");
		
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("OrangeHRM")) {
			Assert.assertTrue(true);
	
	  logger.info("login sucssfully.............");
	  
		}
		
		Thread.sleep(3000);
		
		lp.welcome();
		logger.info("clicked on welcom button......");
		
		
		Thread.sleep(3000);
		lp.clicklogout();
		logger.info("clicked on log out button...........");
		
	}
		
}
