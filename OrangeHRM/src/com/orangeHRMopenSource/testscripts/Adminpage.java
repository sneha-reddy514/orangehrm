package com.orangeHRMopenSource.testscripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHRMopenSource.generics.BaseClass;
import com.orangeHRMopenSource.objectreposiretory.Adduser;
import com.orangeHRMopenSource.objectreposiretory.Admin;
import com.orangeHRMopenSource.objectreposiretory.Login;
import com.orangeHRMopenSource.objectreposiretory.Users;
import com.orangeHRMopenSource.objectreposiretory.logout;

@Listeners(com.orangeHRMopenSource.generics.Listenerimplementation.class)
public class Adminpage extends BaseClass {
	@Test
public void User() throws InterruptedException
{
	
	
	
	//Assert.fail();
 Admin ad=new Admin(driver);
 ad.useradmin(driver);
 ad.userManager(driver);
 ad.userClick(driver);
 
 Users us=new Users(driver);
 us.clickadd();
 
 Adduser au=new Adduser(driver);
 au.setusertype(1);
 au.ename("David Morris");
 au.username("sneha");
 au.status(1);
 
 au.pass("reddy123");
 au.conpass("reddy123");
 au.saved();
 
 logout lg=new logout(driver);
 lg.welcome();
 
}
	
}