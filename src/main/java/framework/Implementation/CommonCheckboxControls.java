package framework.Implementation;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.CommonDriver.CommonDriverControls;
import framework.log4j.Log;

public class CommonCheckboxControls {
	WebDriver driver = CommonDriverControls.getdriver();
	WebDriverWait wait = new WebDriverWait(driver, 40);

	public String changeCheckBoxStatus(By oBy) throws Exception {

		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			if (!(el1.isSelected())) {
				el1.click();
				Thread.sleep(500);
				Log.info("Successfully" + oBy + "Checkbox is checked");
				System.out.println("Successfully" + oBy + "Checkbox is checked");

			} else if (el1.isSelected()) {
				el1.click();
				Thread.sleep(500);
				Log.info("Successfully" + oBy + "Checkbox is unchecked");
				System.out.println("Successfully" + oBy + "Checkbox is unchecked");

			}
			return "Successfully" + oBy + "Checkbox is unchecked or checked";
		} catch (Exception e) {
			Log.error("Failed-" + oBy + "Checkbox checking or unchecking not done" + "due to" + e);
			System.out.println("Failed-" + oBy + "Checkbox checking or unchecking not done");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

}
