package selenium1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class dbAccess {


public static void main (String[] args) throws SQLException, InterruptedException

{
	Connection con = null;
	con=DriverManager.getConnection(  
            "jdbc:oracle:thin:@ldap://oid.inf.fedex.com:3060/GTM_PROD5_SVC1_L3,cn=OracleContext,dc=ute,dc=fedex,dc=com","GTM_REV_TOOLS","Wr4l3pP5gWVd7apow8eZwnarI3s4e1");
	
	//WebDriver d1;
	//d1 = new ChromeDriver();
	//int	count =0;

//d1.get("WWW.Google.com");
			
			// TODO Auto-generated constructor stub
			 

			 Statement stmnt=con.createStatement();

			 Statement stmnt1=con.createStatement();
			 ResultSet rs=stmnt.executeQuery("Select * from Rebill_regression_mass");
			 ResultSet rs1=stmnt1.executeQuery("Select count(*) from Rebill_regression_mass");
		      
			 rs1.next();
			 ResultSetMetaData resultsetmetadata = rs.getMetaData();
			 System.out.println("Column Count "+resultsetmetadata.getColumnCount());
		int length=rs1.getInt(1);   
		String Columnname[]= new String[resultsetmetadata.getColumnCount()];
			System.out.println("Row Count "+length);
			for(int i=1;i<resultsetmetadata.getColumnCount();i++)
			{
				Columnname[i-1]=resultsetmetadata.getColumnLabel(i);
				
				System.out.println(Columnname[i-1]);
				
			}
                   while(rs.next())
                   {
          			 System.out.print(rs.getInt(3)+"     ");

        			 System.out.print(rs.getInt(4)+"     ");

        			 System.out.print(rs.getNString(5)+"     ");
                	   System.out.println();
                   }
                   String username="3735812";
                   String password="Online20";
	login lg= new login(username,password);
	}
}
