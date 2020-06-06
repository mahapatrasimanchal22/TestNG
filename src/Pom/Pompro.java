package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pompro {

	public WebDriver drive;
	
	@FindBy(id="container_tasks")
	private WebElement clickTask;		
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement clickAddnew;
	
	@FindBy(xpath="//div[.='+ New Project']")
	private WebElement clickProject;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement EnterProjectName;
	
	/*@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement sugg;
	
	@FindBy(xpath="//div[.='sima']")
	private WebElement sima;*/
	
	@FindBy(xpath="(//div[.='  Create Project'])[2]")
	private WebElement Saveproject;

	public Pompro(WebDriver drive) {
		PageFactory.initElements(drive, this);
	}

	public void clickproject() throws InterruptedException	{
		Thread.sleep(5000);
		clickTask.click();
		clickAddnew.click();
		clickProject.click();
		EnterProjectName.sendKeys("Royal");
		Thread.sleep(8000);
		/*sugg.click();
		Thread.sleep(5000);
		sima.click();*/
		Saveproject.click();	
	}
}

