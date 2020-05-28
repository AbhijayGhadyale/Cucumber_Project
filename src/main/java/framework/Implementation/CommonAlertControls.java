package framework.Implementation;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.CommonDriver.CommonDriverControls;
import framework.Contracts.IAlertControls;
import framework.log4j.Log;


public class CommonAlertControls implements IAlertControls {
	WebDriver driver = CommonDriverControls.getdriver();
	WebDriverWait wait = new WebDriverWait(driver, 40);

	public String waitForAlert() throws Exception {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			Log.info("Waiting for alert to appear");
			System.out.println("Waiting for alert to appear");
			return "Waiting for alert to appear";
		} catch (Exception e) {
			Log.error("Failed-No alert appeared" + "due to" + e);
			System.out.println("Failed-No alert appeared");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String acceptAlert() throws Exception {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			CommonDriverControls.getdriver().switchTo().alert().accept();
			Thread.sleep(2000);
			Log.info("Successfully alert is accepted");
			System.out.println("Successfully alert is accepted");
			return "Successfully alert is accepted";
		} catch (Exception e) {
			Log.error("Failed-alert accept is not done" + "due to" + e);
			System.out.println("Failed-alert accept is not done");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String rejectAlert() throws Exception {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			CommonDriverControls.getdriver().switchTo().alert().dismiss();
			Thread.sleep(2000);
			Log.info("Successfully alert is dismissed");
			System.out.println("Successfully alert is dismissed");
			return "Successfully alert is dismissed";
		} catch (Exception e) {
			Log.error("Failed-alert dismiss is not done" + "due to" + e);
			System.out.println("Failed-alert dismiss is not done");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	public String getMessageFromAlert() throws Exception {

		try {
			wait.until(ExpectedConditions.alertIsPresent());
			String text = CommonDriverControls.getdriver().switchTo().alert().getText();
			System.out.println(text);
			Thread.sleep(2000);
			Log.info("Successfully alert Text is retrived");
			System.out.println("Successfully alert Text is retrived");
			return text;
		} catch (Exception e) {
			Log.error("Failed-alert Text is not retrived" + "due to" + e);
			System.out.println("Failed-alert Text is not retrived");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	/*public boolean isAlertNotPresent() throws Exception {
		boolean found;
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			found = false;
			Log.info("alert is not present");
			System.out.println("alert is not present");
		} catch (Exception e) {
			Log.error("Failed-alert is present" + "due to" + e);
			System.out.println("Failed-alert is present");
			e.printStackTrace();
			found = true;
		}
		return found;
	}*/

	public boolean isAlertPresent() throws Exception {
		boolean found;
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			found = true;
			Log.info("alert is present");
			System.out.println("alert is present");
		} catch (Exception e) {
			Log.error("Failed-alert is not present" + "due to" + e);
			System.out.println("Failed-alert is not present");
			e.printStackTrace();
			found = false;
		}
		return found;
	}

	public String sendMessageAlert(String message) throws Exception {

		try {
			wait.until(ExpectedConditions.alertIsPresent());
			CommonDriverControls.getdriver().switchTo().alert().sendKeys(message);
			Thread.sleep(2000);
			Log.info("Successfully message" + message + "is send to alert");
			System.out.println("Successfully message" + message + "is send to alert");
			return "Successfully message" + message + "is send to alert";
		} catch (Exception e) {
			Log.error("Failed-message" + message + "is not send to alert" + "due to" + e);
			System.out.println("Failed-message" + message + "is not send to alert");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}
}
