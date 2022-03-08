package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//This class will contain all properties handling methods
public class PropertiesReader {
	
	private Properties properties = new Properties();
	
	/**
	 * Constructor for loading property file
	 * 
	 * @param filePath Path of the file.
	 */
	public PropertiesReader(String filePath) {
		try {
			properties.load(new FileInputStream(new File(filePath)));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method will return the required property
	 * 
	 * @param name key in the property file
	 * @return value of the presented key
	 */
	public String getProperty(String name) {
		return properties.getProperty(name);
	}
}
