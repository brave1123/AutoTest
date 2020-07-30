package con.course.code.Chapter5.multThread;

import org.testng.annotations.Test;

public class MultThreadOnXml {
	
	@Test
	public void test1() {
		System.out.printf("Thread ID1 %s%n",Thread.currentThread().getId());
	}
	
	@Test
	public void test2() {
		System.out.printf("Thread ID2 %s%n",Thread.currentThread().getId());
	}

	@Test
	public void test3() {
		System.out.printf("Thread ID3 %s%n",Thread.currentThread().getId());
	}


}
