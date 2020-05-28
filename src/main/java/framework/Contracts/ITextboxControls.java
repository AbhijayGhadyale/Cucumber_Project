package framework.Contracts;

import org.openqa.selenium.WebElement;

public interface ITextboxControls{

	public default void setText(WebElement element,String TextToSet)throws Exception {

	}
	
	public default void clearText(WebElement element)throws Exception {

	}
}
