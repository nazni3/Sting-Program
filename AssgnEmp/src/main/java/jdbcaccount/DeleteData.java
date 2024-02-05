package jdbcaccount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name to delete:");
		String name=sc.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
		System.out.println("Connection created Successfully");
		PreparedStatement ps= con.prepareStatement("delete from account where name=?");
		ps.setString(1, name);
		
		ps.execute();
		System.out.println("Data deleted Successfully");
		

	}

}
