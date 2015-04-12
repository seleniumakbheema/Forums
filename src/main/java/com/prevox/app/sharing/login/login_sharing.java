package com.prevox.app.sharing.login;

import com.prevox.app.sharing.util.landing_page;
import com.prevox.app.sharing.util.signin;
import com.prevox.app.sharing.util.webConnector;
import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

// Step Definition file, where Feature file Keywords are converted to Annoation

public class login_sharing {


	
	webConnector connector = new webConnector();
	signin sigin_connector = new signin();
	
	
	
	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_go_to_prevox(String URL, String browser)
	{
		System.out.println("I go to "+ URL +" on "+browser);
		connector.openBrowser(browser);
		connector.navigate_to(URL);
	}
	
	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter(String object, String text)
	{
		System.out.println("I enter "+object+" as "+text);
		sigin_connector.doLogin(object, text);
	}
	
	@And("^Click on \"([^\"]*)\"$")
	public void Click_on(String object)
	{
		System.out.println("Click on "+ object);
		sigin_connector.logIn(object);
	}
	
	@Then("^I logged in \"([^\"]*)\"$")
	public landing_page I_logged(String xPath_post)
	{
		System.out.println("I logged on "+ xPath_post);
		/*if(sigin_connector.isElementPresent(xPath_post))
				return true;
		return false;*/
		return new landing_page();
	}
}
