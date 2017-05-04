package testng;


import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

public class EditLead extends ProjectWrappers {
//	@Test(dependsOnMethods={"createLead"})
	@Test(groups={"sanity"},dependsOnGroups={"smoke"})
	public void editLead() throws Exception {
		//login();
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
		getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']");
		// System.out.println(beforename);
		// click the First Resulting Lead
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		verifyTitle("View Lead");
		clickByLink("Edit");
		enterById("updateLeadForm_companyName", "Stark");
		clickByName("submitButton");
		Thread.sleep(5000);
		verifyTextById("viewLead_companyName_sp", "Stark");
		//closeBrowser();
	}

}
