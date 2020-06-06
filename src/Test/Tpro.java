package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.PomTask;
import Pom.Pomlogin;
import Pom.Pompro;

public class Tpro {

	@Test
	
	public void clkpro() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver op=new ChromeDriver();

		op.get("https://demo.actitime.com/login.do");
		Pomlogin clkl=new Pomlogin(op);
		clkl.proccess();
		Thread.sleep(3000);
		Pompro clkp=new Pompro(op);
		clkp.clickproject();
		
	}
}
