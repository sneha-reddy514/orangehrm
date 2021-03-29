package com.orangeHRMopenSource.objectreposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {
	WebDriver driver;
	
	@FindBy(id="menu_admin_viewAdminModule")
	private WebElement adminbt;
	@FindBy(id="menu_admin_UserManagement")
	private WebElement usermanage;
	@FindBy(id="menu_admin_viewSystemUsers")
	private WebElement userlink;
	
	
	public Admin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void useradmin(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(adminbt).perform();
	}	
	public void userManager(WebDriver driver) throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(usermanage).perform();
		Thread.sleep(2000);
	}
	public void userClick(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(userlink).click().perform();
		
	}
	
	
	
}