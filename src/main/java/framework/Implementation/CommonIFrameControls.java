package framework.Implementation;

import java.util.List;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.CommonDriver.CommonDriverControls;
import framework.Contracts.IIFrameControls;
import framework.log4j.Log;

public class CommonIFrameControls implements IIFrameControls {
	WebDriver driver = CommonDriverControls.getdriver();
	WebDriverWait wait = new WebDriverWait(driver, 40);

	public int totalNumberOfIframes(By oBy) throws Exception {
		try {
			List<WebElement> iframes = driver.findElements(oBy);
			int size = iframes.size();
			Log.info("Successfully All Iframes retrieved , size is :" + size);
			System.out.println("Successfully All Iframes retrieved ,size is:" + size);
			return size;
		} catch (Exception e) {
			Log.error("Failed-Retrieving IFrames is not Working" + "due to" + e);
			System.out.println("Failed-Retrieving IFrames is not Working");
			e.printStackTrace();
			return 0;

		}
	}

	public String switchToIframeByIndex(int Index) throws Exception {

		try {
			driver.switchTo().frame(Index);
			Log.info("Successfully Switched to IFRAME with Index :" + Index);
			System.out.println("Successfully Switched to IFRAME with Index :" + Index);
			return "Successfully Switched to IFRAME with Index :" + Index;
		} catch (Exception e) {
			Log.error("Failed-Switch to IFRAME with Index is not Working" + "due to" + e);
			System.out.println("Failed-Switch to IFRAME with Index is not Working");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	public String switchToIframeByName(String IFrameName) throws Exception {
		try {
			driver.switchTo().frame(IFrameName);
			Log.info("Successfully Switched to IFRAME with name :" + IFrameName);
			System.out.println("Successfully Switched to IFRAME with name :" + IFrameName);
			return "Successfully Switched to IFRAME with name :" + IFrameName;
		} catch (Exception e) {
			Log.error("Failed-Switch to IFRAME with name is not Working" + "due to" + e);
			System.out.println("Failed-Switch to IFRAME with name is not Working");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	public String switchToIframeByID(String IdOfElement) throws Exception {
		try {
			driver.switchTo().frame(IdOfElement);
			Log.info("Successfully Switched to IFRAME with ID :" + IdOfElement);
			System.out.println("Successfully Switched to IFRAME with ID :" + IdOfElement);
			return "Successfully Switched to IFRAME with ID :" + IdOfElement;
		} catch (Exception e) {
			Log.error("Failed-Switch to IFRAME with ID is not Working" + "due to" + e);
			System.out.println("Failed-Switch to IFRAME with ID is not Working");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String switchToIframeByWebElement(By oBy) throws Exception {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			driver.switchTo().frame(el1);
			Log.info("Successfully Switched to IFRAME with WebElement:" + el1);
			System.out.println("Successfully Switched to IFRAME with WebElement:" + el1);
			return "Successfully Switched to IFRAME with WebElement:" + el1;
		} catch (Exception e) {
			Log.error("Failed-Switch to IFRAME with WebElement is not Working" + "due to" + e);
			System.out.println("Failed-Switch to IFRAME with WebElement is not Working");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	public String switchToParentIframe() throws Exception {
		try {
			driver.switchTo().parentFrame();
			Log.info("Successfully Switched to PARENT IFRAME");
			System.out.println("Successfully Switched to PARENT IFRAME");
			return "Successfully Switched to PARENT IFRAME";
		} catch (Exception e) {
			Log.error("Failed-Switch to PARENT IFRAME " + "due to" + e);
			System.out.println("Failed-Switch to PARENT IFRAME ");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	public String switchToDefaultContent() throws Exception {
		try {
			driver.switchTo().defaultContent();
			Log.info("Successfully Switched to Default Content");
			System.out.println("Successfully Switched to Default Content");
			return "Successfully Switched to Default Content";
		} catch (Exception e) {
			Log.error("Failed-Switch to Default Content " + "due to" + e);
			System.out.println("Failed-Switch to Default Content");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

}
