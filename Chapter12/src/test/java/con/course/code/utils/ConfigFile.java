package con.course.code.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import con.course.code.model.InterfaceName;

public class ConfigFile {
	private static Properties properties = new Properties();
	
	public static String getUrl(InterfaceName name) throws IOException{
		FileInputStream fis = new FileInputStream("src/main/resources/application.properties");
	     properties.load(fis);
        String address = properties.getProperty("test.url");
        String uri = "";
        String testUrl;
        if(name == InterfaceName.GETUSERLIST){
            uri = properties.getProperty("getUserList.uri");

        }

        if(name == InterfaceName.LOGIN){
            uri = properties.getProperty("login.uri");
        }

        if(name == InterfaceName.UPDATEUSERINFO){
            uri = properties.getProperty("updateUserInfo.uri");
        }

        if(name == InterfaceName.GETUSERINFO){
            uri = properties.getProperty("getUserInfo.uri");
        }

        if(name == InterfaceName.ADDUSERINFO){
            uri = properties.getProperty("addUser.uri");
        }
        testUrl = address + uri;
        return testUrl;
    }

}
