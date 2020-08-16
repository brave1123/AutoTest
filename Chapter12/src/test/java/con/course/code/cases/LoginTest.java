package con.course.code.cases;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import con.course.code.config.TestConfig;
import con.course.code.model.InterfaceName;
import con.course.code.model.LoginCase;
import con.course.code.utils.ConfigFile;
import con.course.code.utils.DatabaseUtils;

public class LoginTest {
	
	@BeforeTest(groups = "loginTrue",description = "测试准备工作,获取HttpClient对象")
    public void beforeTest() throws IOException{
        TestConfig.defaultHttpClient = new DefaultHttpClient();
        TestConfig.getUserInfoUrl = ConfigFile.getUrl(InterfaceName.GETUSERINFO);
        TestConfig.getUserListUrl = ConfigFile.getUrl(InterfaceName.GETUSERLIST);
        TestConfig.loginUrl = ConfigFile.getUrl(InterfaceName.LOGIN);
        TestConfig.updateUserInfoUrl = ConfigFile.getUrl(InterfaceName.UPDATEUSERINFO);
        TestConfig.addUserUrl = ConfigFile.getUrl(InterfaceName.ADDUSERINFO);
    }
	
	@Test(groups = "loginTrue",description = "用户成功登陆接口")
    public void loginTrue() throws IOException {
        SqlSession session = DatabaseUtils.getSqlSession();
        LoginCase loginCase = session.selectOne("loginCase",1);
        System.out.println(loginCase.toString());
        System.out.println(TestConfig.loginUrl);
        
        //第一步，发送请求
        String result=getResult(loginCase);
        
        //验证结果
        Assert.assertEquals(result, loginCase.getExpected());

    }

    @Test(description = "用户登陆失败接口")
    public void loginFalse() throws IOException {
        SqlSession session = DatabaseUtils.getSqlSession();
        LoginCase loginCase = session.selectOne("loginCase",2);
        System.out.println(loginCase.toString());
        System.out.println(TestConfig.loginUrl);
    }
    
    private String getResult(LoginCase loginCase) throws ClientProtocolException, IOException {
    	//下边的代码为写完接口的测试代码
    	HttpPost post=new HttpPost(TestConfig.loginUrl);
    	JSONObject json=new JSONObject();
    	json.put("userName", "张三");
    	json.put("password", "123456");
    	
    	//设置请求头信息 设置header
        post.setHeader("content-type","application/json");
        
        StringEntity entity=new StringEntity(json.toString(),"utf-8");
        post.setEntity(entity);
        
        String result;
        //声明一个client对象，用来进行方法的执行,并设置cookies信息
        TestConfig.store = new BasicCookieStore();
        CloseableHttpClient httpclient = HttpClients.custom().setDefaultCookieStore(TestConfig.store).build();
        HttpResponse response=httpclient.execute(post);
        
        result=EntityUtils.toString(response.getEntity());
        return result;
    }

}
