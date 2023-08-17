package Object_Refactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_NewProject_page {
@FindBy(xpath = "//div[text()='Add New']")
   private WebElement addNew;
@FindBy(xpath = "//div[@class='item createNewProject']")
   private WebElement NewProject;
@FindBy(xpath = "(//input[@placeholder='Enter Project Name'])[2]")
   private WebElement EnterProjectName;
@FindBy(xpath = "(//div[@class='dropdownButton'])[15]")
private WebElement ClickDropDown;
@FindBy(xpath = "//div[text()='-- New Customer --']")
private WebElement SelectNewCustomer;
@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
private WebElement ProjectDescription ;
@FindBy(xpath = "//div[text()='Create Project']")
private WebElement CreateProject;

    public Pom_NewProject_page(WebDriver driver) {
    PageFactory.initElements(driver , this);
    }

	public WebElement getAddNew() {
		return addNew;
	}

	public WebElement getNewProject() {
		return NewProject;
	}

	public WebElement getEnterProjectName() {
		return EnterProjectName;
	}

	public WebElement getClickDropDown() {
		return ClickDropDown;
	}

	public WebElement getSelectNewCustomer() {
		return SelectNewCustomer;
	}

	public WebElement getProjectDescription() {
		return ProjectDescription;
	}

	public WebElement getCreateProject() {
		return CreateProject;
	}
    
	//this is business library for CreatingNewProject:-
       public void ClickAddNew() {
    	   getAddNew().click();
       }
       
       public void ClickNewProject() {
    	   getNewProject().click();
       }
       public void EnterProjectName(String ProjectName) {
    	   getEnterProjectName().sendKeys(ProjectName);
       }
       public void ClickDropDown() {
    	   getClickDropDown().click();
    	   
       }
       public void SelectNewCustomer() {
    	   getSelectNewCustomer().click();
       }
       public void EnterProjectDescription(String ProjectDesc) {
    	   getProjectDescription().sendKeys(ProjectDesc);
       }
       public void ClickCreateProject() {
    	   getCreateProject().click();
       }
       


	
}
