package Object_Refactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Login_Page {
   @FindBy(xpath = "//input[@placeholder='Username']")
   private WebElement Username;
   @FindBy(xpath = "//input[@placeholder='Password']")
   private WebElement Password ;
   @FindBy(xpath = "//div[text()='Login ']")
   private WebElement Login ;
   
     public Pom_Login_Page(WebDriver driver) {
    	 PageFactory.initElements(driver , this);	
     }
public WebElement getUsername() {
	return Username;
}
public WebElement getPassword() {
	return Password;
}
public WebElement getLogin() {
	return Login;
}
//This is businness Library for login operation
  public void LoginOperation(String username , String password) {
	  Username.sendKeys(username);
	  Password.sendKeys(password);
	  Login.click();
  }     
}


