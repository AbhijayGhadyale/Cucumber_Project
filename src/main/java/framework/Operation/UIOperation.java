package framework.Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.CommonDriver.CommonDriverControls;
import framework.Implementation.CommonActionControls;
import framework.Implementation.CommonAlertControls;
import framework.Implementation.CommonBrowserControls;
import framework.Implementation.CommonCheckboxControls;
import framework.Implementation.CommonDropdownControls;
import framework.Implementation.CommonIFrameControls;
import framework.Implementation.CommonJavaScriptExecuter;
import framework.Implementation.CommonMouseControls;
import framework.Implementation.CommonTextboxControls;
import framework.Implementation.CommonWebElementControls;
import framework.Implementation.CommonWindowHandleControls;
import framework.Implementation.CommonWindowSnapshotControls;

public class UIOperation {


     CommonDriverControls objCommonDriverControls = new CommonDriverControls();
     CommonActionControls objCommonActionControls = new CommonActionControls();
     CommonAlertControls objCommonAlertControls = new CommonAlertControls();
     CommonBrowserControls objCommonBrowserControls = new CommonBrowserControls();
     CommonCheckboxControls objCommonCheckboxControls = new CommonCheckboxControls();
     CommonDropdownControls objCommonDropdownControls = new CommonDropdownControls();
     CommonIFrameControls objCommonIFrameControls = new CommonIFrameControls();
     CommonJavaScriptExecuter objCommonJavaScriptExecuter = new CommonJavaScriptExecuter();
     CommonMouseControls objCommonMouseControls = new CommonMouseControls();
     CommonTextboxControls objCommonTextboxControls = new CommonTextboxControls();
     CommonWebElementControls objCommonWebElementControls = new CommonWebElementControls();
     CommonWindowHandleControls objCommonWindowHandleControls = new CommonWindowHandleControls();
     CommonWindowSnapshotControls objCommonWindowSnapshotControls = new CommonWindowSnapshotControls();


    public UIOperation(WebDriver driver) {
        driver = CommonDriverControls.getdriver();
    }

    public void deleteAllCookies(){
		objCommonBrowserControls.deleteAllCookies();
	}

	public void maximizeWindow(){
        objCommonBrowserControls.maximizeWindow();
    }

    public void openUrl(String url) {

        objCommonBrowserControls.getUrl(url);
    }

    public void closeBrowser() throws Exception {
        objCommonBrowserControls.closeBrowser();
    }

    public void closeAllBrowser() throws Exception {
        objCommonBrowserControls.closeAllBrowser();
    }
        //   closeAllBrowser  getTitle  getAttribute getPageSource  getCurrentUrl   navigateTO   navigateRefresh navigateForward navigateBack ImplicitWait

    public void setText(By oBy, String text) throws Exception {
        objCommonTextboxControls.setText(oBy,text);
    }

    public void click(By oBy) throws Exception {
        objCommonWebElementControls.click(oBy);
    }

    public String getText(By oBy) throws Exception {
        return objCommonWebElementControls.getText(oBy);
    }

    public String getTitle() throws Exception {
       return objCommonBrowserControls.getTitle();
    }
}
