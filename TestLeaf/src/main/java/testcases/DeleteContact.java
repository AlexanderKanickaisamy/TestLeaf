
package testcases;

import org.junit.Test;

import wrappers.ProjectWrappers;

public class DeleteContact extends ProjectWrappers {

	@Test
	public void deleteContact() throws Exception {
		// Login to Application
//		login();
		clickByLink("Accounts");
		clickByLink("Find Accounts");

		clickByXpath("//span[contains(text(),'Phone')]");
		enterByName("phoneNumber", "23456");
		clickByXpath("//button[contains(text(),'Find Accounts')]");
		Thread.sleep(5000);
		String captureid = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		getElementsByXpath("//*[@alt='Expire']");

		clickByXpath("//a[contains(text(),'Find Accounts')]");
		enterByXpath("//label[contains(text(),'Account ID:')]/following::input", captureid);
		clickByXpath("//button[contains(text(),'Find Accounts')]");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		verifyTextByXpath("//div[contains(text(),'No contact information on file')]", "No contact information on file");
		closeBrowser();
	}
}