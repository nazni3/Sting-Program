package jdbcaccount;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchData {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID to fetch:");
		int id=sc.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
		System.out.println("Connection created Successfully");
		PreparedStatement ps= con.prepareStatement("select * from account where id=?");
		
		ps.setInt(1, id);
//		ps.setString(2, name);
//		ps.setInt(3, age);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		
		

	}

}
