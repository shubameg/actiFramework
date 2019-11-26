package com.acti.TestCases;

import org.testng.annotations.BeforeMethod;

import com.act.Pages.EnterTimeTrack;
import com.act.Pages.LoginPage;
import com.acti.base.DriverScript;

public class TC03_TaskPage extends DriverScript {
	LoginPage lp;
	EnterTimeTrack ett;
public TC03_TaskPage()
{
	//super keyword is used to call the base class constructor
			super();
}

@BeforeMethod
public void preTest()
{
	initBrowser();
	
}





}
