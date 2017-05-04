
package testcases;

import org.junit.Test;

import wrappers.ProjectWrappers;

public class CreateAccount extends ProjectWrappers {
	@Test
	public void createAccount() throws Exception {

		// Login to Application
//		login();
		clickByLink("Accounts");
		clickByLink("Create Account");
		enterById("accountName", "Arkham Industries");
		selectVisibileTextByXpath("//select[@name='industryEnumId']", "Media");
		selectVisibileTextById("currencyUomId", "INR - Indian Rupee");
		selectVisibileTextById("dataSourceId", "Existing Customer");
		selectVisibileTextById("marketingCampaignId", "Road and Track");
		enterById("primaryPhoneNumber", "1234567890");
		enterById("generalCity", "Gotham");
		enterById("primaryEmail", "Bruce.Wayne@gmail.com");
		selectVisibileTextById("generalCountryGeoId", "India");
		selectVisibileTextById("generalStateProvinceGeoId", "TAMILNADU");
		clickByClassName("smallSubmit");
		
	}

}