package framework.Contracts;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface IDropdownControls {

	public default void selectViaVisibleText(String Text) throws Exception {
	}

	public default void selectViaValue(String Text) throws Exception {
	}

	public default void selectViaIndex(int Index) throws Exception {
	}

	public default boolean isMultiple() throws Exception {
		return false;
	}

	public default List<WebElement> getALLOptions() throws Exception {
		return null;
	}

	public default List<WebElement> getALLSelectedOptions() throws Exception {
		return null;
	}
	
	
	public default WebElement getFirstSelectedOption() throws Exception {
		return null;
	}

}
