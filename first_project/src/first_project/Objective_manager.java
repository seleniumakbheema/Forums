package first_project;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Objective_manager {
	
	public static WebDriver driver = null;

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver/chromedriver");
		
		driver = new FirefoxDriver();
		
		driver.get("https://staging.objectivemanager.com/login");
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("anil.bheema@objectivemanager.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Staging123");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(Keys.ENTER);
		click("html/body/div[1]/div/ul[1]/li[2]/a");
		click("//*[@id='552e317a66d66']/div[2]/span/a");
		click("//*[@id='submit_add_objective']/ul/li[4]/div/div/ul/li/div/span[1]");
	}
	
	public static void click (String xpath)
	{

			driver.findElement(By.xpath(xpath)).click();
	}

}
