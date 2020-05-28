package framework.Contracts;

import org.openqa.selenium.WebElement;

public interface IActionControls {

	public default void dragAndDrop(WebElement element1, WebElement element2) throws Exception {

	}

	public default void moveToElement(WebElement element) throws Exception {

	}

	public default void rightClick(WebElement element) throws Exception {

	}

	public default void doubleClick(WebElement element) throws Exception {

	}

	public default void moveToElementClick(WebElement element) throws Exception {

	}

	public default void dragAndDropBy(WebElement element, int X, int Y) throws Exception {

	}

	public default void moveByOffset(WebElement element, int X, int Y) throws Exception {

	}

}
