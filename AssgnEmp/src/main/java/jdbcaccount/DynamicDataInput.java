package jdbcaccount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicDataInput {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID:");
		int id=sc.nextInt();
		
		System.out.println("Enter Name:");
		String name=sc.next();
		
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		
		System.out.println("Enter Account Number:");
		long accountnumber=sc.nextLong();
		
		System.out.println("Enter Pincode:");
		int pincode=sc.nextInt();
		
		System.out.println("Enter Balance:");
		double balance=sc.nextDouble();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
		System.out.println("Connection created Successfully");
		PreparedStatement ps= con.prepareStatement("insert into account(id,name,age,accountnumber,pincode,balance) values(?,?,?,?,?,?)");
		System.out.println("Statement created Successfully");
		
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setInt(3, age);
		ps.setLong(4, accountnumber);
		ps.setInt(5, pincode);
		ps.setDouble(6, balance);
		
		ps.execute();
		System.out.println("Data Inserted Successfully");

	}

}
