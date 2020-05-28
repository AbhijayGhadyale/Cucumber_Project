package framework.Contracts;

public interface IIFrameControls {

	public default int totalNumberOfIframes() throws Exception {
		return 0;
	}

	public default String switchToIframeByIndex(int Index) throws Exception {
		return null;
	}

	public default String switchToIframeByName(String name) throws Exception {
		return null;
	}

	public default void switchToIframeByID() throws Exception {
	}

	public default void switchToIframeByWebElement() throws Exception {
	}

	public default String switchToParentIframe() throws Exception {
		return null;
	}

	public default String switchToDefaultContent() throws Exception {
		return null;
	}

}
