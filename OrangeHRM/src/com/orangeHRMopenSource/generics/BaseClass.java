package com.orangeHRMopenSource.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.orangeHRMopenSource.objectreposiretory.Login;
import com.orangeHRMopenSource.objectreposiretory.logout;

public class BaseClass {
static 

{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
}
public static WebDriver driver;
public Filelib f=new Filelib();
public WebDriverCommonLib w=new WebDriverCommonLib();
@BeforeTest
public void openBrowser()
{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	w.waitForElementInGui(driver);
}
@AfterTest
public void closeBrowser() throws InterruptedException
{
	Thread.sleep(2000);
	driver.close();
}
@BeforeMethod
public void Login() throws IOException
{
	Login l=new Login(driver);
	String un=f.getPropertyValue("UN");
	String pw=f.getPropertyValue("PWD");
	driver.get(f.getPropertyValue("URL"));
	l.setusername(un);
	l.setpassword(pw);
	l.clicklogin();
}
@AfterMethod
public void Logout() throws InterruptedException
{
	logout lo=new logout(driver);
	Thread.sleep(2000);
	lo.welcome();
}





}
