package com.prevox.app.sharing.util;

public class signin extends webConnector
{

	
	public void doLogin(String xpathObject, String Text)
	{
		input_xPath(xpathObject, Text);
	}
	public void logIn(String xpathObject)
	{
		click(xpathObject);
	}
	
	
}
