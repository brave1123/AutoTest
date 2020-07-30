package con.course.code.Chapter5.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteCofig {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite 运行拉");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite 运行啦");
	}

}
