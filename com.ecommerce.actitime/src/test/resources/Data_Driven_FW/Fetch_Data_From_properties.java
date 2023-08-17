package Data_Driven_FW;

import java.io.FileInputStream;
import java.util.Properties;

public class Fetch_Data_From_properties {

	public static void main(String[] args) throws Exception {
     FileInputStream fis = new FileInputStream("D:\\Selenium\\Credentials.properties");
      Properties Pobj = new Properties();
      Pobj.load(fis);
     
       String USERNAME =  Pobj.getProperty("username");
       String PWD      =  Pobj.getProperty("password");
       String URL      =  Pobj.getProperty("url");
   
        System.out.println(USERNAME);
        System.out.println(PWD);
        System.out.println(URL);
	}
}
