package Object_Refactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_NewWork_page {

@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
   private WebElement MenuIcon;
@FindBy(xpath = "//a[text()='Types of Work']")
   private WebElement WorkType;
@FindBy(xpath = "//span[text()='Create Type of Work']")
   private WebElement CreateWork;
@FindBy(xpath = "//input[@id='name']")
private WebElement WorkNamee;
@FindBy(xpath = "//input[@id='billingRate_input']")
   private WebElement BillingRate;
@FindBy(xpath = "//input[@value='   Create Type of Work   ']")
   private WebElement CreateWorkType;	


public Pom_NewWork_page(WebDriver driver) {
PageFactory.initElements(driver , this);
}


public WebElement getMenuIcon() {
	return MenuIcon;
}
public WebElement getWorkType() {
	return WorkType;
}
public WebElement getCreateWork() {
	return CreateWork;
}
public WebElement getWorkNamee() {
	return WorkNamee;
}
public WebElement getBillingRate() {
	return BillingRate;
}
public WebElement getCreateWorkType() {
	return CreateWorkType;
}

//this is business library for CreatingNewCustomer:-
public void ClickMenuIcon() {
	getMenuIcon().click();
}
public void ClickWorkType() {
	getWorkType().click();
}
public void ClickCreateWork() {
	getCreateWork().click();
}
public void EnterWorkNamee(String WorkName) {
	getWorkNamee().sendKeys(WorkName);;
}
public void EnterBillingRate(String WorkBillingRate) {
	getBillingRate().sendKeys(WorkBillingRate);;
}
public void ClickCreateWorkType() {
	getCreateWorkType().click();
}

}
