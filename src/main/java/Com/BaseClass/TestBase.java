package Com.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class TestBase{
	public static WebDriver driver;
	public static Properties props;
	
	public TestBase(){
		
    try {
    	
	   props=new Properties();
	FileInputStream ip = new FileInputStream("E:\\javabatch\\Casestudy_Assigement\\src\\main\\java\\Com\\Config\\Config.Properties");
	                                            
	
	props.load(ip);
	
}
    catch(FileNotFoundException e) {
    	e.printStackTrace();
    }
    catch(IOException e) {
    	e.printStackTrace(); 
    	
}
	}
	
	public static void initialization() {
		
		String browsername = props.getProperty("browser");
		 System.setProperty("webdriver.chrome.driver", "E:\\chrome driver\\chromedriver.exe");

		  driver = new ChromeDriver(); 
		  
		  driver.manage().window().maximize();  
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.get(props.getProperty("url"));
	}
	public String getScreenShotPath() throws IOException
	   {
		   
		TakesScreenshot scrShot =((TakesScreenshot)driver);
	    File SourceFile=scrShot.getScreenshotAs(OutputType.FILE);
	    File DestFile=new File(".//ScreenShots//GoogleMap.png");
	    FileUtils.copyFile(SourceFile, DestFile);
		return null;
	   	
	   	
}
}