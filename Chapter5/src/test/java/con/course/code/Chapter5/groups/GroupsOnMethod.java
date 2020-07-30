package con.course.code.Chapter5.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
	
	@Test(groups = "server")
	public void test1() {
		System.out.println("这是服务端组的测试方法11111");
	}
	
	@Test(groups = "server")
	public void test2() {
		System.out.println("这是服务端组的测试方法22222");
	}
	
	@Test(groups = "client")
	public void test3() {
		System.out.println("这是客户端端组的测试方法33333");
	}
	
	@Test(groups = "client")
	public void test4() {
		System.out.println("这是客户端端组的测试方法44444");
	}
	
	@BeforeGroups("server")
	public void beforeGroups() {
		System.out.println("这是服务端组运行之前的测试方法");
	}
	
	@AfterGroups("server")
	public void afterGroups() {
		System.out.println("这是服务端组运行之后的测试方法");
	}

}
