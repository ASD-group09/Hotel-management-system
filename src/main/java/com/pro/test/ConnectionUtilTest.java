package com.pro.test;

import java.sql.Connection;  
import java.sql.DriverManager;  
import org.junit.Test;
public class ConnectionUtilTest {
        String url="jdbc:mysql://127.0.0.1:3306/pro"; //�������ݿ⣨kucun�����ݿ�����  
        String name="root";//����mysql���û���  
        String pwd="root";//����mysql������  
@Test 
    public  void closeAll() throws Exception{ 
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection(url,name,pwd);
System.out.println(conn);
    }  
}
