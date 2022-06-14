package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.LoggerClass;


/**
 *  JobsPage: Contains Page objects and actions of  Jobs Page
 *
 * @author ravi.jaisinghani
 */


public class JobsPage {
   private WebDriver driver;

   @FindBy(xpath = "*//div[@id='engineering']/descendant::a[contains(text(),'QA Engineer')]")
   private WebElement qaPosition;

  
   //Constructor
   public JobsPage (WebDriver driver){
       this.driver=driver;

       //Initialize Elements
       PageFactory.initElements(driver, this);
   }

  
   public void clikOnQaPosition(){
	   qaPosition.click();
	   LoggerClass.info("Clicked on Qa Position Link");
   }
}