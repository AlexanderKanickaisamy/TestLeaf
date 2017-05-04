package ide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapsDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Test Leaf/chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://leaftaps.com");
	    	driver.findElementById("username").sendKeys("DemoSalesManager");
	    	driver.findElementById("password").sendKeys("crmsfa");
	    	driver.findElementByClassName("decorativeSubmit").click();
	    	driver.findElementByLinkText("CRM/SFA").click();
	    	driver.findElementByLinkText("Create Lead").click();
	    	driver.findElementById("createLeadForm_companyName").sendKeys("Apple");
	    	driver.findElementById("createLeadForm_firstName").sendKeys("Steve");
	    	driver.findElementById("createLeadForm_lastName").sendKeys("Jobs");
	    	WebElement dd = driver.findElementById("createLeadForm_dataSourceId");
	    	Select Dropdown = new Select(dd);
	    	Dropdown.selectByVisibleText("Cold Call");
	    	driver.findElementByClassName("smallSubmit").click();
	    	driver.close();
	}

}
