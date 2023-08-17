package Generic_LibraryOrUtility;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base_Class {
    public  WebDriver driver;
    
    public PropertiesUtility PUtil = new PropertiesUtility();
 	public  Excel_Utility EUtil = new Excel_Utility();
	public JavaUtility JUtil = new JavaUtility();

 @BeforeSuite(alwaysRun = true)        
     public void dbConnection() {
     System.out.println("dbConnection Succesfull");
     }
 @BeforeClass(alwaysRun = true) 
    public void LauchBrower() throws Exception {
	 String URL = PUtil.GetDataFromProperties("url");
	 driver = new ChromeDriver();
	 driver.get(URL);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 System.out.println("LauchBrower Succesfull");
      }
 @BeforeMethod(alwaysRun = true) 
    public void LoginApp() throws Exception {
    String USERNAME = PUtil.GetDataFromProperties("username");
    String PASSWORD = PUtil.GetDataFromProperties("password");
    driver.findElement(By.xpath("//input[@placeholder='Username']"))
    .sendKeys(USERNAME , Keys.TAB , PASSWORD , Keys.ENTER);
     System.out.println("LoginApp Succesfull");
   }
 
 @AfterMethod(alwaysRun = true) 
    public void LogoutApp() throws Exception {
	 driver.findElement(By.xpath("//a[text()='Logout']")).click();
     System.out.println("LogOutApp Succesfull");
   }
 @AfterClass(alwaysRun = true) 
 public void CloseBrower() throws Exception {
	 driver.quit();
	 System.out.println("CloseBrowser Succesfull");
   }
 @AfterSuite  (alwaysRun = true)      
 public void dbConnectionClose() {
 System.out.println("dbConnection Closed Succesfull");
 }
 
}


