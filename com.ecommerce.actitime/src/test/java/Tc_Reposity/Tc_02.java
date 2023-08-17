package Tc_Reposity;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Generic_LibraryOrUtility.Base_Class;
import Object_Refactory.Pom_NewUser_page;
import Object_Refactory.Pom__Homepage;

public class Tc_02 extends Base_Class {
@Test(groups = {"regression"})
public  void Execute_CreateUsers() throws Exception {
String FirstName = EUtil.getDataFromExcel("Users", 2, 1);
String LastName =	EUtil.getDataFromExcel("Users", 2, 2);		
String Email =	EUtil.getDataFromExcel("Users", 2, 3);		

Pom__Homepage ph = new Pom__Homepage(driver);
ph.ClickOnUsers();

Pom_NewUser_page pnup = new Pom_NewUser_page(driver);
pnup.ClickNewUser();
Thread.sleep(6000);
driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']"))
.sendKeys( FirstName, Keys.TAB , Keys.TAB , LastName , Keys.TAB , Email);
pnup.ClickSaveAndSend();
pnup.ClickSaveAndSend();
	}

}
