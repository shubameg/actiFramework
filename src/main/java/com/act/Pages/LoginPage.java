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

//********objects identification***

public class LoginPage extends DriverScript {
@FindBy(id="username") WebElement usernameTb;
@FindBy(name="pwd") WebElement passwordTb;
@FindBy(id="loginButton") WebElement loginbtn;
@FindBy(xpath="//div[@class='atLogoImg']") WebElement actilogo;
@FindBy(id="toPasswordRecoveryPageLink") WebElement fgtpwdlnk;
@FindBy(xpath="//nobr [text()='actiTIME 2019.3 Pro']") WebElement at2019;
@FindBy(linkText="actiTIME Inc.") WebElement acttimelnk;

//*************Page/object initialization***********

public LoginPage()
{
	PageFactory.initElements(driver, this);
}

//***************Actions and Methods************
public String verifyTitle()
{
	return driver.getTitle();
}

public boolean verifyLogoIsDisplayed()
{
	return actilogo.isDisplayed();
	
}

public void validateLoginFunction(String username,String password)
{
	usernameTb.sendKeys(username); 
	passwordTb.sendKeys(password);
	loginbtn.click();
}

public void fgtpwlink()
{
	fgtpwdlnk.click();	
}

public void actitimelinkNewTab()
{
	acttimelnk.click();
	
	
}

}
