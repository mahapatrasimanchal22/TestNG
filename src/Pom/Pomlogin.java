package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomlogin {

	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy(xpath="//label[.='Keep me logged in']")
	private WebElement keepmeloggedin;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement Login;
	
	public Pomlogin(WebDriver drive) {
		PageFactory.initElements(drive, this);
	}

	public void proccess() {
		
		username.sendKeys("admin");
		password.sendKeys("manager");
		keepmeloggedin.click();
		Login.click();
	}

}
