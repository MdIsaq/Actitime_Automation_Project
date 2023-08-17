
package Tc_Reposity;

import org.testng.annotations.Test;

import Generic_LibraryOrUtility.Base_Class;
import Object_Refactory.Pom_NewWork_page;

public class Tc_04 extends Base_Class {
	
@Test
public  void Executes_CreateSettigs() throws Exception {
String WorkName = EUtil.getDataFromExcel("Setting", 2, 1);
String WorkBillingRate =	EUtil.getDataFromExcel("Setting", 2, 2);
Thread.sleep(6000);

Pom_NewWork_page pnwp = new Pom_NewWork_page(driver);
pnwp.ClickMenuIcon();
pnwp.ClickWorkType();
pnwp.ClickCreateWork();
pnwp.EnterWorkNamee(WorkName);
pnwp.EnterBillingRate(WorkBillingRate);
pnwp.ClickCreateWorkType();
 }
}
