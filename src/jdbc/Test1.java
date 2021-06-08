package jdbc;

import java.sql.*;
import java.sql.DriverManager;

public class Test1 {
	public static void main(String[] args) {
		try {
			// 1-load the driver class name
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2-obtain the connection
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "capg", "capg");
			// create the Statement object for writing the queries
			Statement st=con.createStatement();
			// process the query
			//int i=st.executeUpdate("insert into emp values(105,'capg4')");
			//int j=st.executeUpdate("update emp set ename='capg2' where eid=103");
			int k=st.executeUpdate("delete from emp where eid=108");
			//System.out.println(i + "Rows inserted");
			//System.out.println(j + "Rows updated");
			System.out.println(k + "Rows deleted");
			// close the connection
			con.close();
			
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
