package testcases;

import org.testng.annotations.BeforeMethod;

import wrappers.GenericWrappers;

public class Login extends GenericWrappers {

	
	public void login() throws Exception{
		
		invokeApp("chrome", "http://leaftaps.com");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		//clickByClassName("decorativeSubmit");
		
	}
	
}
