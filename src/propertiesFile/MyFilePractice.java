package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MyFilePractice {

		
	public static void main(String[] args) {
	
	
		Properties pp = new Properties();
		try {
		FileInputStream filein =new FileInputStream("myfile.properties");
		pp.load(filein);
		}catch(IOException e) {
			e.printStackTrace();
		}
	 
		System.out.println(pp);
		
		
	
	
	}

}
