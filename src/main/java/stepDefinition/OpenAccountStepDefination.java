package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.CommonDriver.CommonDriverControls;
import org.openqa.selenium.WebDriver;
import pageObjects.AccountsOverviewPageObject;
import pageObjects.LoginPageObject;

public class OpenAccountStepDefination<driver> {

	WebDriver driver=CommonDriverControls.getdriver();
	AccountsOverviewPageObject objAccountsOverviewPageObject = new AccountsOverviewPageObject(driver);

	@When("^User clicks Open new Account Page$")
	public void userClicksOpenNewAccountPage() throws Exception {
		objAccountsOverviewPageObject.clickOpenAccountLink();
	}

	@Then("^User gets the Open new Account Page$")
	public void userGetsTheOpenNewAccountPage() throws Exception {
		objAccountsOverviewPageObject.verifyOpenNewAccountPageDisplayed();
	}
}