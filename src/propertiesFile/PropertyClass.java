package propertiesFile;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertyClass {

	public static void main(String[] args) {


		
		Properties prop = new Properties();
		prop.setProperty("Tyson","20282");
		prop.setProperty("Fairfax","22030");
		prop.setProperty("Centerville","20120");
		prop.setProperty("Halifax","22040");
		prop.setProperty("Toronto","20042");
		
		System.out.println(prop);
		System.out.println(prop.getProperty("Tyson"));
		
	    Set<Entry<Object,Object>> tr= prop.entrySet();
		for (Entry<Object, Object> each : tr) {
			System.out.println(each);
		}
		System.out.println(prop);
		
		/*
		 * HashMap can have 1 null key and many null value
		 * HashTable can have any null key and null value
		 * HashMap is not synchronized / HashTable is
		 * 
		 * */
		
		
		
		
	}

}
