package framework.Contracts;

import org.openqa.selenium.By;

public interface IJavaScriptExecuter {

	public String executeJavaScript(String scriptToExecute,By oBy) throws Exception;

	public String scrollDown(int value,int value2) throws Exception;

	public void executeJavaScriptWithReturnValue(String scriptToExecute) throws Exception;

	public void executeAsyncJavaScript(String scriptToExecute, Object[] args) throws Exception;

	public String scrollUp(int value,int value2) throws Exception;

}
