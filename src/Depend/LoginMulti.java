package Depend;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pom.PomDel;
import Pom.PomTask;
import Pom.Pomlogin;

public class LoginMulti {

	public WebDriver op;
	@Test
	public void login() {
		/*System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver op=new ChromeDriver();*/
		op=new FirefoxDriver();
		op.get("https://demo.actitime.com/login.do");
		Pomlogin clkl=new Pomlogin(op);
		clkl.proccess();
		
	}
	@Test(dependsOnMethods="login")

	public void Create() throws InterruptedException {
		PomTask clkt=new PomTask(op);
		clkt.Taskwork();
	}
	@Test(dependsOnMethods= {"login","Create"})

	public void Del() throws InterruptedException {	
		PomDel del=new PomDel(op);
		del.Deletename();
		
	}
}