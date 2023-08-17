package Generic_LibraryOrUtility;

import java.util.Random;

public class JavaUtility {

   public int getRandomNumber() {
    	Random number = new Random();
    	int num = number.nextInt(10000);
    	return num;
    	
    }
}


