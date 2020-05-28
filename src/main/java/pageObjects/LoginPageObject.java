package pageObjects;

import framework.Operation.UIOperation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class LoginPageObject extends UIOperation {



	private static By usernameXpath = By.xpath("//input[@name=\"username\"]");
	private static By passwordXpath = By.xpath("//input[@name=\"password\"]");
	private  static By loginButtonXpath = By.xpath("//input[@value=\"Log In\"] ");
	private static  By loginErrorMessageText=By.xpath("//p[contains(text(),'The username and password could not be verified.')]");

	public LoginPageObject(WebDriver driver) {
		super(driver);
	}

	public void openWebsite(String url){
	    openUrl(url);
	}

	public void enterUsername(String usernameText) throws Exception {
		setText(usernameXpath,usernameText);
	}

	public void enterPassword(String passwordText) throws Exception {
		setText(passwordXpath,passwordText);
	}

	public void clickLogin() throws Exception {
        click(loginButtonXpath);
	}

	public void verifyLoginErrorMessageDisplayed() throws Exception {


		String actualErrorMessage=getText(loginErrorMessageText);
		String expectedErrorMessage="The username and password could not be verified.";
		assertEquals(actualErrorMessage,expectedErrorMessage);

	}


	public void verifyUserGetsAccountOverviewPage() throws Exception {

		String actualPageTitle=getTitle();
		String expectedPageTitle="ParaBank | Accounts Overview";
		assertEquals(actualPageTitle,expectedPageTitle);
		//driver.quit();
	}


}
