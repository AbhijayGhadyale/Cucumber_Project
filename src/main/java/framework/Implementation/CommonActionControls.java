package framework.Implementation;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.CommonDriver.CommonDriverControls;
import framework.Contracts.IActionControls;
import framework.log4j.Log;

public class CommonActionControls implements IActionControls {
	WebDriver driver = CommonDriverControls.getdriver();
	WebDriverWait wait = new WebDriverWait(driver, 40);

	public String doubleClick(By oBy) throws Exception {
		try {
			Actions action = new Actions(driver);
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			action.moveToElement(el1).doubleClick().perform();
			
			Log.info("Successfully Double Click is done on Element" + oBy);
			System.out.println("Successfully Double Click is done on Element" + oBy);
			return "Successfully Double Click is done on Element" + oBy;
		} catch (Exception e) {
			Log.error("Failed-Double Click is not done on Element" + oBy + "due to" + e);
			System.out.println("Failed-Double Click is not done on Element");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	public String dragAndDrop(By oBy1, By oBy2) throws Exception {
		try {
			Actions act = new Actions(driver);
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy1));
			WebElement el2 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy2));
			act.dragAndDrop(el1, el2).build().perform();
			
			Log.info("Successfully dragged" + el1 + "To" + el2);
			System.out.println("Successfully dragged" + el1 + "To" + el2);
			return "Successfully dragged" + el1 + "To" + el2;
		} catch (Exception e) {
			Log.error("Failed-dragging" + oBy1 + "To" + oBy2 + "is not done" + "due to" + e);
			System.out.println("Failed-dragging" + oBy1 + "To" + oBy2 + "is not done");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	public String dragAndDropBy(By oBy, int x, int y) throws Exception {
		try {
			Actions act = new Actions(driver);
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			act.dragAndDropBy(el1, x, y).build().perform();
			
			Log.info("Successfully dragged" + el1 + "To" + x + "," + y + "Location");
			System.out.println("Successfully dragged" + el1 + "To" + x + "," + y + "Location");
			return "Successfully dragged" + el1 + "To" + x + "," + y + "Location";

		} catch (Exception e) {
			Log.error("Failed-dragging" + oBy + "To" + x + "," + y + "Location" + "is not done" + "due to" + e);
			System.out
					.println("Failed-dragging" + oBy + "To" + x + "," + y + "Location" + "is not done" + "due to" + e);
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	public String moveToElement(By oBy) {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			Actions builder = new Actions(driver);
			Action mouseOver = builder.moveToElement(el1).build();
			mouseOver.perform();
			
			Log.info("Successfully Move To Element is performed for " + el1);
			System.out.println("Successfully Move To Element is performed for " + el1);
			return "Successfully Move To Element is performed for " + el1;
		} catch (Exception e) {
			Log.error("Failed-Move To Element is not performed for " + oBy + "due to" + e);
			System.out.println("Failed-Move To Element is not performed for " + oBy);
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String moveToElementClick(By oBy) {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			Actions builder = new Actions(driver);
			Action mouseOver = builder.moveToElement(el1).click().build();
			mouseOver.perform();
			
			Log.info("Successfully Move To Element and Click is performed for " + el1);
			System.out.println("Successfully Move To Element and Click is performed for " + el1);
			return "Successfully Move To Element and Click is performed for " + el1;
		} catch (Exception e) {
			Log.error("Failed-Move To Element and Click is not performed for " + oBy + "due to" + e);
			System.out.println("Failed-Move To Element and Click is not performed for " + oBy);
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String findOffsetOfElement(By oBy) {
		try {
				WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
				Point point = el1.getLocation();

				int xcord = point.getX();
				int ycord = point.getY();
				System.out.println(xcord + ycord);
			
			
			Log.info("Successfully Move To Offset and Click is performed for ");
			System.out.println("Successfully Move To Offset and Click is performed for ");
			return "Successfully Move To Offset and Click is performed for ";
		} catch (Exception e) {
			Log.error("Failed-Move To Offset and Click is not performed" + "due to" + e);
			System.out.println("Failed-Move To Offset and Click is not performed ");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}
	
	
	public String MoveBYOffsetAndClick(String X1,String X2) {
		try {
							
			Actions builder = new Actions(driver);
			Action mouseOver = builder.moveByOffset(Integer.parseInt(X1), Integer.parseInt(X2)).click().build();
			mouseOver.perform();
			
			Log.info("Successfully Move To Offset and Click is performed for ");
			System.out.println("Successfully Move To Offset and Click is performed for ");
			return "Successfully Move To Offset and Click is performed for ";
		} catch (Exception e) {
			Log.error("Failed-Move To Offset and Click is not performed" + "due to" + e);
			System.out.println("Failed-Move To Offset and Click is not performed ");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

}
