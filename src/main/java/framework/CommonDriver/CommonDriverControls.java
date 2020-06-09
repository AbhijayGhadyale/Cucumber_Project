package framework.CommonDriver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CommonDriverControls {

	private static WebDriver driver;

	static File resourcesDirectory = new File("src/main/resources");
	static String resourcesPath = resourcesDirectory.getAbsolutePath();
	static String SupportingFiles = resourcesPath + "\\Supporting Files";
	public static final String ChromeDriverPath = SupportingFiles + "\\chromedriver.exe";

	public static WebDriver getdriver(){

        if (driver == null) {
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
            System.setProperty("webdriver.chrome.driver", ChromeDriverPath);

            driver = new ChromeDriver();

        } else {
            return driver;
        }
        return driver;
    }

}