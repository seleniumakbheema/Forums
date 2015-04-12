package com.prevox.app.sharing.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class webConnector {

	
	//Utility functions and Initlializing the properties files
	// will have selenium layer and selenium commands
	
	//Selenium Layer
	
	
	public static Properties OR = null;
	public static Properties CONFIG = null;
	
	public static WebDriver driver = null;
	
	
	// Consstructor of the class to use in the step functions
	public webConnector()
	{
		
		if(OR == null)
		{
			try 
			{
				//Initilization of OR property file
				OR = new Properties();
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/prevox/app/sharing/config/OR.properties");
				OR.load(fs);
				
				//Initilizaition of CONFIG property file
				
				CONFIG = new Properties();
				fs = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/prevox/app/sharing/config/"+OR.getProperty("testEnv")+"_config.properties");
				CONFIG.load(fs);
				System.out.println(CONFIG.getProperty("usernameText"));
				System.out.println(CONFIG.getProperty("loginL"));
				
				
			} 
			catch (Exception e) 
			{
				System.out.println("error in initialization");
			
			}
		}
		
	}
	
	//Browser 
	
	
			public void openBrowser(String browserType)
			{
				if(browserType.equals("Mozilla"))
				{
					driver = new FirefoxDriver();
					
				}else if (browserType.equals("Chrome")){
					System.setProperty("wedriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver/chromedriver.exe");
					driver = new ChromeDriver();
				
				}else if (browserType.equals("IE")){
					//sending the path of IE
				}
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			
	// Navigate to URL
	
			
			public void navigate_to(String url)
			{
				driver.get(CONFIG.getProperty(url));
			}
			
			
	// Clicking with xpath
			public void click(String xpathtype)
			{
				try
				{
					driver.findElement(By.xpath(OR.getProperty(xpathtype))).click();
				}
				catch(Exception e)
				{
					System.out.println("Cicking with Xpath has got a problem");
				}
			}
			
	//Send the Input data with Xpath
			public void input_xPath(String xpath, String text)
			{
				try {
					
					driver.findElement(By.xpath(OR.getProperty(xpath))).sendKeys(CONFIG.getProperty(text));
				} catch (Exception e) {
					System.out.println("Sendkeys with Xpath can not passing Input");
					// TODO: handle exception
				}
			}
			
	//Send the Input data with iD
			public void input_iD(String xpath, String text)
			{
				try {
					
					driver.findElement(By.id(OR.getProperty(xpath))).sendKeys(CONFIG.getProperty(text));
				} catch (Exception e) {
					System.out.println("Sendkeys with ID can not passing Input");
					// TODO: handle exception
				}
			}
			
			//Send the Enter
			public void input_Enter(String xpath, String text)
			{
				try {
					
					driver.findElement(By.id(OR.getProperty(xpath))).sendKeys(Keys.ENTER);
				} catch (Exception e) {
					System.out.println("Sendkeys with Enter can not passing Input");
					// TODO: handle exception
				}
			}
			
	//Verification
			public boolean isElementPresent(String xPath)
			{
				try {
					driver.findElement(By.xpath(OR.getProperty(xPath)));
				} catch (Exception e) {
					return false;
				}
				return true;
			}
			
			public boolean isLinkPresent(String url)
			{
				try {
					driver.findElement(By.xpath(OR.getProperty(url)));
				} catch (Exception e) {
					return false;
				}
				return true;
			}
			
	//LinkText
			public void linkText(String text)
			{
				try {
					driver.findElement(By.linkText(text));
				} catch (Exception e) {
					System.out.println("LinkText not Found");
				}
			}
	
	
	
}
