package framework.Implementation;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.CommonDriver.CommonDriverControls;
import framework.Contracts.IBrowserControls;
import framework.log4j.Log;

public class CommonBrowserControls implements IBrowserControls {

	WebDriver driver = CommonDriverControls.getdriver();
	WebDriverWait wait = new WebDriverWait(driver, 40);

	public String deleteAllCookies() {

		try {
			driver.manage().deleteAllCookies();
			Log.info("Cookies are deleted");
			System.out.println("Cookies are deleted");
			return "Cookies are deleted";
		} catch (Exception e) {
			Log.error("Cookies are not deleted" + "due to" + e);
			System.out.println("Cookies are not deleted");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	public String maximizeWindow() {
		try {
			driver.manage().window().maximize();
			Log.info("Browser window is maximized");
			System.out.println("Browser window is maximized");
			return "Browser window is maximized";
		} catch (Exception e) {
			Log.error("Browser window is not maximized" + "due to" + e);
			System.out.println("Browser window is not maximized");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);

		}
	}

	public static void checkUrlIsNotEmpty(String url) {
		try {
			if (url.isEmpty()) {
				url = "about:blank";
				Log.info("URL is empty");
				System.out.println("URL is empty");
			}
		} catch (Exception e) {
			Log.error("Some error appeared related URL" + "due to" + e);
			System.out.println("Some error appeared related URL");
			e.printStackTrace();
		}
	}

	public String getUrl(String url) {
		if (url.isEmpty())
			CommonBrowserControls.checkUrlIsNotEmpty(url);
		try {
			driver.get(url);
			Log.info(url + " -- This URL is Lauched in Browser");
			System.out.println(url + " -- This URL is Lauched in Browser");
			return url + " -- This URL is Lauched in Browser";
		} catch (Exception e) {
			Log.error(url + " -- This URL is not Lauched in Browser" + "due to" + e);
			System.out.println(url + " -- This URL is not Lauched in Browser");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String closeBrowser() throws Exception {
		try {
			if (driver != null) {
				driver.close();
				Log.info("Browser is closed");
				System.out.println("Browser is closed");

			}
			return "Browser is closed";
		} catch (Exception e) {
			Log.error("Browser is not closed" + "due to" + e);
			System.out.println("Browser is not closed");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String closeAllBrowser() throws Exception {
		try {
			if (driver != null) {
				driver.quit();
				Log.info("All Browsers are closed");
				System.out.println("All Browsers are closed");

			}
			return "All Browsers are closed";

		} catch (Exception e) {
			Log.error("All Browsers are  not closed" + "due to" + e);
			System.out.println("All Browsers are  not closed");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String getTitle() throws Exception {
		try {
			driver.getTitle();
			Log.info("Page Title is received as" + driver.getTitle());
			System.out.println("Page Title is received as" + driver.getTitle());
			return (driver.getTitle());

		} catch (Exception e) {
			Log.error("Page Title is not available" + "due to" + e);
			System.out.println("Page Title is not available");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String getAttribute(By oBy, String Text) throws Exception {
		try {
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(oBy));
			el1.getAttribute(Text);
			Log.info("Attribute Value is received as- " + el1.getAttribute(Text));
			System.out.println("Attribute Value is received as- " + el1.getAttribute(Text));
			return (el1.getAttribute(Text));

		} catch (Exception e) {
			Log.error("Attribute Value is not available" + "due to" + e);
			System.out.println("Attribute Value is not available");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String getPageSource() throws Exception {
		try {
			driver.getPageSource();
			Log.info("Page Source is received as" + driver.getPageSource());
			System.out.println("Page Source is received as" + driver.getPageSource());
			return "Page Source is received as" + driver.getPageSource();
		} catch (Exception e) {
			Log.error("Page Source is not available " + "due to" + e);
			System.out.println("Page Source is not available");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String getCurrentUrl() throws Exception {
		try {
			driver.getCurrentUrl();
			Log.info("Current URL is received as" + driver.getCurrentUrl());
			System.out.println("Current URL is received as" + driver.getCurrentUrl());
			return "Current URL is received as" + driver.getCurrentUrl();
		} catch (Exception e) {
			Log.error("Current URL is not available " + "due to" + e);
			System.out.println("Current URL is not available");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String navigateTO(String url) throws Exception {
		try {
			driver.navigate().to(url);
			Log.info("URL is Lauched in Browser");
			System.out.println("URL is Lauched in Browser");
			return "URL is Lauched in Browser";
		} catch (Exception e) {
			Log.error("URL is not Lauched in Browser" + "due to" + e);
			System.out.println("URL is not Lauched in Browser");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String navigateRefresh() throws Exception {
		try {
			driver.navigate().refresh();
			Log.info("Page is refreshed");
			System.out.println("Page is refreshed");
			return "Page is refreshed";
		} catch (Exception e) {
			Log.error("Page is not refreshed" + "due to" + e);
			System.out.println("Page is not refreshed");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String navigateForward() throws Exception {
		try {
			driver.navigate().forward();
			Log.info("Browser is Forwarded");
			System.out.println("Browser is Forwarded");
			return "Browser is Forwarded";
		} catch (Exception e) {
			Log.error("Browser is not Forwarded" + "due to" + e);
			System.out.println("Browser is not Forwarded");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	public String navigateBack() throws Exception {
		try {
			driver.navigate().back();
			Log.info("Browser is moved back");
			System.out.println("Browser is moved back");
			return "Browser is moved back";
		} catch (Exception e) {
			Log.error("Browser is not moved back" + "due to" + e);
			System.out.println("Browser is not moved back");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	public void ImplicitWait(int TimeValue) {

		driver.manage().timeouts().implicitlyWait(TimeValue, TimeUnit.SECONDS);

	}

}