package allJavafloder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class checkValidationclass {
	public static boolean  checkAdmin(String email, String password) throws ClassNotFoundException, SQLException
	{ 
		 Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeManagementSystemm","root","YES");	
         PreparedStatement ps=con. prepareStatement("select* from Admin where email=? and password=? ");
        
         ps.setString(1,email);
         ps.setString(2,password);
         ResultSet rs=  ps.executeQuery();
         if(rs.next())
         { return true;
         }
        
		return false;
	}
	public static boolean checkEmployee(int id,String password) throws ClassNotFoundException, SQLException
	{
		 Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeManagementSystemm","root","YES");	
         PreparedStatement ps=con. prepareStatement("select* from Employee where id=? and password=? ");
        
         ps.setInt(1,id);
         ps.setString(2,password);
         ResultSet rs=  ps.executeQuery();
         if(rs.next())
         { return true;
         }
        
		return false;
	}

}
