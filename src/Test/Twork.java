package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.PomWork;
import Pom.Pomlogin;

public class Twork {

	@Test(groups="Regression")
	public void clkwork() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver op=new ChromeDriver();
		
		op.get("https://demo.actitime.com/login.do");
		Pomlogin clkl=new Pomlogin(op);
		clkl.proccess();
		Thread.sleep(3000);
		PomWork clkw=new PomWork(op);
		clkw.clickWork();
	
	}
}
