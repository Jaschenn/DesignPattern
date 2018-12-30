package com.jasmine.模版方法模式;

import java.sql.Connection;

public abstract class AbstractDBUtil {
    Connection connection ;
    String url = "";
    String user="";
    String password = "";
    public abstract void connDB();

    public  void openDB(){
        System.out.println("打开数据库");
    }
    public  void useDB(){
        System.out.println("使用数据库");
    }
    public  void closeDB(){
        try {
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
