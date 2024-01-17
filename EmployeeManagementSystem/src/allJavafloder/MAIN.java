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
	    	 //methodcall;    
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
			  //method Call()
		  }
		  else {
			  System.out.println("w password and id");
		  }
	   }
	   else {
		   System.out.println("InValid");
	   }
// Class.forName("com.mysql.cj.jdbc.Driver");
//	
//    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldatabase","root","YES");	
//     
//     PreparedStatement ps=con. prepareStatement("select* from user where id=?");
//     Scanner sc=new Scanner(System.in);-+
//     
		
	}

}
