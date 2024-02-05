package CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class CallStoredProcedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		System.out.println("Connection created Successfully");
		CallableStatement cs=con.prepareCall("{call retrievedata()}");
		ResultSet rs=cs.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print(rs.getString(2));
			System.out.print(rs.getInt(3));
		}

	}

}
