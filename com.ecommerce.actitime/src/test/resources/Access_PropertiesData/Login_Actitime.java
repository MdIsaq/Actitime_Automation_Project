package Access_PropertiesData;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_LibraryOrUtility.PropertiesUtility;

public class Login_Actitime {

	public static void main(String[] args) throws Exception {
       //Read data from PropertiesUtility Class
		PropertiesUtility PUtil = new PropertiesUtility();
		String URL = PUtil.GetDataFromProperties("url");
		String USERNAME = PUtil.GetDataFromProperties("username");
		String PASSWORD = PUtil.GetDataFromProperties("password");

		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.xpath("//input[@placeholder='Username']"))
		.sendKeys(USERNAME , Keys.TAB , PASSWORD , Keys.ENTER);
	}

}
