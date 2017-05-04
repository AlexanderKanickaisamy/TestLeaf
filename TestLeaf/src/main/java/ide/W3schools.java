package ide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schools {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Test Leaf/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		String s1 = "Test Leaf";
		alt.sendKeys(s1);
		alt.accept();
		String s2 = driver.findElementById("demo").getText();
		if(s2.contains(s1))
		{
			System.out.println("Provided name is available in output page");
		}
		else{
			System.out.println("Provided name is not available in output page");
		}
	}

}
