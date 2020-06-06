package Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class PomDel {
		
		public WebDriver drive;
		
		@FindBy(id="container_tasks")
		private WebElement clickTask;
		
		@FindBy(xpath="//div[.='Add New']")
		private WebElement clickAdd;
		
		@FindBy(xpath="//div[@class='item createNewCustomer']")
		private WebElement clickNew;
		
		@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
		private WebElement Entername;
		
		@FindBy(xpath="(//div[.='  Create Customer'])[2]")
		private WebElement clickSave;
		
		@FindBy(xpath="(//div[contains(text(),'simanchal')]/../..//div[@class='editButton'])[1]")
		private WebElement clickbutton;
		
		@FindBy(xpath="(//div[.='ACTIONS'])[1]")
		public WebElement clickAction;
		
		@FindBy(xpath="(//div[.='Delete'])[2]")
		private WebElement clickDelete;
		
		@FindBy(xpath="//span[.='Delete permanently']")
		private WebElement clkdelete;
		
		public PomDel(WebDriver drive) {
			this.drive=drive;
			PageFactory.initElements(drive, this);
		}
		
		public void Deletename() throws InterruptedException {
			Thread.sleep(5000);
			clickTask.click();
			clickAdd.click();
			clickNew.click();
			Thread.sleep(3000);
			Entername.sendKeys("simanchal");
			clickSave.click();
			Thread.sleep(4000);
			clickbutton.click();
			Thread.sleep(3000);
			clickAction.click();
			Thread.sleep(5000);
			clickDelete.click();
			Thread.sleep(3000);
			clkdelete.click();
		}
	}

