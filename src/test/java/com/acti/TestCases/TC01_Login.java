package com.acti.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.act.Pages.LoginPage;
import com.acti.base.DriverScript;

public class TC01_Login extends DriverScript{
	
	LoginPage lp;
 public TC01_Login()
 {
	 //super keyword is used to call the base class constructor
	 super();
 }
 
 @BeforeMethod
 public void preTest()
 {
	 initBrowser();
	 lp = new LoginPage();
 }

 @AfterMethod
 public void postTest()
 {
	 driver.close();
 }
	
	@Test(priority=1)
	public void TestVerifyTitle()
	{
		 
		 String title = lp.verifyTitle();
		 System.out.println(title);
	}
	
	@Test(priority=2)
	public void testVerifyLogoIsDisplayed()
	{
		boolean res = lp.verifyLogoIsDisplayed();
		System.out.println(res);
	}
	
	@Test(priority=3)
	public void testValidateLoginFunction()
	{
		lp.validateLoginFunction("admin", "manager");
		
	}
	
	@Test(priority=4)
	public void testFgtPwdLink() throws Exception
	{
		   lp.fgtpwlink();
		   Thread.sleep(3000);
	}
	
	@Test(priority=5)
	public void testActiTimelnktab()
	{
	  lp.actitimelinkNewTab();
	System.out.println(lp.toString());
	}
	
	
	
	
}
