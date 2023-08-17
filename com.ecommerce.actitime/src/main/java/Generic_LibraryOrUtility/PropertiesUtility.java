package Generic_LibraryOrUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility {

	public String GetDataFromProperties(String data) throws Exception {
    FileInputStream fis = new FileInputStream(IconstantUtility.PROPERTIESPATH);
	 Properties Pobj = new Properties();
     Pobj.load(fis);
	   String DATA = Pobj.getProperty(data) ;
	   return DATA;
	}
}
