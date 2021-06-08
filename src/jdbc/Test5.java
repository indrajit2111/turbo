package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test5 {
public static void main(String[] args) {
		


		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","capg","capg");
		
		
		Statement st = con.createStatement();
		
		
	    String q1 = "insert into emp values(101,'capg')";
	    String q2 = "update emp set ename='capg4' where eid=105";
	    String q3 = "delete from emp where eid=101";
	    
	    //adding queries to the batch
	      st.addBatch(q1);
	      st.addBatch(q2);
	      st.addBatch(q3);
	     
	    //process the batch
	  
	     int x[] =  st.executeBatch();
	     
	     System.out.println(x[0] + "row(s) inserted");
	     System.out.println(x[1] + "row(s) updated");
	     System.out.println(x[2] + "row(s) deleted");
	     
	     
	     //closing the connection
	     
	     con.close();
	      
	    
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	

}

}
