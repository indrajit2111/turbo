package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "capg", "capg");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp");
			ResultSetMetaData rsmd=rs.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				
				System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i) + " " + rsmd.getPrecision(i));
				
			}
			System.out.println();
			System.out.println(rsmd.getColumnName(1)+" "+rsmd.getColumnName(2));
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
			con.close();
		}catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
