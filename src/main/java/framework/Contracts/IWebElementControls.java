package framework.Contracts;

import org.openqa.selenium.WebElement;

public interface IWebElementControls {

	public default void click(WebElement element) throws Exception {
	}

	public default String getText(WebElement element) throws Exception {
		return null;

	}

	public default String getAttribute(WebElement element, String attribute) throws Exception {
		return null;

	}

	public default String getCssvalue(WebElement element, String csspropertytype) throws Exception {
		return null;

	}

	public default boolean isElementDetected(WebElement element) throws Exception {
		return false;

	}

	public default boolean isElementVisible(WebElement element) throws Exception {
		return false;

	}

	public default boolean isElementSelected(WebElement element) throws Exception {
		return false;

	}

}
