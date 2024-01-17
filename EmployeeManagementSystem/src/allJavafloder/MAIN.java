package allJavafloder;

import java.sql.SQLException;
import java.util.Scanner;

public class MAIN {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{  System.out.println("1 Admin");
	  System.out.println("2 Employee");
	  Scanner sc=new Scanner(System.in);
	   System.out.println("enter the ans");
	   int ans=sc.nextInt();
	   if(ans==1)
	   { System.out.println("enter the email and password");
	     String email=sc.next();
	     String pass=sc.next();
	     if(checkValidationclass.checkAdmin(email,pass))
	     {
	    	 EmployeeService.allMethodAdmin();
	     }
	     else {
	    	 System.out.println("not valid");
	     }
	   }
	   else if(ans==2)
	   {
		   System.out.println("enter the id and password");
		     int id=sc.nextInt();
		     String pass=sc.next();
		  if(checkValidationclass.checkEmployee(id,pass))
		  {
			  EmployeeServicee.employeeAllMethod();
		  }
		  else {
			  System.out.println("w password and id");
		  }
	   }
	   else {
		   System.out.println("InValid");
	   }

		
	}

}
