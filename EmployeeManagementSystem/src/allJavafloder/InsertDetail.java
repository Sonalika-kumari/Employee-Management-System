package allJavafloder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDetail {
	public static void main(String args[]) throws SQLException
	{ Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldatabase","root","YES");	
      PreparedStatement ps=con. prepareStatement("insert into Employee values(id int, ");
      Scanner sc=new Scanner(System.in);
      
		
	}
	

}
