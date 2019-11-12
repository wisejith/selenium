package screensht;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public static class Capscr {
		
		public static void captureScreenShot(WebDriver driver) 
		{
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {

				FileUtils.copyFile(src, new File("C:\\scrsht\\scr.png"+time()));
				} 
			catch (IOException e) 
				{
				e.printStackTrace();
				}
		}

		public static String time() {

			return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		}

	}

	
}

