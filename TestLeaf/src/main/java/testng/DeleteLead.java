package testng;

import org.testng.annotations.Test;
import wrappers.ProjectWrappers;

public class DeleteLead extends ProjectWrappers {
//	@Test(dependsOnMethods={"editLead"},alwaysRun=true)
	@Test(groups={"regression"},dependsOnGroups={"sanity"})
	public void deleteLead() throws Exception {
		//login();
		// Find Leads
		clickByLink("Create Lead");
		clickByLink("Find Leads");
		Thread.sleep(5000);
		clickByXpath("//span[contains(text(),'Phone')]");
		enterByName("phoneNumber", "12345678");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		// // Capture the first name of First Resulting Lead
		String beforename = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		System.out.println(beforename);
		// click the First Resulting Lead
		 clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		// verifyTitle("View Lead");
		clickByLink("Delete");
		clickByLink("Find Leads");
		enterByName("id", beforename);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(5000);
		verifyTextByXpath("//div[contains(text(),'No records to display')]", "No records to display");
		//closeBrowser();
	}

}
