package stepDefinition;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.CommonDriver.CommonDriverControls;
import pageObjects.LoginPageObject;

public class LoginStepDefinition<driver> {

	WebDriver driver=CommonDriverControls.getdriver();
	LoginPageObject objLoginPageObject = new LoginPageObject(driver);

	@Given("^User have opened the Chrome and launched the parabank application$")
	public void User_have_opened_the_Chrome_and_launched_the_parabank_application(){
		objLoginPageObject.openWebsite("https://parabank.parasoft.com/parabank/index.htm");
	}

	@Given("^User have entered the wrong Username and Password$")
	public void User_have_entered_the_wrong_Username_and_Password() throws Throwable {
		objLoginPageObject.enterUsername("admin");
		objLoginPageObject.enterPassword("admin");
			}

	@When("^User clicks Login Button$")
	public void User_clicks_Login_Button() throws Throwable {
		//driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		objLoginPageObject.clickLogin();
	}

	@Then("^User gets the error message$")
	public void User_gets_the_error_message() throws Throwable {
		objLoginPageObject.verifyLoginErrorMessageDisplayed();
		
	}
	
	@Given("^User have entered the correct Username and Password$")
	public void User_have_entered_the_correct_Username_and_Password() throws Throwable {
		objLoginPageObject.enterUsername("john");
		objLoginPageObject.enterPassword("demo");

	}
	
	
	@Then("^User gets the account overview page$")
	public void User_gets_the_account_overview_page() throws Throwable {
		objLoginPageObject.verifyUserGetsAccountOverviewPage();
//		objLoginPageObject.closeBrowser();
	}
	
}