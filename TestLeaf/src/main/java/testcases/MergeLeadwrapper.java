package testcases;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class MergeLeadwrapper extends ProjectWrappers {

	@Test(enabled=false)
	public void mergeLead() throws Exception {
//		// Login to Application
//		invokeApp("chrome", "http://leaftaps.com");
//		enterById("username", "DemoSalesManager");
//		enterById("password", "crmsfa");
//		clickByClassName("decorativeSubmit");
//		// clickByClassName("decorativeSubmit");
//		clickByLink("CRM/SFA");
		// Merge Lead
		clickByLink("Create Lead");
		clickByLink("Merge Leads");
		clickByXpath("(//img[@alt='Lookup'])[1]");
		Thread.sleep(5000);
		// Search and pick an existing From ID
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", "10140");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(5000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToLastWindow();
		Thread.sleep(5000);
		clickByXpath("(//img[@alt='Lookup'])[2]");
		Thread.sleep(5000);
		// Search and pick an existing To ID
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", "10132");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(5000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToLastWindow();
		Thread.sleep(5000);
		// Click on Merge
		clickByLink("Merge");
		// Accept Alert
		acceptAlert();
		// Search From ID in Find Leads
		clickByLink("Find Leads");
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", "10140");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		// Verify No records found
		Thread.sleep(5000);
		//No functions available to verify No records to display text. Only Inner text can be verified using getText()
		//clickByXpath("//div[contains(text(),'No records to display')]");

	}

}
