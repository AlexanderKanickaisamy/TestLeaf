
package testcases;

import org.junit.Test;

import wrappers.ProjectWrappers;

public class MergeAccount extends ProjectWrappers {

	@Test
	public void mergeAccount() throws Exception {
		// Login to Application
//		login();
		clickByLink("Accounts");
		clickByLink("Merge Accounts");

		clickByXpath("(//img[@alt='Lookup'])[1]");
		Thread.sleep(5000);
		// Search and pick an existing From ID
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Account ID:')]/following::input", "13147");
		clickByXpath("//button[contains(text(),'Find Accounts')]");
		Thread.sleep(5000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToLastWindow();
		Thread.sleep(5000);
		clickByXpath("(//img[@alt='Lookup'])[2]");
		Thread.sleep(5000);
		// Search and pick an existing To ID
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Account ID:')]/following::input", "13149");
		clickByXpath("//button[contains(text(),'Find Accounts')]");
		Thread.sleep(5000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToLastWindow();
		Thread.sleep(5000);
		// Click on Merge
		clickByLink("Merge");
		// Accept Alert
		acceptAlert();
		clickByLink("Find Leads");
		enterByXpath("//label[contains(text(),'Account ID:')]/following::input", "13147");
		clickByXpath("//button[contains(text(),'Find Accounts')]");
		verifyTextByXpath("(\"//div[contains(text(),'No records to display')]\")", "No records to display");
		closeBrowser();

	}

}