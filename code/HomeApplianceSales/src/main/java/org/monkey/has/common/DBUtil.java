package org.monkey.has.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
    /** 读取数据库配置文件 */
    private static Properties pro=new Properties();
    /** 驱动 */
    private static String driver;
    /** url地址 */
    private static String url;
    /** 数据库用户名 */
    private static String username;
    /** 密码 */
    private static String password;
    
    /**
     *静态初始化快地读取 db.properties 文件，并加载驱动。
     */
    static{
        try {
            String path=DBUtil.class.getResource("").getPath()+"/db.properties";//获取到数据库路径     
            InputStream is = new FileInputStream(path);//获取数据库的信息转化为文件输入流
            
            pro.load(is);//把输入流转化为属性列表
            
            driver = (String) pro.get("driver");//获取driver的值
            url=(String) pro.get("url");
            username=(String) pro.get("username");
            password=(String) pro.get("password");
            
            Class.forName(driver);//加载驱动
            
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
            System.out.println("ClassNotFound");
        }catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("db.properties Not Found");
        }catch (IOException e) {
            //e.printStackTrace();
            System.out.println("System Error");
        }
    }
    
    /**
     * 获取数据库连接
     * @return 返回获取到的连接。
     * @throws SQLException 异常
     */
    public static Connection getConn() throws SQLException{
        return DriverManager.getConnection(url,username,password);
    }
    
    /**
     * 关闭数据库连接
     * @param conn
     * @param pstmt
     * @param rs
     * @throws SQLException
     */
    public static void close(Connection conn,PreparedStatement pstmt,ResultSet rs)throws SQLException{
        if(conn!=null){
            conn.close();
        }
        if(pstmt!=null){
            pstmt.close();
        }
        if(rs!=null){
            rs.close();
        }
    }
    /**
     * 关闭数据库连接
     * @param conn
     * @param stmt
     * @param rs
     * @throws SQLException
     */
    public static void close(Connection conn,Statement stmt,ResultSet rs)throws SQLException{
        if(conn!=null){
            conn.close();
        }
        if(stmt!=null){
            stmt.close();
        }
        if(rs!=null){
            rs.close();
        }
    }
    
    /**
     * 关闭数据库连接
     * @param conn
     * @throws SQLException
     */
    public static void close(Connection conn)throws SQLException{
        close(conn,null,null);
    }
    
    /**
     * 关闭数据库连接
     * @param conn
     * @param pstmt
     * @throws SQLException
     */
    public static void close(Connection conn,PreparedStatement pstmt)throws SQLException{
        close(conn,pstmt,null);
    }
    
    /**
     * 关闭数据库连接
     * @param conn
     * @param stmt
     * @throws SQLException
     */
    public static void close(Connection conn,Statement stmt)throws SQLException{
        close(conn,stmt);
    }
    
    
    /**
     * Test function
     * @param args
     */
    public static void main(String[] args) {
        try {
            System.out.println(getConn());
        } catch (SQLException e) {
            System.out.println("chucuole-----------------");
            e.printStackTrace();
        }
    }
}
