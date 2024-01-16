package allJavafloder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable { 
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeManagementSystemm","root","YES");	
	      Statement st= con.createStatement();
	      st.execute("create table Employee(id int primary key,name varchar(10),age int, mobilenumber long, email varchar(10) unique,password varchar(10),dept varchar(20),salary long)");
	      System.out.println("done");
	}
}
