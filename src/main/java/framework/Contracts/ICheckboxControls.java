package framework.Contracts;


import org.openqa.selenium.WebElement;


public interface ICheckboxControls {

	public default void changeCheckBoxStatus(WebElement element,boolean status)throws Exception {

	}
}
