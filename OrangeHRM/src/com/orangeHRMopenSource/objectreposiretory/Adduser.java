package com.orangeHRMopenSource.objectreposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Adduser {
@FindBy(id="systemUser_userType")
private WebElement userrolld;
@FindBy(id="systemUser_employeeName_empName")
private WebElement empname;
@FindBy(id="systemUser_userName")
private WebElement uname;
@FindBy(id="systemUser_status")
private WebElement statusd;
@FindBy(id="systemUser_password")
private WebElement password;
@FindBy(id="systemUser_confirmPassword")
private WebElement conpwd;
@FindBy(id="btnSave")
private WebElement savebt;
public Adduser(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void setusertype(int index1)
{
	Select s=new Select(userrolld);
	s.selectByIndex(index1);
}
public void ename(String name){
	empname.sendKeys(name);
}
public void username(String um)
{
	uname.sendKeys(um);	
}
public void status(int index2){
	Select s=new Select(statusd);
	s.selectByIndex(index2);
}
public void pass(String pword)
{
	password.sendKeys(pword);
	
}
public void conpass(String cpass)
{
	conpwd.sendKeys(cpass);
}
public void saved()
{
	savebt.click();	
}
}
