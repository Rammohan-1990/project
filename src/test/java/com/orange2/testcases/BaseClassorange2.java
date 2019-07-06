package com.orange2.testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.Loader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.configuration.Config;
import com.orange2.utility.Readconfigproperty;

public class BaseClassorange2 {
	
	 Readconfigproperty config=new Readconfigproperty();

	public String baseurl   = config.getApplicationURL();
    public String username   = config.getusername();
	public String password  =  config.getpassword();
	public static WebDriver driver;
	
	
	 
	public static Logger logger;
	
	
    @Test
	@BeforeClass
	@Parameters("browser")
    public void setup (String browser) {
			 
       if(browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver",config.getchromedriver());
	   driver= new ChromeDriver();
		 }
       else  if(browser.equalsIgnoreCase("firefox")) {
    		System.setProperty("webdriver.gecko.driver",config.getfirefoxdriver());
    		   driver= new FirefoxDriver();
    			 }
       else  if(browser.equalsIgnoreCase("ie")) {
   		System.setProperty("webdriver.ie.driver",config.getiedriver());
   		   driver= new InternetExplorerDriver();
   			 }
       logger = logger.getLogger("orange2");
		 PropertyConfigurator.configure("log4j.properties");	 	 
		 
	}
       	   
	 
	   
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
}
