package com.act.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/*
*Name:Subashini
*Date Created: 11/25/2019
*verified by:Shantosh
*/

public class EnterTimeTrack extends DriverScript {

	//*************Page/object initialization***********
	public EnterTimeTrack()
	{
		PageFactory.initElements(driver, this);
	}

	//********objects identification or object repositories*******
	@FindBy(id="logoutLink") WebElement logout;
	@FindBy(id="container_tt") WebElement TT;
	@FindBy(id="container_tasks") WebElement taskmenu;
	
	//***********Actions and Methods****************
	public void clicklogout()
	{
		logout.click();
	}
	
	public boolean taskmenuIsDisplayed()
	{
		return taskmenu.isDisplayed();
	}
	
	public void clicktaskmenu()
	{
		taskmenu.click();
	}
	
	public boolean timetrackIsDiplayed()
	{
		return TT.isDisplayed();
	}
	
	public boolean timetrackIsEnabled()
	{
		return TT.isEnabled();
	}
	
	
	
	
	
	
	
	
	
	
}
