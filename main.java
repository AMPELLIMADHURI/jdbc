package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class main {

	public static void main(String[] args) {
		
		try {
			
			//1.connection create
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata base", "root", "root");
			System.out.println("connection created");
			
			//2 create statement
			
			Statement mystate = mycon.createStatement();
			 System.out.println("create statement");
			//3 Query example
		int rs = mystate.executeUpdate ("INSERT INTO `mydata base`.`employee` (`empid`, `empname`, `emprole`, `empsalary`) VALUES ('50', 'hii', 'dee', '350')");
			System.out.println("query example");
	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
