package framework.Implementation;

import java.io.File;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import framework.CommonDriver.CommonDriverControls;
import framework.Contracts.IWindowSnapshot;
import framework.log4j.Log;

public class CommonWindowSnapshotControls implements IWindowSnapshot {
	WebDriver driver = CommonDriverControls.getdriver();
	public File SrcFile;
	public File DestFile;
	static String PathOfSnapShotSuccess = System.getProperty("user.dir") + "//Snapshots//Success//";
	public static String PathOfSnapShotFailed = System.getProperty("user.dir") + "//Snapshots//Failed//";

	public String takeSnapShot(String fileName) throws Exception {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

			if (fileName.contains("fail") || fileName.contains("failed") || fileName.contains("Fail")
					|| fileName.contains("Failed")) {
				DestFile = new File(PathOfSnapShotFailed + fileName + timestamp + ".jpeg");
			} else {
				DestFile = new File(PathOfSnapShotSuccess + fileName + timestamp + ".jpeg");
			}

			FileUtils.copyFile(SrcFile, DestFile);

			Log.info("SnapShot File with Location - " + SrcFile
					+ "- is created and Saved with Name and Location as -\n " + DestFile);
			System.out.println("SnapShot File with Location - " + SrcFile
					+ "- is created and Saved with Name and Location as - \n" + DestFile);

			Log.info("Screen Shot taking is Success");
			System.out.println("Screen Shot taking is Success");
			return "Screen Shot taking is Success";

		} catch (Exception e) {
			Log.error("Screen Shot taking is Failed" + "due to" + e);
			System.out.println("Screen Shot taking is Failed" + "due to" + e);
			e.printStackTrace();
			return ExceptionUtils.getStackTrace(e);
		}

	}

	// Take Screen Shot using Robot Framework ( of Whole Desktop Screen)
	
	public String getSnapShot() throws Exception {

		if (DestFile != null) {
			Log.info("Screen Shot is given");
			System.out.println("Screen Shot is given==========>" + DestFile.getAbsolutePath());
			return DestFile.getAbsolutePath();
		}

		Log.error("File is not available");
		System.out.println("File is not available");
		return null;

	}

	public String getSnapShotpath() throws Exception {

		if (DestFile != null) {
			Log.info("Screen Shot is given");
			System.out.println("Screen Shot is given");
			System.out.println(DestFile.getCanonicalPath());
			return DestFile.getCanonicalPath();
		}

		Log.error("File is not available");
		System.out.println("File is not available");
		return null;

	}

}
