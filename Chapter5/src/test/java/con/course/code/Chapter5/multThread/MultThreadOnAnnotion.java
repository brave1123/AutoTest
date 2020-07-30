package con.course.code.Chapter5.multThread;

import org.testng.annotations.Test;

public class MultThreadOnAnnotion {
	
	@Test(invocationCount = 5,threadPoolSize = 5)
	public void test() {
		System.out.println(1);
		System.out.printf("Thread ID %s%n",Thread.currentThread().getId());
	}

}
