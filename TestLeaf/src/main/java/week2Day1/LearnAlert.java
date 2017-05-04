package week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
// For IRCTC WebApplication
		
		/*driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Check Availability").click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("Nesa");
		*/
		
// Tizag WebApplication
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input").click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("NesaKumar");
		Thread.sleep(3000);
		alt.accept();
		
		System.out.println(alt.getText());
		Thread.sleep(3000);
		alt.accept();
		
		
		
	}

}


















