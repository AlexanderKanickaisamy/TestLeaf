package testng;


import org.testng.annotations.Test;

import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class DuplicateLead extends ProjectWrappers {

	@Test(enabled=false)
	public void duplicateLead() throws Exception {
//		// Login to Application
//		invokeApp("chrome", "http://leaftaps.com");
//		enterById("username", "DemoSalesManager");
//		enterById("password", "crmsfa");
//		clickByClassName("decorativeSubmit");
//		// clickByClassName("decorativeSubmit");
//		clickByLink("CRM/SFA");
		// Find Leads
		clickByLink("Create Lead");
		clickByLink("Find Leads");
		Thread.sleep(5000);
		clickByXpath("//span[contains(text(),'Email')]");
		// Search and Click on the Lead
		enterByName("emailAddress", "AntonyAlexander@gmail.com");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(5000);
		// Capture the first name of First Resulting Lead
		String beforename = getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']");
		//System.out.println(beforename);
		// click the First Resulting Lead
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		// Click Duplicate Lead
		clickByLink("Duplicate Lead");
		// Verify Title contains text as Duplicate Lead
		verifyTitle("Duplicate Lead");
		// Click on Create Lead
		clickByClassName("smallSubmit");
		// Capture the first name of the duplicated Lead and verify with the
		// captured name(beforename)
		verifyTextById("viewLead_firstName_sp", beforename);
		// Close Browser
//		closeBrowser();

	}

}
