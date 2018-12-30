package com.jasmine.模版方法模式;

import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlServerDBUtil extends AbstractDBUtil {
    @Override
    public void connDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection= DriverManager.getConnection(url,user,password);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
