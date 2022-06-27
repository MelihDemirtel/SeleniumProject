package testNgFramework;

import org.junit.Test;
import org.testng.annotations.Test;

public class Priority {
	
}
	@Test(priority = 0)//third run
	public void test01() {
		System.out.println("Test 1");
	}
	@Test(priority = -30)//first run
	public void test02() {
		System.out.println("Test 2");
	}
	@Test//second run
	public void test03() {
		System.out.println("Test 3");

}
