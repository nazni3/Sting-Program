package pack3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class BatchExecution {

	public static void main(String[] args) {
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			System.out.println("Connection created Successfully");
	         Statement st= con.createStatement();
	         st.addBatch("insert into student(id,name,age) values (7,'G',19)");
	         st.addBatch("update student set name='Bunny' where id=3");
	         st.addBatch("insert into student(id,name,age) values (8,'H',19)");
//	         st.addBatch(truncate table student); //truncate returns 0 as it does not count rows 
	          int [] arr=st.executeBatch(); 
	          //executeBatch internally uses executeUpdate that is why it does not support select or DQL commands also DQL returns ResultSet
	          //which cannot be stored in an int array
	          System.out.println(Arrays.toString(arr));
		}catch(SQLException e){
			e.printStackTrace();
		}

	}

}
