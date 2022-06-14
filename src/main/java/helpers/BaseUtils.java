package helpers;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


/**
 * BaseUtils is placeholder of all utility functions
 *
 * @author ravi.jaisinghani
 */

public class BaseUtils {

	/*Function to fetch properties from test data file*/
	public static Properties getTestDataFile(String testFilename)
	{
		try
		{
		
		LoggerClass.info("Fetching properties from Testdata file = "+testFilename);
		FileReader reader=new FileReader("src/test/java/testdata/"+testFilename);  
		Properties property=new Properties();  
		property.load(reader);
		
	    return property;
		}
		catch(IOException ex)
		{
			LoggerClass.error("Error!!Exception occured while fetching data from TestData File");
			return null;
			
		}
	    
		
	}
	
	
}
