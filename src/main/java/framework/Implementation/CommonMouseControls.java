package framework.Implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.CommonDriver.CommonDriverControls;
import framework.Contracts.IMouseControls;
public class CommonMouseControls implements IMouseControls {
	WebDriver driver = CommonDriverControls.getdriver();
	WebDriverWait wait = new WebDriverWait(driver, 40);

	public void clickAndHold() throws Exception {

	}

	public void contextClick(By oBy) throws Exception {
	}

	public void keyDown(String modifier_Downkey) {

	}

	public void keyUp(String modifier_Upkey) {

	}

	public void release() {

	}

}
