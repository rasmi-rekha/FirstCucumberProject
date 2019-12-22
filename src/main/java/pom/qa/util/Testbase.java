package pom.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public Testbase() {
		
		try {
			
			prop =new Properties();
			
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/pom/qa/config/config.properties");
			prop.load(fis);
					}	catch(IOException e) {
						
						e.getMessage();	
						
					}		

	}
	
	public static void initialization(String browserName){
		
	//String browsername=prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
		
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\seldriver2019\\chromedriver.exe");
		 driver=new ChromeDriver();
		 	
	}
if(browserName.equals("FF"))
		
	{
		
	System.setProperty("webdriver.gecko.driver", "D:\\workspace\\seldriver2019\\geckodriver.exe");
	 driver= new FirefoxDriver();
		 	
	}	

   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
   driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
   
  // driver.get(prop.getProperty("loginURL"));
		
	}
	
	
	
	
	
}