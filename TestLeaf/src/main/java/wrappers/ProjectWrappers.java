package wrappers;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ProjectWrappers extends GenericWrappers {
//	@Parameters({"URL","username","password"})
//	@BeforeMethod(groups={"common"})
//	@BeforeMethod
//	@BeforeTest
	public void login(String URL,String UN,String PWD){
		
		invokeApp("chrome", URL);
		enterById("username", UN);
		enterById("password", PWD);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		
	}


}



