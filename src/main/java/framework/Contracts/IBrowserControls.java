package framework.Contracts;

public interface IBrowserControls {

	public default String openBrowser(String browserType) throws Exception {
		return null;
	}

	public default String closeBrowser() throws Exception {
		return null;
	}

	public default String closeAllBrowser() throws Exception {
		return null;
	}

	public default String getTitle() throws Exception {
		return null;
	}

	public default String getAttribute() throws Exception {
		return null;
		
	}
	
	public default String getPageSource() throws Exception {
		return null;
	}

	public default String getCurrentUrl() throws Exception {
		return null;
	}

	public default String navigateTO(String url) throws Exception {
		return null;
	}

	public default String navigateRefresh() throws Exception {
		return null;
	}

	public default String navigateForward() throws Exception {
		return null;
	}

	public default String navigateBack() throws Exception {
		return null;
	}

}
