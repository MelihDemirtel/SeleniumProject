package testNgFramework;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Notations1 {
	
	@BeforeTest
	public void bt() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void at() {
		System.out.println("After Test");
	}
	@BeforeSuit
	public void bs() {
		System.out.println("Before Suit");
	}
	@AfterSuit
	public void as() {
		System.out.println("After Suit");
	}
	@BeforeMethod
	public void setUp() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("After Method");
	}
	@Test
	public void test01() {
		System.out.println("Test 1");
	}
	@Test
	public void test02() {
		System.out.println("Test 2");
	}
	@Test
	public void test03() {
		System.out.println("Test 3");
	}
	@BeforeClass
	public void bc() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void ac() {
		System.out.println("After Class");
	}

}
