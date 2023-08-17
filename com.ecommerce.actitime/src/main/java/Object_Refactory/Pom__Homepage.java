package Object_Refactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom__Homepage {
	@FindBy(xpath = "//div[@id='container_tasks']")
	   private WebElement Task;
	@FindBy(xpath = "//div[@id='container_reports']")
	   private WebElement Report;
	@FindBy(xpath = "//div[@id='container_users']")
	   private WebElement Users;
	@FindBy(xpath = "//a[text()='Logout']")
	   private WebElement Logout;
	
	        public Pom__Homepage(WebDriver driver) {
	    	PageFactory.initElements(driver , this);
	       }
	        
	public WebElement getTask() {
		return Task;
	}
	public WebElement getReport() {
		return Report;
	}
	public WebElement getUsers() {
		return Users;
	}
	public WebElement getLogout() {
		return Logout;
	}
//this is business library for task
	public void ClickOntask() {
		Task.click();
	}
	public void ClickOnreports() {
		Report.click();
	}
	public void ClickOnUsers() {
		Users.click();
	}
	public void ClickOnLogout() {
		Logout.click();
	}	
}
