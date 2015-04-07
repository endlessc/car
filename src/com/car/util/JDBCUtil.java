package com.car.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 对数据库 JDBC操作
 * @author Administrator
 *
 */
public class JDBCUtil {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/newdata";
	
	private static final String USER = "root";
	
	private static final String PASSWROD = "123456";
	
	private static Connection connection = null;

	/**
	 * 获取数据库连接
	 * @return
	 */
	public Connection getConnection(){
		if(connection==null){
			try 
			{
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(URL, USER, PASSWROD);
			}
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return connection;
	}
	
	/**
	 * 关闭数据库资源
	 * @param connection
	 * @param statmeent
	 * @param preparedStatement
	 * @param resultSet
	 */
	public void cloaseConnection(Connection connection, Statement statmeent, PreparedStatement preparedStatement, ResultSet resultSet){
		if(resultSet!=null)
		{
			try 
			{
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(preparedStatement!=null)
		{
			try 
			{
				preparedStatement.close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		if(statmeent!=null)
		{
			try 
			{
				statmeent.close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
