package framework.Implementation;

import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.lang3.exception.ExceptionUtils;
import framework.CommonDriver.CommonDriverControls;
import framework.Contracts.IwindowHandling;
import framework.log4j.Log;

public class CommonWindowHandleControls implements IwindowHandling {

	ArrayList<String> WindowNames;

	public void getListOfWindowHandles() throws Exception {

		try {
			WindowNames = new ArrayList<String>(CommonDriverControls.getdriver().getWindowHandles());
			System.out.println(
					"Successfully window switch is done for window:" + WindowNames.get(1) + WindowNames.get(0));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String switchToSecondWindow() throws Exception {

		try {
			CommonDriverControls.getdriver().switchTo().window(WindowNames.get(1));
			Log.info("Successfully child window switch is done for window :" + WindowNames.get(1));
			System.out.println("Successfully window switch is done for window:" + WindowNames.get(1));
			return "Successfully window switch is done for window:" + WindowNames.get(1);
		} catch (Exception e) {
			Log.info("Failed-window switch is not done for window :" + WindowNames.get(1));
			System.out.println("Failed-window switch is not done for window:" + WindowNames.get(1));
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

	public String switchToFirstWindow() throws Exception {

		try {
			CommonDriverControls.getdriver().switchTo().window(WindowNames.get(0));
			Log.info("Successfully child window switch is done for window :" + WindowNames.get(1));
			System.out.println("Successfully window switch is done for window:" + WindowNames.get(1));
			return "Successfully window switch is done for window:" + WindowNames.get(1);

		} catch (Exception e) {
			Log.info("Failed-window switch is not done for window :" + WindowNames.get(1));
			System.out.println("Failed-window switch is not done for window:" + WindowNames.get(1));
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String getWindowHandle() throws Exception {
		try {
			String WindiowHandle = CommonDriverControls.getdriver().getWindowHandle();
			Log.info("Successfully window Handle is done for window :" + WindiowHandle);
			System.out.println("Successfully window Handle is done for window :" + WindiowHandle);
			return WindiowHandle;

		} catch (Exception e) {
			Log.error("Failed-window Handle is not done for window " + "due to" + e);
			System.out.println("Failed-window Handle is not done for window ");
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public Set<String> getWindowHandles() throws Exception {
		try {
			Set<String> WindiowHandles = CommonDriverControls.getdriver().getWindowHandles();
			Log.info("Successfully window Handle is done for windows :" + WindiowHandles);
			System.out.println("Successfully window Handle is done for windows:" + WindiowHandles);
			return WindiowHandles;

		} catch (Exception e) {
			Log.error("Failed-window Handle is not done for all windows " + "due to" + e);
			System.out.println("Failed-window Handle is not done for all windows ");
			e.printStackTrace();
			return null;
		}

	}

	public String switchToWindow(String WindowName) throws Exception {
		try {
			CommonDriverControls.getdriver().switchTo().window(WindowName);
			Log.info("Successfully window switch is done for window :" + WindowName);
			System.out.println("Successfully window switch is done for window:" + WindowName);
			return "Successfully window switch is done for window:" + WindowName;

		} catch (Exception e) {
			Log.info("Failed-window switch is not done for window :" + WindowName);
			System.out.println("Failed-window switch is not done for window:" + WindowName);
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	public String CloseExtraWindowAndSwitchFirstTab() throws Exception {
		ArrayList<String> tabs2 = new ArrayList<String>(CommonDriverControls.getdriver().getWindowHandles());

		try {
			CommonDriverControls.getdriver().switchTo().window(tabs2.get(1));
			CommonDriverControls.getdriver().close();
			CommonDriverControls.getdriver().switchTo().window(tabs2.get(0));
			Log.info("Successfully window switch and Close is done for window :" + tabs2.get(1) + tabs2.get(0));
			System.out.println("Successfully window switch and Close is done for window:" + tabs2.get(1) + tabs2.get(0));
            return "Successfully window switch and Close is done for window:" + tabs2.get(1) + tabs2.get(0);
		} catch (Exception e) {
			Log.info("Failed-window switch and Close is not done for window :" + tabs2.get(1) + tabs2.get(0));
			System.out.println("Failed-window switch and Close is not done for window:" + tabs2.get(1) + tabs2.get(0));
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}
	}

}
