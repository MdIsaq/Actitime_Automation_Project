package Object_Refactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_NewUser_page {

@FindBy(xpath = "//div[text()='New User']")
   private WebElement NewUser;
@FindBy(xpath = "//div[text()='Save & Send Invitation']")
   private WebElement SaveAndSend;
@FindBy(xpath = "//span[text()='Close']")
   private WebElement Close;


public Pom_NewUser_page(WebDriver driver) {
PageFactory.initElements(driver , this);
}


public WebElement getNewUser() {
	return NewUser;
}

public WebElement getSaveAndSend() {
	return SaveAndSend;
}

public WebElement getClose() {
	return Close;
}

//this is business library for CreatingNewUser:-
public void ClickNewUser() {
	   getNewUser().click();
}
public void ClickSaveAndSend() {
	getSaveAndSend().click();
}
public void ClickClose() {
	getClose().click();
}

}
