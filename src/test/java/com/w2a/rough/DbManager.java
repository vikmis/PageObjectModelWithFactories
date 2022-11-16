package com.w2a.rough;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbManager {
	
	private static Connection con =null;
	
	public static void setMysqlDbConnection() throws ClassNotFoundException {
		
		
		try {
			Class.forName(TestConfig.mysqldriver);
			con = DriverManager.getConnection(TestConfig.mysqlurl,TestConfig.mysqlusername, TestConfig.mysqlpassword);
			if(!con.isClosed()) {
				System.out.println("Successfully Connected to mysql Server");
			}
		} catch (Exception  e) {
			
			System.out.println("Cannot connect to database server");
		}
		
		
	}
	
	public static String[][] getMysqlQuery(String query) throws SQLException {
		
		Statement St = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = St.executeQuery(query);
		
		rs.last();
		int rows=rs.getRow();
	//	System.out.println("Total number of rows is :"+rows);
		
		//Total columns 
		java.sql.ResultSetMetaData rmd = rs.getMetaData();
		int clmn =rmd.getColumnCount();
	//	System.out.println("Total nuber of columns : "+clmn);
		
		//List<String> values = new ArrayList<String>();
		rs.beforeFirst();
		String data[][] = new String[rows][clmn];
		int i=0;
		
		while(rs.next()){
			//values.add(rs.getString(1));
			for(int j=0;j<clmn;j++) {
				data[i][j]=rs.getString(j+1);
				//System.out.println(data[i][j]);
			}
			i++;
		}
		return data;
		
	}
	
	

}
