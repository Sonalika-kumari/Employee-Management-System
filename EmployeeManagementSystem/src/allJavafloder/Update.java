package allJavafloder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Update {
   public static void allUpdateMethod(Connection con) throws SQLException
   {     Scanner sc=new Scanner(System.in);
	     System.out.println("what u want to update");
         System.out.println("1 mobilenumber");
         System.out.println("2 email");
         System.out.println("3 password");
       
       
          int ans=sc.nextInt();
          switch(ans)
          {
          case 1:
          {  PreparedStatement ps=con.prepareStatement("update  Employee set mobilenumber=? where id=?");
        	 System.out.println("enter the new PhoneNumber");
        	 long l=sc.nextLong();
        	 ps.setLong(1, l);
        	 System.out.println("enter the Empid");
        	 int id=sc.nextInt();
        	 ps.setInt(2,id);
        	 ps.execute();
        	
          }
          break;
          case 2:
          {
        	  PreparedStatement ps=con.prepareStatement("update  Employee set email=? where id=?");
         	 System.out.println("enter the new Email");
         	String e=sc.next();
         	 ps.setString(1, e);
         	 System.out.println("enter the Empid");
         	 int id=sc.nextInt();
         	 ps.setInt(2,id);
         	 ps.execute();
          }
          break;
          case 3:
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
          break;
          
           default:
           {
        	   System.out.println("no such case");
           }
        	  
          }
          System.out.print("your data update");
       
         
   }
}
