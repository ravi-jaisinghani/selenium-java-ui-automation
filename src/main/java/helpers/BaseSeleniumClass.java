package helpers;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 * BaseSeleniumClass contains Driver initialization and driver basic operations 
 *
 * @author ravi.jaisinghani
 */


public class BaseSeleniumClass 
{
	
   public static WebDriver driver=null;
   
   private static BaseSeleniumClass baseSeleniumClass=null;
   
   private BaseSeleniumClass()
   {
	 
	   if(FreeleticsAUT.browserName.equalsIgnoreCase("Chrome"))
       {   
		   LoggerClass.info("Initializing Chrome Webdriver");
		   WebDriverManager.chromedriver().setup();		   
		   driver=new ChromeDriver();
       }
       else if(FreeleticsAUT.browserName.equalsIgnoreCase("Firefox"))
       {
    	   LoggerClass.info("Initializing Firefox Webdriver");     	
    	   WebDriverManager.firefoxdriver().setup();
    	   driver= new FirefoxDriver();
    	   
    	}
       else if (FreeleticsAUT.browserName.equalsIgnoreCase("Edge"))
       {
    	   LoggerClass.info("Initializing Edge Webdriver");
    	   WebDriverManager.edgedriver().setup();
    	   driver= new EdgeDriver();
    	   
       }
	      LoggerClass.info("Performing Webdriver Setup operation");
	      driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

   }
   
  public static BaseSeleniumClass getInstanceofSeleniumWebdriver()
  {
       if(baseSeleniumClass==null){
    	   baseSeleniumClass = new BaseSeleniumClass();
       }
       return baseSeleniumClass;
   }
   
   public WebDriver getDriver()
   {
	  LoggerClass.info("Returning the Webdriver Instance");  
   	  return driver;
   }
   
   public static void quit()
   {
      driver.quit();
      LoggerClass.info("Quiting the Webdriver");
      driver=null; 
   }
   public static void close()
   {
      driver.close();
      LoggerClass.info("Closing the Webdriver");
      driver=null;  
   }   
   public static void openurl(String URL)
   {
	  
      driver.get(URL);
      LoggerClass.info("Launching URL"+URL);
   }
}