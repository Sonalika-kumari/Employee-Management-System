package allJavafloder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateAdminTable {
     public static void main(String args[]) throws ClassNotFoundException, SQLException
     { Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeManagementSystemm","root","YES");	
      Statement st= con.createStatement();
      st.execute("create table admin(Email varchar(10) primary key, Password varchar(10));");
      System.out.println("done");
    	 
     }
}
