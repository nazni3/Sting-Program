package pack3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicBatchExecution {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		System.out.println("Connection created Successfully");
         PreparedStatement ps= con.prepareStatement("insert into student(id,name,age) values(?,?,?)");
		
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter ID:");
		int id=sc.nextInt();
		
		System.out.println("Enter Name:");
		String name=sc.next();
		
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setInt(3,age);
		
		ps.addBatch();
		ps.executeBatch();
		System.out.println("Data Inserted Successfully");
		

	}

}
