package Library;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void Capturescreenshot(WebDriver dv, String screenshotname) throws Exception {

	TakesScreenshot scrShot = (TakesScreenshot)dv;
	File ScrFile = scrShot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ScrFile, new File("./Screenshots/" + screenshotname + timestamp() + ".png"));
	System.out.println("Screenshot captured");
	
	}
	
	private static String timestamp() {
		
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	
	}
	
	
}
