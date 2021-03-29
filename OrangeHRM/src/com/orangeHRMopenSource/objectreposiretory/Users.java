package com.orangeHRMopenSource.objectreposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users {
@FindBy(id="btnAdd")
private WebElement addbt;
public Users(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickadd() throws InterruptedException
{
	Thread.sleep(2000);
	addbt.click();
}
}
