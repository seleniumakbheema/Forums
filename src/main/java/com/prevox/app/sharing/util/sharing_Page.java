package com.prevox.app.sharing.util;

public class sharing_Page extends webConnector

{
	
	public void url_link(String url)
	{
		isLinkPresent(url);
	}
	public void user_details(String xpath, String text){
		input_xPath(xpath, text);
	}
	public void send_message(String xpath)
	{
		click(xpath);
	}
}
