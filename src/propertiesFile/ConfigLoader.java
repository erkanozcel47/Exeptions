package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	public static void main(String[] args) {
    
		Properties proper = new Properties();
		try {
		
			FileInputStream file = new FileInputStream("config.properties");
			proper.load(file);
		
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		System.out.println(proper.getProperty("Fairfax"));
		
		

	}

}
