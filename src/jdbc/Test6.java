package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "capg", "capg");
			con.setAutoCommit(false);
			
			Statement st = con.createStatement();

			int x = st.executeUpdate("update acc set bal=bal-10000 where accno=1000");
			//int y = st.executeUpdate("update acc set bal=bal+10000 where accno=2000");
			int y = st.executeUpdate("update acc set bal=bal+10000 where accno=1001");

			if (x > 0 && y > 0) {
				con.commit();
				System.out.println("funds transferred successfully");
			} else {
				con.rollback();
				System.out.println("please check your account number");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
