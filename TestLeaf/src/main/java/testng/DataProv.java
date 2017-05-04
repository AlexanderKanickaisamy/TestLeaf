package testng;

import org.testng.annotations.DataProvider;

public class DataProv {

	@DataProvider(name = "fetchData")
	public static Object[][] data() {
		Object[][] testData = new Object[2][3];
		testData[0][0] = "Gotham";
		testData[0][1] = "Bruce";
		testData[0][2] = "Wayne";
		testData[1][0] = "Stark";
		testData[1][1] = "Tony";
		testData[1][2] = "Stark";
		return testData;
}

}
