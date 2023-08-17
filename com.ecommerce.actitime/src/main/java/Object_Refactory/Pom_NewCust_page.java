package Object_Refactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_NewCust_page {
@FindBy(xpath = "//div[@class='title ellipsis']")
   private WebElement NewTitle;
@FindBy(xpath = "//div[@class='item createNewCustomer']")
   private WebElement NewCustomer;
@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
   private WebElement CustDescription;
@FindBy(xpath = "//div[text()='Create Customer']")
private WebElement CreateCustomer;


public Pom_NewCust_page(WebDriver driver) {
PageFactory.initElements(driver , this);
}


public WebElement getNewTitle() {
	return NewTitle;
}
public WebElement getNewCustomer() {
	return NewCustomer;
}
public WebElement getCustDescription() {
	return CustDescription;
}
public WebElement getCreateCustomer() {
	return CreateCustomer;
}


//this is business library for CreatingNewCustomer:-
public void ClickNewTitle() {
	getNewTitle().click();
}
public void ClickNewCustomer() {
	getNewCustomer().click();
}
public void EnterCustDescription(String Desc) {
	getCustDescription().sendKeys(Desc);;
}
public void ClickCreateCustomer() {
	getCreateCustomer().click();
}

}
