package Depend;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pom.PomTask;
import Pom.PomWork;
import Pom.Pomlogin;
import Pom.Pompro;

public class Ex extends Base{

	@Test
	public void log() throws InterruptedException {
		Thread.sleep(3000);
		Pomlogin clkl=new Pomlogin(op);
		clkl.proccess();
	}
	@Test(dependsOnMethods="log")
	public void ctask() throws InterruptedException {
		Thread.sleep(3000);
		PomTask clkt=new PomTask(op);
		clkt.Taskwork();
	}
	@Test(dependsOnMethods="ctask")
	public void cpro() throws InterruptedException {
		Thread.sleep(5000);
		Pompro clkp=new Pompro(op);
		clkp.clickproject();
	}
	@Test(dependsOnMethods={"log","ctask","cpro"})
	public void cwork() throws InterruptedException {
		Thread.sleep(5000);
		PomWork clkw=new PomWork(op);
		clkw.clickWork();
	}
}
