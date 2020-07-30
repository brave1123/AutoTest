package con.course.code.Chapter5;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {
	
	@Test
	public void testCase1() {
		System.out.println("test这是测试用例1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("test这是测试用例2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod这是在测试方法之前运行的");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod这是在测试方法之后运行的");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass这是在类之前运行的");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass这是在类之后运行的");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite测试套件");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite测试套件");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
	}

}
