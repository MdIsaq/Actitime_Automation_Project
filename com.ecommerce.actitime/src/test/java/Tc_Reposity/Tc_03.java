package Tc_Reposity;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic_LibraryOrUtility.Base_Class;
import Object_Refactory.Pom_NewCust_page;
import Object_Refactory.Pom__Homepage;

public class Tc_03 extends Base_Class{
@Test(groups = {"smoke" , "regression"})
	public  void CreateCustomer() throws Exception {
		  int RANDOMNUMBER = JUtil.getRandomNumber();
		  
  String CustName = EUtil.getDataFromExcel("Customer", 2, 1);
  String Desc =	EUtil.getDataFromExcel("Customer", 2, 2);		

  Pom__Homepage ph = new Pom__Homepage(driver);
  ph.ClickOntask();
  Pom_NewCust_page pncp = new Pom_NewCust_page(driver);
  pncp.ClickNewTitle();
  pncp.ClickNewCustomer();
 
  driver.findElement(By.xpath("//input[starts-with(@class,'inputFieldWith')]")).sendKeys(CustName+RANDOMNUMBER);
  pncp.EnterCustDescription(Desc);
  pncp.ClickCreateCustomer();
	}
}
