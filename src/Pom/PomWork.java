package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PomWork {

	@FindBy(xpath="(//div[@class='menu_icon'])[1]")
	private WebElement clickSetting;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement clickTypeWork;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement clickNewWork;
	
	@FindBy(id="name")
	private WebElement EnterName;
	
	@FindBy(xpath="//select[@name='active']")
	public WebElement sugg;
	
	@FindBy(id="billingRate_input")
	private WebElement EnterAmount;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement clickSave;

public PomWork(WebDriver drive) {
	PageFactory.initElements(drive, this);
}

public void clickWork() throws InterruptedException {
	
	clickSetting.click();
	Thread.sleep(3000);
	clickTypeWork.click();
	clickNewWork.click();
	EnterName.sendKeys("sikha");
	Thread.sleep(3000);
	Select sel=new Select(sugg);
	sel.selectByIndex(1);
	EnterAmount.sendKeys("300");
	Thread.sleep(3000);
	clickSave.click();
	}

}
