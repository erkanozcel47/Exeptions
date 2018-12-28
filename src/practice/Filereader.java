package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Filereader {

	public static void main(String[] args) throws IOException {
 
		FileReader fr =new FileReader("C:\\Users\\erkan\\OneDrive\\Masaüstü\\My Notes\\Abstraction.txt");
        BufferedReader br = new BufferedReader(fr); 
		
        
         String line;
//        while((line=br.readLine()) != null) {
//        	System.out.println(line);
//        }
//		
		// br.close();
		 //fr.close();
        List<String> abs =new ArrayList<>();
        
        while((line=br.readLine()) != null) {
        	abs.add(line);
        }
		for (String abstrac : abs) {
			System.out.println(abstrac.toString());
			System.out.println("aaaaaaa");
		}
		
	}

}
