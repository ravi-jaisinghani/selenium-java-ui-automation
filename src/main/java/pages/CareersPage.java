package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.LoggerClass;


/**
 *  CareersPage: Contains Page objects and actions of Careers page
 *
 * @author ravi.jaisinghani
 */

public class CareersPage {
   private WebDriver driver;

   @FindBy(xpath = "*//a[contains(@href,'/en/corporate/jobs/')]")
   private WebElement openeningsButton;

  
   //Constructor
   public CareersPage (WebDriver driver){
       this.driver=driver;

       //Initialize Elements
       PageFactory.initElements(driver, this);
   }

  
   public void clikOnOpeneningsButton(){
	   openeningsButton.click();
	   LoggerClass.info("Clicked on Openings button");
   }
}