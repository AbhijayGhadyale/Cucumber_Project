package framework.Contracts;

public interface IAlertControls
{

	public default String acceptAlert() throws Exception {
		return null;

	}

	public default String rejectAlert() throws Exception {
		return null;

	}

	public default String getMessageFromAlert() throws Exception {
		return null;

	}

	public default boolean isAlertPresent() throws Exception {
		return false;

	}

	public default String sendMessageAlert(String message) throws Exception {
		return message;

	}

}
