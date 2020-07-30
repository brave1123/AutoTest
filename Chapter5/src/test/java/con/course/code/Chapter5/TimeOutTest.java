package con.course.code.Chapter5;

import org.testng.annotations.Test;

public class TimeOutTest {
	
	@Test(timeOut = 3000)
	public void testSuccess() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	@Test(timeOut = 2000)
	public void testError() throws InterruptedException {
		Thread.sleep(3000);
	}

}
