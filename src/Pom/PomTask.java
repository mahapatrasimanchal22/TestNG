package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomTask {

	@FindBy(id="container_tasks")
	private WebElement clickTask;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement clickAddnew;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement Newcustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement Enterusername;
	
	@FindBy(xpath="(//div[.='  Create Customer'])[2]")
	private WebElement ClickCreatecustomer;

	public PomTask(WebDriver drive) {
		
		PageFactory.initElements(drive, this);
	}

	public void Taskwork() throws InterruptedException{
		Thread.sleep(8000);
		clickTask.click();
		clickAddnew.click();
		Thread.sleep(3000);
		Newcustomer.click();
		Thread.sleep(3000);
		Enterusername.sendKeys("sima");
		ClickCreatecustomer.click();
		
		
	}
}
