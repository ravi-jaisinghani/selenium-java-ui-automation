package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.LoggerClass;

/**
 *  HomePage: Contains Page objects and actions of  Home page
 *
 * @author ravi.jaisinghani
 */

public class HomePage {
   private WebDriver driver;

   //Locators

   //Apply as Developer Button
   @FindBy(xpath = "*//footer/descendant::a[contains(@href,'/en/corporate')]")
   private WebElement careersLink;
   

   
   @FindBy(xpath = "*//button/span[contains(text(),'Accept all cookies')]")
   private WebElement acceptCookiesButton;

   //Constructor
   public HomePage(WebDriver driver){
       this.driver=driver;
       //Initialize Elements
       PageFactory.initElements(driver, this);
   }

   public void clickOnAcceptCookiesButton(){

	   acceptCookiesButton.click();
	   LoggerClass.info("Clicked on Accept Cookies Button");

   }
   
   public void clickOnCareersLink(){

	   careersLink.click();
	   LoggerClass.info("Clicked on Careers Link");

   }
}
