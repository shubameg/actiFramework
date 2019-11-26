package com.act.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.acti.base.DriverScript;

public class TasksPage extends DriverScript {
	//*************Page/object initialization***********
		public TasksPage()
		{
			
			PageFactory.initElements(driver, this);
		}
		//********objects identification***
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement addnew;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement crtnewcust;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[1]") WebElement entCustName;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement descp;
	@FindBy(xpath="//div[@class='components_button  withPlusIcon']") WebElement crtCust;
		//**********Actions and Methods********************
	public void Addnewproj()
	{
		Select sel = new Select(addnew);
		sel.selectByIndex(0);
		//addnew.click();	
	}
		
	public void createNewCustomerfolder()
	{
		crtnewcust.click();
	}
	
	public void NewCustinfo(String custName, String custDesc )
	{
		entCustName.sendKeys(custName);
		descp.sendKeys(custDesc);
		crtCust.click();
	}
	
	
	
	
	
	
	
	
}
