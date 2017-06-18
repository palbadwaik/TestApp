package javaTest;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop =null;
	public static void getProperty(String path) throws IOException{
		if(prop==null){
			prop = new Properties();
			try{
				FileInputStream fs = new FileInputStream(path);
				prop.load(fs);
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
			System.out.println(prop.getProperty("name"));
			System.out.println(prop.getProperty("surname"));
		}

		Enumeration KeyValues = prop.keys(); 
		while (KeyValues.hasMoreElements()) { 
			String key = (String) KeyValues.nextElement(); 
			String value = prop.getProperty(key); 
			System.out.println(key + ":- " + value); 
		}

	}
}
