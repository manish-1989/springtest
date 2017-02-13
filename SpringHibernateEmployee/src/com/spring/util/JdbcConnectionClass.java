package com.spring.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionClass {

	Connection conn= null;
	String driver="jdbc.driver.OracleDriver";
	String url="jdbc:oracle//localhost:1521:xe";
	String userName="scott";
	String password="scott";
	
			public String getCourseTitle(int id){
				try{
				Connection connection=this.getConnection();
				Statement stmt= connection.createStatement();
				String sql="Select name from course where id="+id;
				ResultSet rs= stmt.executeQuery(sql); 
				while(rs.next()){
					return rs.getString("name");
					}
				connection.close();
				conn.close();
				}
				catch(SQLException se){se.printStackTrace();}
				catch(Exception ex){ex.printStackTrace();}
			
	return "";
			}
			
			private Connection getConnection(){
				try {
					Class.forName(driver);
					return DriverManager.getConnection(url, userName, password)
;				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
				return null;
				
			}

}
