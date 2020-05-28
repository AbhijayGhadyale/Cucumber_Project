package framework.Implementation;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.CommonDriver.CommonDriverControls;
import framework.Contracts.IJavaScriptExecuter;
import framework.log4j.Log;

public class CommonJavaScriptExecuter implements IJavaScriptExecuter {
	WebDriver driver = CommonDriverControls.getdriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, 40);

	public String executeJavaScript(String scriptToExecute,By oBy) throws Exception {
		try {
			
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript(scriptToExecute, el1);
			
			Log.info("Successfully Script using JavaScript Executed is:" + scriptToExecute);
			System.out.println("Successfully Script using JavaScript Executed is:" + scriptToExecute);
			return "Successfully Script using JavaScript Executed is:" + scriptToExecute;

		} catch (Exception e) {
			Log.error("Failed-Script using JavaScript is not Executed" + "due to" + e);
			System.out.println("Failed-Script using JavaScript is not Executed");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	public String scrollDown(int value,int value1) throws Exception {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy("+value+","+value1+")", "");
			Thread.sleep(1000);
			return "Successfully scrolling down is Done";
		} catch (Exception e) {
			Log.error("Scroll down is not done" + "due to" + e);
			System.out.println("Scroll down is not done");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
		

	}

	

	public void executeAsyncJavaScript(String scriptToExecute, Object[] args) throws Exception {
		
		// Call executeAsyncScript() method to wait for 5 seconds
		//js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

	}


	public String scrollUp(int value,int value1) throws Exception {
		// TODO Auto-generated method stub
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy("+value+","+value1+")", "");
			Thread.sleep(1000);
			return "Successfully scrolling up is Done";
		} catch (Exception e) {
			Log.error("Scroll up is not done" + "due to" + e);
			System.out.println("Scroll up is not done");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}
	
	
	
	public String scrollUpJ() throws Exception {
		// TODO Auto-generated method stub
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-50)");
			Thread.sleep(500);
			return "Successfully scrolling Down is Done";
		} catch (Exception e) {
			Log.error("Scroll Down is not done" + "due to" + e);
			System.out.println("Scroll Down is not done");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}
	
	
	public String scrollDownJ() throws Exception {
		// TODO Auto-generated method stub
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,50)");
			Thread.sleep(500);
			return "Successfully scrolling up is Done";
		} catch (Exception e) {
			Log.error("Scroll up is not done" + "due to" + e);
			System.out.println("Scroll up is not done");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}
	
	

	
	public String scrollDownR() throws Exception {
		// TODO Auto-generated method stub
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			return "Successfully scrolling up is Done";
		} catch (Exception e) {
			Log.error("Scroll down is not done" + "due to" + e);
			System.out.println("Scroll down is not done");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	
	public String scrollUpR() throws Exception {
		// TODO Auto-generated method stub
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_UP);
			robot.keyRelease(KeyEvent.VK_UP);
			Thread.sleep(500);
			return "Successfully scrolling up is Done";
		} catch (Exception e) {
			Log.error("Scroll up is not done" + "due to" + e);
			System.out.println("Scroll up is not done");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	
	
	
	public String scrollTillElement(By oBy) throws Exception {
		// TODO Auto-generated method stub
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el1);
			Thread.sleep(500);
			return "Successfully scrolling  is Done till " +el1;
		} catch (Exception e) {
			Log.error("Scroll is not done" + "due to" + e);
			System.out.println("Scroll is not done");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	@Override
	public void executeJavaScriptWithReturnValue(String scriptToExecute) throws Exception {
		// TODO Auto-generated method stub
		
	}

	


	
}
