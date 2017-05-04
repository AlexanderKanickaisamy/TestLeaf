

package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class GenericWrappers implements Wrappers {

	RemoteWebDriver driver;
	int i = 1;

	public void invokeApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);

			System.out.println("The browser:" + browser + " launched successfully");
		} catch (WebDriverException e) {
			System.err.println("The Browser " + browser + " is not Launched as expected due to some issue");
		} finally {
			takeSnap();
		}

	}

	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The data: " + data + " entered successfully in field :" + idValue);
		} catch (NoSuchElementException e) {
			System.err.println("The required Element with ID value as " + idValue + " is Not Found");

		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void enterByName(String nameValue, String data) {
		try {
			driver.findElementByName(nameValue).clear();
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("The data: " + data + " entered successfully in field :" + nameValue);
		} catch (NoSuchElementException e) {
			System.err.println("The required Element with name as " + nameValue + " is Not Found");

		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void enterByXpath(String xpathValue, String data) {
		try {
			driver.findElementByXPath(xpathValue).clear();
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The data: " + data + " entered successfully in field :" + xpathValue);
		} catch (NoSuchElementException e) {
			System.err.println("The required Element with Xpath as " + xpathValue + " is Not Found");

		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void verifyTitle(String title) {
		try {
			if (driver.getTitle().equals(title)) {
				System.out.println("The title of the browser " + title + " is as Expected");
			} else {
				System.out.println("The title of the browser " + title + " is not as Expected");
			}
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void verifyTextById(String id, String text) {
		try {
			if (driver.findElementById(id).getText().equals(text))
				System.out
						.println("Expected Text " + text + " Matches with the actual text using the ID Locator " + id);
			else
				System.out.println(
						"Expected Text " + text + " Does Not Match with the actual text using the ID Locator " + id);

		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void verifyTextByXpath(String xpath, String text) {
		try {
			if (driver.findElementByXPath(xpath).getText().equals(text)) {
				System.out.println(
						"Expected Text " + text + " Matches with the actual text using the Xpath Locator " + xpath);
			} else {
				System.out.println("Expected Text " + text
						+ " Does Not Match with the actual text using the Xpath Locator " + xpath);
			}
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		try {
			if (driver.findElementByXPath(xpath).getText().contains(text)) {
				System.out.println("Expected Text " + text
						+ " Contains the actual text the actual text using the Xpath Locator " + xpath);
			} else {
				System.out.println(
						"Expected Text " + text + " Does Not Contain the actual text using the Xpath Locator " + xpath);
			}
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void clickById(String id) {
		try {
			driver.findElementById(id).click();
			System.out.println("The element with ID : " + id + " is clicked.");
		} catch (NoSuchElementException e) {
			System.err.println("The element with ID : " + id + " cannot be Found");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void clickByClassName(String classVal) {
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("The element with class Name: " + classVal + " is clicked.");
		} catch (NoSuchElementException e) {
			System.err.println("The element with Class : " + classVal + " cannot be Found");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void clickByName(String name) {
		try {
			driver.findElementByName(name).click();
			System.out.println("The element with Name: " + name + " is clicked.");
		} catch (NoSuchElementException e) {
			System.err.println("The element with Name : " + name + " cannot be Found");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void clickByLink(String name) {
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The element with Link Name: " + name + " is clicked.");
		} catch (NoSuchElementException e) {
			System.err.println("The element with Link Name : " + name + " cannot be Found");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void clickByLinkNoSnap(String name) {
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The element with Link Name: " + name + " is clicked(No Snap)");
		} catch (NoSuchElementException e) {
			System.err.println("The element with Link Name : " + name + " cannot be Found");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		}
	}

	public void clickByXpath(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element with Xpath value : " + xpathVal + " is clicked.");
		} catch (NoSuchElementException e) {
			System.err.println("The element with Xpath value : " + xpathVal + " cannot be Found");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element with Xpath value : " + xpathVal + " is clicked(No Snap)");
		} catch (NoSuchElementException e) {
			System.err.println("The element with Xpath : " + xpathVal + " cannot be Found");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		}
	}

	public String getTextById(String idVal) {
		try {
			idVal = driver.findElementById(idVal).getText();
			System.out.println("The Text of the Element is :" + idVal);
		} catch (NoSuchElementException e) {
			System.err.println("The element with ID : " + idVal + " cannot be found");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}

		return idVal;
	}

	public String getTextByXpath(String xpathVal) {
		String val = null;
		try {
			val = driver.findElementByXPath(xpathVal).getText();
			System.out.println("The Text of the Element is :" + xpathVal);
		} catch (NoSuchElementException e) {
			System.err.println("The element with Xpath : " + xpathVal + " cannot be found");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}

		return val;
	}

	public void selectVisibileTextById(String id, String value) {
		try {
			Select dd = new Select(driver.findElementById(id));
			System.out.println("Dropdown is Identified");
			dd.selectByVisibleText(value);
			System.out.println("Dropdown Value :" + value + " is Selected (Using Visible Text)");
		} catch (NoSuchElementException e) {
			System.err.println("The element with visibletext : " + value + " cannot be found");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void selectVisibileTextByXpath(String xpath, String value) {
		try {
			Select dd = new Select(driver.findElementByXPath(xpath));
			System.out.println("Dropdown is Identified");
			dd.selectByVisibleText(value);
			System.out.println("Dropdown Value :" + value + " is Selected (Using Visible Text)");
		} catch (NoSuchElementException e) {
			System.err.println("The element with visibletext : " + value + " cannot be found");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void selectIndexById(String id, int value) {
		try {
			Select dd = new Select(driver.findElementById(id));
			System.out.println("Dropdown is Identified");
			dd.selectByIndex(value);
			System.out.println("Dropdown Value :" + value + " is Selected (Using Index)");
		} catch (NoSuchElementException e) {
			System.err.println("The element with Index : " + value + " cannot be interacted");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void switchToParentWindow() {
		try {
			Set<String> allHandles = driver.getWindowHandles();
			for (String eachHandle : allHandles) {
				System.out.println(eachHandle);
				driver.switchTo().window(eachHandle);
				System.out.println("Control is switched to Parent Window");
				break;
			}
		} catch (NoSuchWindowException e) {
			System.err.println("Window is not Present");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void switchToLastWindow() {
		try {
			Set<String> allHandles = driver.getWindowHandles();
			for (String eachHandle : allHandles) {
				System.out.println(eachHandle);
				driver.switchTo().window(eachHandle);
				System.out.println("Control is switched to Last Window");
			}
		} catch (NoSuchWindowException e) {
			System.err.println("Window is not Present");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			System.out.println("Switched to Alert and Accepted");
		} catch (NoAlertPresentException e) {
			System.err.println("Alert is not Present");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("Switched to Alert and Dismissed");
		} catch (NoAlertPresentException e) {
			System.err.println("Alert is not Present");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
	}

	public String getAlertText() {
		String alerttext = null;
		try {
			alerttext = driver.switchTo().alert().getText();
			System.out.println("The Alert Text is : " + alerttext);
		} catch (NoAlertPresentException e) {
			System.err.println("Alert is not Present");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		} finally {
			takeSnap();
		}
		return alerttext;
	}

	public void takeSnap() {

		try {
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./snaps/snap" + i + ".jpg");
			try {
				FileUtils.copyFile(src, dest);
				System.out.println("Screenshot has been Taken and placed in the destination as " + i + ".jpg");
				i++;
			} catch (IOException e) {
				System.out.println("Error in Taking the Screenshot");
			}
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		}
	}
//@AfterMethod(groups={"common"})
	@AfterTest
	public void closeBrowser() {
		try {
			driver.close();
			System.out.println("The browser is closed");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		}
	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("All browsers were closed");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");
		}
	}

	public void getElementsByXpath(String xpathVal) {
		try {
			List<WebElement> allvals = driver.findElementsByXPath(xpathVal);
			for (WebElement eachval : allvals) {
				// For Deleting Each of the Element
				eachval.click();

			}

		} catch (NoSuchElementException e) {
			System.err.println("The element cannot be found");
		} catch (WebDriverException e) {
			System.err.println("An unknown Exception has been occured");

		} finally {
			takeSnap();
		}

	}

}