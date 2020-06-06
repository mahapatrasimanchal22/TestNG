package Depend;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Depend {

	@Test
	public void login1() {
		System.out.println("login");
	}
	@Test(dependsOnMethods="login1")
	public void customer1() {
		System.out.println("customer");
	}
	@Test(dependsOnMethods= {"login1","customer1"})
	public void delete1() {
		System.out.println("delete");
	}
}
