package Depend;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pom.Pomlogin;

public class Base 
{

public WebDriver op;
	@BeforeSuite
	public void con(){
		
	System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe\\");
	op=new ChromeDriver();
	op.manage().window().maximize();
	//op.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	op.get("https://demo.actitime.com/login.do");
	
	}	
	@AfterSuite
	public void close() {
		op.close();
	}
	
}
