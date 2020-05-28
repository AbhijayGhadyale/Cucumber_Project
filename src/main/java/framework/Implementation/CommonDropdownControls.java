package framework.Implementation;

import java.util.List;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.CommonDriver.CommonDriverControls;
import framework.Contracts.IDropdownControls;
import framework.log4j.Log;

public class CommonDropdownControls implements IDropdownControls {

	WebDriver driver = CommonDriverControls.getdriver();
	WebDriverWait wait = new WebDriverWait(driver, 40);

	public List<WebElement> getALLOptions(By oBy) {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			Select dropDown = new Select(el1);
			Thread.sleep(3000);
			Log.info("Successfully All Options retrieved are:" + dropDown.getOptions());
			System.out.println("Successfully All Options retrieved are:" + dropDown.getOptions());
			return (dropDown.getOptions());
		} catch (Exception e) {
			Log.error("Failed-All Options are not retrieved" + "due to" + e);
			System.out.println("Failed-All Options are not retrieved" + "due to" + e);
			e.printStackTrace();
			return null;
		}

	}

	public List<WebElement> getALLSelectedOptions(By oBy) {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			Select dropDown = new Select(el1);
			Thread.sleep(3000);
			Log.info("Successfully All selected Options retrieved are:" + dropDown.getAllSelectedOptions());
			System.out.println("Successfully All selected Options retrieved are:" + dropDown.getAllSelectedOptions());
			return (dropDown.getAllSelectedOptions());
		} catch (Exception e) {
			Log.error("Failed-All selected Options are not retrieved" + "due to" + e);
			System.out.println("Failed-All selected Options are not retrieved" + "due to" + e);
			e.printStackTrace();
			return null;
		}
	}

	public WebElement getFirstSelectedOption(By oBy) {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			Select dropDown = new Select(el1);
			Thread.sleep(3000);
			Log.info("Successfully First selected Option retrieved is:" + dropDown.getFirstSelectedOption());
			System.out.println("Successfully First selected Option retrieved is:" + dropDown.getFirstSelectedOption());
			return (dropDown.getFirstSelectedOption());

		} catch (Exception e) {
			Log.error("Failed-First selected Option is not retrieved" + "due to" + e);
			System.out.println("Failed-First selected Option is not retrieved" + "due to" + e);
			e.printStackTrace();
			return null;
		}

	}

	public boolean isMultiple(By oBy) throws Exception {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			Select dropDown = new Select(el1);
			Thread.sleep(3000);
			Log.info("Is Dropdown Field allowing Multiple selection:" + dropDown.isMultiple());
			System.out.println("Is Dropdown Field allowing Multiple selection:" + dropDown.isMultiple());
			return (dropDown.isMultiple());

		} catch (Exception e) {
			Log.error("Dropdown Field is not allowing Multiple selection" + "due to" + e);
			System.out.println("Dropdown Field is not allowing Multiple selection" + "due to" + e);
			return false;
		}

	}

	public String selectViaIndex(By oBy, int Index) throws Exception {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			Select dropDown = new Select(el1);
			dropDown.selectByIndex(Index);
			Thread.sleep(3000);
			Log.info("Dropdown Field is selected using Index" + Index);
			System.out.println("Dropdown Field is selected using Index" + Index);
			return "Dropdown Field is selected using Index" + Index;
		} catch (Exception e) {
			Log.error("Dropdown Field is not selected Using Index" + "due to" + e);
			System.out.println("Dropdown Field is not selected Using Index" + "due to" + e);
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String selectViaValue(By oBy, String Value) throws Exception {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			Select dropDown = new Select(el1);
			dropDown.selectByValue(Value);
			Thread.sleep(3000);
			Log.info("Dropdown Field is selected using Value" + Value);
			System.out.println("Dropdown Field is selected using Value" + Value);
			return "Dropdown Field is selected using Value" + Value;
		} catch (Exception e) {
			Log.error("Dropdown Field is not selected using Value" + "due to" + e);
			System.out.println("Dropdown Field is not selected using Value" + "due to" + e);
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String selectViaVisibleText(By oBy, String Text) throws Exception {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			Select dropDown = new Select(el1);
			dropDown.selectByVisibleText(Text);
			Thread.sleep(3000);
			Log.info("Dropdown Field is selected using Text:" + Text);
			System.out.println("Dropdown Field is selected using Text:" + Text);
			return "Dropdown Field is selected using Text:" + Text;
		} catch (Exception e) {
			Log.error("Dropdown Field is not selected using Text" + "due to" + e);
			System.out.println("Dropdown Field is not selected using Text" + "due to" + e);
			return ExceptionUtils.getStackTrace(e);
		}

	}

}
