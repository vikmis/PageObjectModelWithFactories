package com.w2a.rough;

import java.sql.SQLException;
import java.util.List;

public class ExecuteDataBaseQueryTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//DbManager db = new DbManager();
		String query ="select * from emp";
		DbManager.setMysqlDbConnection();
		 String[][] data = DbManager.getMysqlQuery(query);
		 System.out.println(data);
		

	}

}
