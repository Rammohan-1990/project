package com.orange2.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class loginpage {

	public WebDriver ldriver;
	
	public loginpage(WebDriver rdriver){
		
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
		
	}

	@FindBy(id="txtUsername")
	WebElement txtemail;
	
	
	@FindBy(id="txtPassword")
	WebElement  txtpassword;
	
	@FindBy(id ="btnLogin")
	WebElement btnlogin;	
	
	@FindBy(id ="welcome")
	WebElement btnwelcome;	
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement btnlogout;	

	
	
	public void setusername(String uname) {
		txtemail.sendKeys(uname);
             
	}
	
	public void setpassword(String pwd) {
		txtpassword.sendKeys(pwd);
             
	}
	public void clicklogin() {
		btnlogin.click();
             
	}
	
	public void welcome() {
		btnwelcome.click();
	
	}
	
	public void clicklogout() {
		Actions actions = new Actions(ldriver);
		actions.moveToElement(btnwelcome).build().perform();
		btnlogout.click();
	
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	

