package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.PomDel;
import Pom.Pomlogin;

public class CustomerDelete {

	@Test
	
	public void CustomerDel() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver op=new ChromeDriver();
		
		op.get("https://demo.actitime.com/login.do");
		
		op.manage().window().maximize();
		
		Pomlogin login=new Pomlogin(op);
		login.proccess();
		Thread.sleep(3000);
		PomDel del=new PomDel(op);
		del.Deletename();
		
	}
}
