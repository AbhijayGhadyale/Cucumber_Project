package framework.Implementation;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.CommonDriver.CommonDriverControls;
import framework.Contracts.IWebElementControls;
import framework.log4j.Log;

public class CommonWebElementControls implements IWebElementControls {
	WebDriver driver = CommonDriverControls.getdriver();
	WebDriverWait wait = new WebDriverWait(driver, 40);

	public String click(By oBy) throws Exception {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			el1.click();
			Thread.sleep(2000);
			Log.info("Successfully Click is done on Element" + oBy);
			System.out.println("Successfully Click is done on Element" + oBy);
			return "Successfully Click is done on Element" + oBy;
			
		} catch (Exception e) {
			Log.error("Failed-Click is not done on Element" + e);
			System.out.println("Failed-Click is not done on Element");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
		
	}

	public String getText(By oBy) throws Exception {

		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			String text = el1.getText();
			Log.info("Successfully text is retrived as" + text);
			System.out.println("Successfully text is retrived as" + text);
			return text;
		} catch (Exception e) {
			Log.error("Failed-text is not retrived due to" + e);
			System.out.println("Failed-text is not retrived");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String getAttribute(By oBy, String attribute) throws Exception {
	 try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			String text = el1.getAttribute(attribute);
			Log.info("Successfully attribute is retrived as" + text);
			System.out.println("Successfully attribute is retrived as" + text);
			return el1.getAttribute(attribute);
		} catch (Exception e) {
			Log.error("Failed-attribute is not retrived due to" + e);
			System.out.println("Failed-attribute is not retrived");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	
		
	}

	public String getCssvalue(By oBy, String csspropertytype) throws Exception {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			String text = el1.getAttribute(csspropertytype);
			Log.info("Successfully CSSValue is retrived as" + text);
			System.out.println("Successfully CSSValue is retrived as" + text);
			return text;
		} catch (Exception e) {
			Log.error("Failed-CSSValue is not retrived due to" + e);
			System.out.println("Failed-CSSValue is not retrived");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	public boolean isElementDetected(By oBy) throws Exception {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
	     	boolean Value = el1.isEnabled();
			Log.info("Is Element Detected" + Value);
			System.out.println("Is Element Detected" + Value);
			return Value;
		} catch (Exception e) {
			Log.error("Failed-Element is not Detected due to" + e);
			System.out.println("Failed-Element is not Detected");
			e.printStackTrace();
			return false;
		}

	}

	public boolean isElementVisible(By oBy) throws Exception {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			boolean Value = el1.isDisplayed();
			Log.info("Is Element Displayed" + Value);
			System.out.println("Is Element Displayed" + Value);
			return Value;
		} catch (Exception e) {
			Log.error("Failed-Element is not Displayed due to" + e);
			System.out.println("Failed-Element is not Displayed");
			e.printStackTrace();
			return false;
		}

	}

	public boolean isElementSelected(By oBy) throws Exception {
	   try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			boolean Value = el1.isSelected();
			Log.info("Is Element Selected" + Value);
			System.out.println("Is Element Selected" + Value);
			return Value;
		} catch (Exception e) {
			Log.error("Failed-Element is not Selected due to" + e);
			System.out.println("Failed-Element is not Selected");
			e.printStackTrace();
			return false;
		}

	}

}
