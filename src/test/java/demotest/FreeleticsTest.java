package demotest;

import pages.HomePage;
import pages.*;
import helpers.BaseSeleniumClass;
import helpers.BaseUtils;
import helpers.LoggerClass;
import helpers.FreeleticsAUT;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import java.util.*;




/**
 *  FreeleticsTest: Contains Sample Freeletics Tests for given scenario's
 *
 * @author ravi.jaisinghani
 */


public class FreeleticsTest {
   WebDriver driver;

   @BeforeTest
   public void setup(){
	   LoggerClass.info("************************ Setup  Started ************************"); 
	   BaseSeleniumClass baseseleniumWd = BaseSeleniumClass.getInstanceofSeleniumWebdriver();
	   BaseSeleniumClass.openurl(FreeleticsAUT.URl);
	   driver=baseseleniumWd.getDriver();
	   LoggerClass.info("************************ Setup  Completed ************************"); 
	   
	   
   }

   @Test
   public void freeleticsSampleTest() {
       
	   
	   LoggerClass.startTestCase("freeleticsSampleTest");
	   String testDatafileName=this.getClass().getSimpleName()+".properties";
	   Properties testData=new Properties();
	   testData= BaseUtils.getTestDataFile(testDatafileName);
	   
	  
	   LoggerClass.info("Initializing Home Page"); 
       HomePage home = new HomePage(driver);
       home.clickOnAcceptCookiesButton();
       home.clickOnCareersLink();

       LoggerClass.info("Initializing Careers Page");
       CareersPage careerPage = new CareersPage(driver);
       careerPage.clikOnOpeneningsButton();
       
       
       LoggerClass.info("Initializing Jobs Page");
       JobsPage jobsPage = new JobsPage(driver);
       jobsPage.clikOnQaPosition();
       
       LoggerClass.info("Initializing Job Description Page");
       JobDescriptionPage jobDescriptionPage = new JobDescriptionPage(driver);
       
       LoggerClass.info("Verifying Job Description section");
       Assert.assertTrue(jobDescriptionPage.isJobDiscriptionDisplayed());
       
       LoggerClass.info("Verifying Job Title");
       Assert.assertTrue(jobDescriptionPage.getJobDiscriptionTitle().contains(testData.getProperty("jobTitle")));
       
       LoggerClass.info("Verifying Job Location");
       Assert.assertTrue(jobDescriptionPage.getJobDiscriptionTitle().contains(testData.getProperty("jobLocation")));
       
       LoggerClass.info("Verifying if Profile section is displayed or not");
       Assert.assertTrue(jobDescriptionPage.isProfileSectionDisplayed());
       
       LoggerClass.info("Verifying if Responsiblities section is displayed or not");
       Assert.assertTrue(jobDescriptionPage.isRsponsibilitieSectionDisplayed());
       
       LoggerClass.info("Verifying Job Responsiblities points");
       Assert.assertEquals( jobDescriptionPage.getjobResponsibilities(),Integer.parseInt(testData.getProperty("JobResponsibilitiesCount")));
       
       LoggerClass.info("Verifying Job Profile points");
       Assert.assertEquals(jobDescriptionPage.getjobProfiles(),Integer.parseInt(testData.getProperty("JobProfileCount")));
       
       jobDescriptionPage.clikOnApplyNowButton();
       
       LoggerClass.endTestCase("freeleticsSampleTest");
	   
   }

    @AfterTest
    public void close(){
    	 LoggerClass.info("************************ Teardown  Started ************************"); 
         BaseSeleniumClass.quit();
         LoggerClass.info("************************ Teardown  Completed ************************"); 
       }
   }