
package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class CreateLead extends ProjectWrappers {

	// @Test(invocationCount=2)
	// @Test(groups = { "smoke" })
//	@Test(dataProvider="fetchData")
//	@Test(dataProvider="fetchData",dataProviderClass=DataProv.class)
	@Test(dataProvider="fetchData",dataProviderClass=DPExcel.class)
	public void createLead(String CN, String FN, String LN) throws Exception {
		// // Login to Application
		 invokeApp("chrome", "http://leaftaps.com");
		 enterById("username", "DemoSalesManager");
		 enterById("password", "crmsfa");
		 clickByClassName("decorativeSubmit");
		 // clickByClassName("decorativeSubmit");
		 clickByLink("CRM/SFA");
		// Create Lead with all fields entered
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", CN);
		enterById("createLeadForm_firstName", FN);
		enterById("createLeadForm_lastName", LN);
		selectVisibileTextById("createLeadForm_dataSourceId", "Partner");
		selectVisibileTextById("createLeadForm_marketingCampaignId", "Automobile");
		enterById("createLeadForm_firstNameLocal", "Anto");
		enterById("createLeadForm_lastNameLocal", "Alex");
		enterById("createLeadForm_personalTitle", "Mr");
		enterById("createLeadForm_generalProfTitle", "Alexander");
		enterById("createLeadForm_departmentName", "Media");
		enterById("createLeadForm_annualRevenue", "1000000000");
		selectVisibileTextById("createLeadForm_currencyUomId", "BRR - Brazil");
		selectVisibileTextById("createLeadForm_industryEnumId", "Media");
		enterById("createLeadForm_numberEmployees", "500");
		selectVisibileTextById("createLeadForm_ownershipEnumId", "Corporation");
		enterById("createLeadForm_sicCode", "12345");
		enterById("createLeadForm_tickerSymbol", "%");
		enterById("createLeadForm_description", "Lead description Here");
		enterById("createLeadForm_importantNote", "Important notes Here");
		enterById("createLeadForm_primaryPhoneNumber", "12345678");
		enterById("createLeadForm_primaryPhoneAreaCode", "1211211");
		enterById("createLeadForm_primaryPhoneExtension", "60631");
		enterById("createLeadForm_primaryPhoneAskForName", "Alex");
		enterById("createLeadForm_primaryEmail", "AntonyAlexander@gmail.com");
		enterById("createLeadForm_primaryWebUrl", "http://leaftaps.com");
		enterById("createLeadForm_generalToName", "Alexander");
		enterById("createLeadForm_generalAttnName", "Alex");
		enterById("createLeadForm_generalAddress1", "Address of Alexander Line 1");
		enterById("createLeadForm_generalAddress2", "Address of Alexander Line 2");
		enterById("createLeadForm_generalCity", "Ilahi");
		selectVisibileTextById("createLeadForm_generalStateProvinceGeoId", "Indiana");
		enterById("createLeadForm_generalPostalCode", "1211211");
		enterById("createLeadForm_generalPostalCodeExt", "044");
		// selectVisibileTextById("createLeadForm_generalCountryGeoId","Armenia");
		clickByClassName("smallSubmit");
	}
//
//	@DataProvider(name = "fetchData")
//	public Object[][] data() {
//		Object[][] testData = new Object[2][3];
//		testData[0][0] = "Gotham";
//		testData[0][1] = "Bruce";
//		testData[0][2] = "Wayne";
//		testData[1][0] = "Stark";
//		testData[1][1] = "Tony";
//		testData[1][2] = "Stark";
//		return testData;

	}
