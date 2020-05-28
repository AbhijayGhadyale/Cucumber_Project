package framework.Contracts;

import java.util.Set;

public interface IwindowHandling {

	public default void switchToChildWindow() throws Exception {
	}

	public default void switchToParentWindow() throws Exception {
	}

	public default String getWindowHandle() throws Exception {
		return null;
	}

	public default Set<String> getWindowHandles() throws Exception {
		return null;
	}

}
