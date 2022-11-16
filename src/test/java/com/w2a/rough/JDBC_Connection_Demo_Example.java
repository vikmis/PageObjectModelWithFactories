package com.w2a.rough;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class JDBC_Connection_Demo_Example {
	/*
	 * 1)Create Connection 
	 * 2)Create Statement
	 * 3)Execute Statement
	 * 4)Close Connection
	 */
	private static Connection conn= null;

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/vikashpersonal";
		String un ="root";
		String pass ="root";
		
		conn = DriverManager.getConnection(url, un, pass);
		Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = statement.executeQuery("select * from vikashpersonal.emp");
		
		//Total rows
		rs.last();
		int rows=rs.getRow();
		System.out.println("Total number of rows is :"+rows);
		
		//Total columns 
		java.sql.ResultSetMetaData rmd = rs.getMetaData();
		int clmn =rmd.getColumnCount();
		System.out.println("Total nuber of columns : "+clmn);
		
		/*rs.beforeFirst();
		String data[][] = new String[rows][clmn];
		int i=0;
		while(rs.next()) {
			for(int j=0;j<clmn;j++) {
				data[i][j]=rs.getString(j+1);
				System.out.println(data[i][j]);
			}
			i++;
		}*/
		
		
		/*rs.beforeFirst();
		while(rs.next()) {			
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		conn.close();  
		}*/
		
		List<String> values = new ArrayList<String>();
		rs.beforeFirst();
		while(rs.next()) {			
			
			values.add(rs.getString(1));
			System.out.println();
			
			}

	}
	public static void setMysqlDbConnection() {
		
	}

}
