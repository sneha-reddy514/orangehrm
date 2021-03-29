package com.orangeHRMopenSource.objectreposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
@FindBy(id="txtUsername")
private WebElement usertbox;
@FindBy(id="txtPassword")
private WebElement pwdtbox;
@FindBy(id="btnLogin")
private WebElement loginbt;

public Login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void setusername(String un)
{
	usertbox.sendKeys(un);	
}
public void setpassword(String pwd)
{
	pwdtbox.sendKeys(pwd);	
}
public void clicklogin()
{
	loginbt.click();
}
}
