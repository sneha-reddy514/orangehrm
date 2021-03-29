package com.orangeHRMopenSource.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orangeHRMopenSource.objectreposiretory.Admin;
import com.orangeHRMopenSource.objectreposiretory.Login;

public class HRM {
static{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	Login lp=new Login(driver);
	lp.setusername("admin");
	Thread.sleep(2000);
	lp.setpassword("admin123");
	lp.clicklogin();
	Thread.sleep(2000);
	Admin ad=new Admin(driver);
	ad.useradmin(driver);
	
}
}
