package com.acti.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.act.Pages.EnterTimeTrack;
import com.act.Pages.LoginPage;
import com.acti.base.DriverScript;

public class TC02_EnterTimePage extends DriverScript{
	LoginPage lp;
	EnterTimeTrack ett;
	public TC02_EnterTimePage()
	{
		//super keyword is used to call the base class constructor
		super();
	}
	
	@BeforeMethod
	public void preTest()
	{
		initBrowser();
		lp=new LoginPage();
		lp.validateLoginFunction("admin", "manager");
		 ett = new EnterTimeTrack();
		 
	}
	
	@AfterMethod
	public void postTest()
	{
		driver.close();
	}
		
	
	@Test(priority=3)
	public void testTaskmenudisplay()
	{
		boolean res = ett.taskmenuIsDisplayed();
		System.out.println("taskmenu_display_status: "+ res);
	}
	
	@Test(priority=4)
	public void testTaskmenuClicking()
	{
		ett.clicktaskmenu();
		//System.out.println("Clicked successfully");
	}
	
		
	@Test(priority=1)
	public void testTimetrkdisplaystatus()
	{
		boolean res1 = ett.timetrackIsDiplayed();
		System.out.println("timetrkdisplay_status: " + res1); 
	}
	
	@Test(priority=2)
	public void testTimetrkenablestatus()
	{
		boolean res2 = ett.timetrackIsEnabled();
		System.out.println("timetrackenable_status: " + res2);
	}
	@Test(priority=5)
	public void test_tt_LogOut()
	{
		ett.clicklogout();
		//System.out.println("logging out of TT");
	}
	
	
	
	
	
	
	
	
	
	
}
