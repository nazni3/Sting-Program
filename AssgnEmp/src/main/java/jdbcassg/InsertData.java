package jdbcassg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	
	public static void insertData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		System.out.println("Connection created Successfully");
		
		Statement st= con.createStatement();
		System.out.println("Statement created Successfully");
		
		st.execute("insert into product(id,brand,category,price,stock) values(3,'hjgj','Soda',20,300)");
		System.out.println("Data Inserted Successfully");
		
	}
	public static boolean updateData() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		System.out.println("Connection created Successfully");
		
		Statement st= con.createStatement();
		System.out.println("Statement created Successfully");
		
		st.execute("update product set brand='Mirinda' where id=3");
		System.out.println("Data Updated Successfully");
		
		return true;
		
	}
	public static ResultSet fetchData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
//		System.out.println("Connection created Successfully");
		
		Statement st= con.createStatement();
//		System.out.println("Statement created Successfully");
		
		ResultSet rs= st.executeQuery("select * from product");
		while(rs.next()) {
			System.out.print(rs.getInt(1)+",");
			System.out.print(rs.getString(2)+",");
			System.out.print(rs.getString(3)+",");
			System.out.print(rs.getInt(4)+",");
			System.out.print(rs.getInt(5)+",");
			System.out.println();
			
		}
		
		return rs;
		
		
	}
	
	

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
//		System.out.println("Connection created Successfully");
//		Statement st= con.createStatement();
//		System.out.println("Statement created Successfully");
		
//		st.execute("insert into product(id,brand,category,price,stock) values(1,'Cadbury','Chocolate',10,100)");
//		System.out.println("Data Inserted Successfully");
//		insertData();
//		updateData();
		fetchData();

	}

}
