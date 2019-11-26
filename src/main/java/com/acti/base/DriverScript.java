package com.acti.base;

import java.io.File;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
*Name:Subashini
*Date Created: 11/25/2019
*verified by:Shantosh
*/

public class DriverScript {

	public static WebDriver driver;
    Properties prop;
	
	public DriverScript() 
	{
		try
		{
			 prop = new Properties();
			File src = new File("./acti.configuration/config.Properties");
			FileInputStream fis = new FileInputStream(src);
			prop.load(fis);
		}
		catch (Exception e)
		{
			System.out.println("file not found" + e.getMessage());
		}
		
		}
		
	public void initBrowser()
	{
	  String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./acti.browsers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./acti.browsers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("no proper browser specified: Please check the properties file");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url = prop.getProperty("qaurl");
		driver.get(url);
		
		
	}
}
