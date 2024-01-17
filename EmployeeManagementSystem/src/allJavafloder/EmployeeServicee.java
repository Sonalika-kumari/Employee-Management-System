package allJavafloder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeServicee {

	 public static void employeeAllMethod() throws SQLException
	 { Scanner sc=new Scanner(System.in);
	  System.out.println("1 show detail ");
	  System.out.println("2 change password");
	  int ans=sc.nextInt();
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ employeemanagementsystemm","root","YES");	
	  if(ans==1)
	  {
		  EmployeeService.showEmp(con);
	  }
	  else if(ans==2)
	  {
    	  PreparedStatement ps=con.prepareStatement("update  Employee set password=? where id=?");
     	 System.out.println("enter the new password");
         String p=sc.next();
     	 ps.setString(1, p);
     	 System.out.println("enter the Empid");
     	 int id=sc.nextInt();
     	 ps.setInt(2,id);
     	 ps.execute();
		  
	  }
	  System.out.println("not valid");
		 
	 }
}
