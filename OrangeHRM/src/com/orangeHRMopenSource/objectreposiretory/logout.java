package com.orangeHRMopenSource.objectreposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
@FindBy(id="welcome")
private WebElement wel;
@FindBy(xpath="//a[.='Logout']")
private WebElement logout;
public logout(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void welcome()
{
	wel.click();
	logout.click();
}
}
