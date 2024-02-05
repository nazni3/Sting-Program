package jdbcassg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		
		Statement st= con.createStatement();
		System.out.println("Statement created Successfully");
		
		st.execute("create table product(id int, brand varchar(20),category varchar(20), price double, stock long)");
		System.out.println("Table created Successfully");

	}

}
