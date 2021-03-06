package con.course.code.cases;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import con.course.code.config.TestConfig;
import con.course.code.model.GetUserInfoCase;
import con.course.code.model.User;
import con.course.code.utils.DatabaseUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class GetUserInfoTest {


    @Test(dependsOnGroups="loginTrue",description = "获取userId为1的用户信息")
    public void getUserInfo() throws IOException, InterruptedException {
        SqlSession session = DatabaseUtils.getSqlSession();
        GetUserInfoCase getUserInfoCase = session.selectOne("getUserInfoCase",1);
        System.out.println(getUserInfoCase.toString());
        System.out.println(TestConfig.getUserInfoUrl);
        
        //下边为写完接口的代码
        JSONArray resultJson = getJsonResult(getUserInfoCase);

        /**
         * 下边三行可以先讲
         */
        Thread.sleep(2000);
        User user = session.selectOne(getUserInfoCase.getExpected(),getUserInfoCase);
        System.out.println("自己查库获取用户信息:"+user.toString());

        List userList = new ArrayList();
        userList.add(user);
        JSONArray jsonArray = new JSONArray(userList);
        //解决顺序不一致问题 把resultJson.getString(0)
        JSONArray jsonArray1 = new JSONArray(resultJson.getString(0));
        System.err.println("获取用户信息:"+jsonArray.toString());
        System.err.println("调用接口获取用户信息:"+resultJson.toString());
        Assert.assertEquals(jsonArray.toString(),jsonArray1.toString());
    }

	private JSONArray getJsonResult(GetUserInfoCase getUserInfoCase) throws ParseException, IOException {
		HttpPost post = new HttpPost(TestConfig.getUserInfoUrl);
        JSONObject param = new JSONObject();
        param.put("id",getUserInfoCase.getUserId());
        //设置请求头信息 设置header
        post.setHeader("content-type","application/json");
        //将参数信息添加到方法中
        StringEntity entity = new StringEntity(param.toString(),"utf-8");
        post.setEntity(entity);
        //设置cookies
        CloseableHttpClient httpclient = HttpClients.custom().setDefaultCookieStore(TestConfig.store).build();
        //声明一个对象来进行响应结果的存储
        String result;
        //执行post方法
        HttpResponse response = httpclient.execute(post);
        //获取响应结果
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println("调用接口result:"+result);
        List resultList = Arrays.asList(result);
        JSONArray array = new JSONArray(resultList);
        System.out.println(array.toString());
        return array;
	}

}
