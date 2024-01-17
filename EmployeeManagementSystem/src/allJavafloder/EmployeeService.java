package allJavafloder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeService {
	public static void addEmp(Connection con) throws SQLException
	{
	 System.out.println("yes are in admin");
     PreparedStatement ps=con. prepareStatement("insert into Employee(id,name,age,mobilenumber,email,password,dept,salary) values(?,?,?,?,?,?,?,?)");
      Scanner sc=new Scanner(System.in);
 
      int id = (int) (Math.random() * 6);
      ps.setInt(1, id);
      
      System.out.println("enter the name");
      String name=sc.next();
      ps.setString(2, name);
      
      System.out.println("enter the age");
      int age=sc.nextInt();
      ps.setInt(3, age);
      
      System.out.println("enter the phone number"); 
      long num=sc.nextLong();
      ps.setLong(4, num);
      
      System.out.println("enter the email");
      String email=sc.next();
      ps.setString(5, email);
      
      System.out.println("enter the password");
      String pass=sc.next();
      ps.setString(6,pass);
      
      System.out.println("enter the deptno");
      String dept=sc.next();
      ps.setString(7, dept);
      
      System.out.println("enter the salary");
      long sal=sc.nextLong();
      ps.setLong(8, sal);
      
      ps.execute();
      System.out.println("yes your data is insert");
      allMethodAdmin();
      
	}
	public static void updateEmp( Connection con) throws SQLException
	{
		Update.allUpdateMethod(con);
	}
	public static void deleteEmp( Connection con)
	{
		
	}
	public static void showEmp(Connection con)
	{
		
	}
	public static void allMethodAdmin() throws SQLException
	{ System.out.println("1 Add Employee");
	  System.out.println("2 update Employee");
	  System.out.println("3 Delete Employee");
	  System.out.println("4 show Employee");
	  Scanner sc=new Scanner(System.in);
	  int ans=sc.nextInt();
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ employeemanagementsystemm","root","YES");	
	  switch(ans)
	  {
	  case 1:
	     addEmp(con);
	     break;
	  case 2:
		  updateEmp(con);
		  break;
	  case 3:
		  deleteEmp(con);
		  break;
		  
	  case 4:
		  showEmp(con);
		  break;
	   default :
		   System.out.println("no option");
		  
	  }
	}
}
