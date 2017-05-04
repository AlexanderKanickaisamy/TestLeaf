package ide;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctcregistration {

	public static void main(String[] args) throws InterruptedException {
		// Launch Driver
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				// Initialize Driver
				ChromeDriver driver = new ChromeDriver();
				
				// Get URL
				driver.get("https://www.irctc.co.in");
				
				//Click on Sign Up Link
				driver.findElementByLinkText("Sign up").click();
				
				//Enter Username
				driver.findElementById("userRegistrationForm:userName").sendKeys("AntonyStar");
				
				//Check availabiity and enter password
				driver.findElementByLinkText("Check Availability").click();
				driver.findElementById("userRegistrationForm:password").sendKeys("Antony4Star");
				
				//Select Security Question
				WebElement seq = driver.findElementById("userRegistrationForm:securityQ");
				Select dropdown1=new Select(seq);
				dropdown1.selectByValue("0");
				
				//Answer Security Question
				driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Rockstar");
				
				//First Name
				driver.findElementById("userRegistrationForm:firstName").sendKeys("Antony");
				
				//Last Name
				driver.findElementById("userRegistrationForm:lastName").sendKeys("Alexander");
				
				//Select Gender
				driver.findElementById("userRegistrationForm:gender:0").click();
				
				//Select Marital Status
				driver.findElementById("userRegistrationForm:maritalStatus:1").click();
				
				//Select Day of birth
				WebElement day = driver.findElementById("userRegistrationForm:dobDay");
				Select dropdown2=new Select(day);
				dropdown2.selectByValue("28");
				
				//Select Month of birth
				WebElement mon = driver.findElementById("userRegistrationForm:dobMonth");
				Select dropdown3=new Select(mon);
				dropdown3.selectByValue("10");
			
				//Select Year of Birth
				WebElement year = driver.findElementById("userRegistrationForm:dateOfBirth");
				Select dropdown4=new Select(year);
				dropdown4.selectByValue("1990");
			
				//Select Occupation
				WebElement occ = driver.findElementById("userRegistrationForm:occupation");
				Select dropdown5=new Select(occ);
				dropdown5.selectByVisibleText("Private");
				
				//Enter Email
				driver.findElementById("userRegistrationForm:email").sendKeys("antonyalexander65@gmail.com");
				//Enter Mobile number
				driver.findElementById("userRegistrationForm:mobile").sendKeys("9003116806");
				
				//Select Nationality
				WebElement nat = driver.findElementById("userRegistrationForm:nationalityId");
				Select dropdown6=new Select(nat);
				dropdown6.selectByIndex(1);	
				
				//Enter Address
				driver.findElementById("userRegistrationForm:address").sendKeys("19");
				
				//Select Country
				WebElement cou = driver.findElementById("userRegistrationForm:countries");
				Select dropdown7=new Select(cou);
				dropdown7.selectByIndex(1);	
				
				//Enter Pincode and use TAB key press action
				driver.findElementById("userRegistrationForm:pincode").sendKeys("600096",Keys.TAB);
				
				//Add Sleep function
				Thread.sleep(5000);
				

				//Select City
				WebElement city = driver.findElementById("userRegistrationForm:cityName");
				Select dropdown8=new Select(city);
				dropdown8.selectByIndex(1);	
				
				Thread.sleep(5000);
				
				//Select Postoffice
				WebElement post = driver.findElementById("userRegistrationForm:postofficeName");
				Select dropdown9=new Select(post);
				dropdown9.selectByIndex(1);	
				
				//Enter phone number
				driver.findElementById("userRegistrationForm:landline").sendKeys("044222244445");
				
	}

}
