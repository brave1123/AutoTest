package con.course.code.Chapter5.suite;

import org.testng.annotations.Test;

public class IgnoreTest {
	
	@Test
	public void ignoreTest1() {
		System.out.println("ignoreTest1 执行");
	}
	
	@Test(enabled = false)
	public void ignoreTest2() {
		System.out.println("ignoreTest2 执行");
	}

}
