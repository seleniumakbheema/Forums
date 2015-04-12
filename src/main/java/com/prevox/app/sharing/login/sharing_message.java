package com.prevox.app.sharing.login;

import com.prevox.app.sharing.util.endUser_page;
import com.prevox.app.sharing.util.landing_page;
import com.prevox.app.sharing.util.sharing_Page;
import com.prevox.app.sharing.util.webConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//Step Layer

public class sharing_message 

{
	webConnector connector = new webConnector();
	landing_page landing_connector = new landing_page();
	sharing_Page sharing_connector = new sharing_Page();
	endUser_page endUser_connector = new endUser_page();
	
	@Given("^Click on \"([^\"]*)\" from my \"([^\"]*)\"$")
	public sharing_Page Click_on_Share(String share_xpath, String post_xpath)
	{
		System.out.println("Click on "+share_xpath+" from my "+post_xpath);
		landing_connector.sharing(share_xpath);
		landing_connector.my_post(post_xpath);
		return new sharing_Page();
	}
	@And("^\"([^\"]*)\" will be created to share$")
	public void url_created(String link_url)
	{
		System.out.println(link_url+" will be created to share");
		sharing_connector.url_link(link_url);
	}
	@And("^Share \"([^\"]*)\" to end user$")
	public void share_toenduser(String url)
	{
		System.out.println("share "+url+" to end user");
		sharing_connector.url_link(url);
	}
	@And("^Enter \"([^\"]*)\" with his \"([^\"]*)\"$")
	public void credential_details(String xpath, String text){
		System.out.println("Enter "+xpath+" with his "+ text);
		sharing_connector.user_details(xpath, text);
	}
	@And("^click on \"([^\"]*)\" button$")
	public endUser_page send(String xpath)
	{
		System.out.println("Click "+xpath+" button");
		sharing_connector.send_message(xpath);
		return new endUser_page();
	}
	@Then("^Reciever can see the message successfully using \"([^\"]*)\" on \"([^\"]*)\"$")
	public void end_user_Access(String url, String browser){
		System.out.println("Receiver can see the message successfully using "+url+" on " +browser);
		endUser_connector.Enduser_url(url);
		connector.openBrowser(browser);
	}
	// From here there will testing at reciever page will be tested based on devices
}
