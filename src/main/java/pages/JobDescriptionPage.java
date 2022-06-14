package pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.LoggerClass;


/**
 *  JobDescriptionPage: Contains Page objects and actions of  Job Description Page
 *
 * @author ravi.jaisinghani
 */

public class JobDescriptionPage {
   private WebDriver driver;
  
   
   @FindBy(xpath = "*//h1[contains(text(),'QA Engineer')]")
   private WebElement jobDescriptionTitle;

   @FindBy(xpath = "*//section[@itemprop='description']")
   private WebElement jobDescription;
   
   @FindBy(xpath = "*//section[@itemprop='responsibilities']")
   private WebElement jobResponsibilitiesSection;
   
   @FindBy(xpath = "*//section[@itemprop='responsibilities']/descendant::li")
   private List<WebElement> jobResponsibilities;
   
   @FindBy(xpath = "*//section[@itemprop='experienceRequirements']")
   private WebElement jobProfileSection;
   
   @FindBy(xpath = "*//section[@itemprop='experienceRequirements']/descendant::li")
   private List<WebElement> jobProfiles;
   
   @FindBy(xpath = "*//span[contains(text(),'Apply now')]")
   private WebElement applyNow;
   
   
  
   //Constructor
   public JobDescriptionPage (WebDriver driver){
       this.driver=driver;

       //Initialize Elements
       PageFactory.initElements(driver, this);
   }

   public String getJobDiscriptionTitle() {
	   
	   LoggerClass.info("Fetching Job Description Title");
	   return jobDescriptionTitle.getText().toString();
   }
   
   public boolean isJobDiscriptionDisplayed() {
	   
	   return jobDescription.isDisplayed();
   }
   
   public boolean isProfileSectionDisplayed() {
	   
	   return jobProfileSection.isDisplayed();
   }
   
   public boolean isRsponsibilitieSectionDisplayed() {
	   
	   
	   return jobResponsibilitiesSection.isDisplayed();
   } 
   
   public int getjobResponsibilities() {
	   
	   LoggerClass.info("Fetching number of job Responsibilities points");
	   return jobResponsibilities.size();
   }
  
   public int getjobProfiles() {
	   
	   LoggerClass.info("Fetching number of job profile points");
	   return jobProfiles.size();
   }
   
   public void clikOnApplyNowButton(){
	   applyNow.click();
	   LoggerClass.info("Clicked on Apply Now button");
   }
}