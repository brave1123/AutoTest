package con.course.code.Chapter6;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;

public class TestMethodDemo {
	
	@Test
	public void test1() {
		AssertJUnit.assertEquals(1, 2);
	}
	
	@Test
	public void test2() {
		AssertJUnit.assertEquals(1, 1);
	}
	
	@Test
	public void test3() {
		AssertJUnit.assertEquals("aaa", "aaa");
	}
	
	@Test
	public void logDem0() {
		Reporter.log("这是我们自己写的日志");
		throw new RuntimeException("这是我自己的运行时异常！");
	}
}
