package pageObjects;

import framework.Operation.UIOperation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class AccountsOverviewPageObject extends UIOperation {

    public AccountsOverviewPageObject(WebDriver driver) {
        super(driver);
    }


    private static By openNewAccountLinkXpath = By.xpath("//a[@href=\"/parabank/openaccount.htm\"]");

    public void clickOpenAccountLink() throws Exception {
        click(openNewAccountLinkXpath);
    }

    public void verifyOpenNewAccountPageDisplayed() throws Exception {
        String actualPageTitleMessage=getTitle();
        String expectedPageTitleMessage="ParaBank | Open Account";
        assertEquals(actualPageTitleMessage,expectedPageTitleMessage);

    }


}
