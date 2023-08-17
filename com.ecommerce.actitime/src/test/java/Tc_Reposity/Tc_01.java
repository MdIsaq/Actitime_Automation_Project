package Tc_Reposity;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic_LibraryOrUtility.Base_Class;
import Object_Refactory.Pom_NewProject_page;
import Object_Refactory.Pom__Homepage;
public class Tc_01 extends Base_Class {
@Test(groups = {"smoke" , "regression"})
public void Execute_CreateProject() throws Exception {	
String ProjectName = EUtil.getDataFromExcel("Project", 2, 1);
String CustomerName =	EUtil.getDataFromExcel("Project", 2, 2);		
String ProjectDesc =	EUtil.getDataFromExcel("Project", 2, 3);		

int RANDOMNUMBER = JUtil.getRandomNumber();
			
Pom__Homepage ph = new Pom__Homepage(driver);
ph.ClickOntask();

Pom_NewProject_page pnpg = new Pom_NewProject_page(driver);
pnpg.ClickAddNew(); 
pnpg.ClickNewProject();
pnpg.EnterProjectName(ProjectName);
pnpg.ClickDropDown();
pnpg.SelectNewCustomer();
driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]"))
.sendKeys(CustomerName+RANDOMNUMBER);
pnpg.EnterProjectDescription(ProjectDesc);
pnpg.ClickCreateProject();
Thread.sleep(3000); 
	}
}
