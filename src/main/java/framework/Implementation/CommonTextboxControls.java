package framework.Implementation;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.CommonDriver.CommonDriverControls;
import framework.Contracts.ITextboxControls;
import framework.log4j.Log;

public class CommonTextboxControls implements ITextboxControls {
	WebDriver driver = CommonDriverControls.getdriver();
	WebDriverWait wait = new WebDriverWait(driver, 40);

	public String setText(By oBy, String TextToSet) throws Exception {

		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			el1.sendKeys(TextToSet);
			Log.info("Successfully Text is Entered as" + TextToSet);
			System.out.println("Successfully Text is Entered as" + TextToSet);
			return "Successfully Text is Entered as" + TextToSet;
		} catch (Exception e) {
			Log.error("Failed-Text is not Entered due to" + e);
			System.out.println("Failed-Text is not Entered");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String clearText(By oBy) throws Exception {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			el1.clear();
			Log.info("Successfully Text is cleared ");
			System.out.println("Successfully Text is cleared");
			return "Successfully Text is cleared";
		} catch (Exception e) {
			Log.error("Failed-Text is not cleared due to" + e);
			System.out.println("Failed-Text is not cleared");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

}
