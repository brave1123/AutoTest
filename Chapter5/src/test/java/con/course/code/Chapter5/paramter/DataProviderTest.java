package con.course.code.Chapter5.paramter;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "data")
	public void testProvider(String name,int age) {
		System.out.println(name+"，"+age);
	}
	
	@DataProvider(name="data")
	public Object[][] providerData(){
		Object[][] o=new Object[][] {
			{"test1",10},
			{"test2",12},
			{"test3",14}
		};
		return o;
 	}
	
	@Test(dataProvider = "method")
	public void test1(String name,int age) {
		System.out.println(name+"，"+age);
	}
	
	@Test(dataProvider = "method")
	public void test2(String name,int age) {
		System.out.println(name+"，"+age);
	}
	
	@DataProvider(name="method")
	public Object[][] methodDataTest(Method method){
		Object[][] result=null;
		if(method.getName().equals("test1")) {
			result=new Object[][] {
				{"张三",10},
				{"李四",12}
			};
		}else if(method.getName().equals("test2")) {
			result=new Object[][] {
				{"王武",10},
				{"赵六",12}
			};
		}
		return result;
 	}

}
