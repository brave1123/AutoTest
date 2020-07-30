package con.course.code.Chapter5.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
	
	@Test
	@Parameters({"name","age"})
	public void test(String name,int age) {
		System.out.println(name+"，"+age);
	}

}
