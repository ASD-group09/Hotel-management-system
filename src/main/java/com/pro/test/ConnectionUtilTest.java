package com.pro.test;

import java.sql.Connection;  
import java.sql.DriverManager;  
import org.junit.Test;
public class ConnectionUtilTest {
        String url="jdbc:mysql://127.0.0.1:3306/pro"; //连接数据库（kucun是数据库名）  
        String name="root";//连接mysql的用户名  
        String pwd="root";//连接mysql的密码  
@Test 
    public  void closeAll() throws Exception{ 
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection(url,name,pwd);
System.out.println(conn);
    }  
}
