package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public abstract class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "capg", "capg");
			PreparedStatement ps=con.prepareStatement("Insert into emp values(?,?)");
			Scanner s = new Scanner(System.in);
			int y=0;
			for(int i=0;i<3;i++) {
			System.out.println("enter student id");
			int stid = s.nextInt();
			System.out.println("enter student name");
			String stname = s.next();
			//setting the dynamic values using setter methods of PreparedStatement
			ps.setInt(1, stid);
			ps.setString(2, stname);
			int x=ps.executeUpdate();
			y+=x;
			}
			System.out.println(y + "row(s) inserted");
			con.close();
			
		}catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
