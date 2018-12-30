package com.jasmine.模版方法模式;

import com.jasmine.策略模式.AbstractWay;

import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDBUtil extends AbstractDBUtil {
    @Override
    public void connDB() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "你的oracle数据库用户名", "用户名密码");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
