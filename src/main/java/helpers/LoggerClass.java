package helpers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *  LoggerClass: Implements logging using Log4j2 and contains basic methods related to logging
 *
 * @author ravi.jaisinghani
 */

public class LoggerClass {


// Initialize Log4j logs

	 public final static Logger 
	 LOGGER = LogManager.getLogger(LoggerClass.class.getName());//

 // This is to print log for the beginning of the test case
	 
 public static void startTestCase(String sTestCaseName){

	 LOGGER.info("****************************************************************************************");

	 LOGGER.info("****************************************************************************************");

	 LOGGER.info("$$$$$$$$$$$$$$$$$$$$$  Starting Test  "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");

	 LOGGER.info("****************************************************************************************");

	 LOGGER.info("****************************************************************************************");

	}

	//This is to print log for the ending of the test case

 public static void endTestCase(String sTestCaseName){

	 LOGGER.info("************************* Execution Completed for Test"+sTestCaseName+"******************");

	}

	 

 public static void info(String message) {

	 LOGGER.info(message);

		}

 public static void warn(String message) {

	 LOGGER.warn(message);

	}

 public static void error(String message) {

	 LOGGER.error(message);

	}


 public static void debug(String message) {

	 LOGGER.debug(message);

	}

}