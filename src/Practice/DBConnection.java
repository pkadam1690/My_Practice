package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection
{

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
	
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MyPractice", "postgres", "postgres");
		
		System.out.println("Connection is successful");
		//Class.forName("org.postgresql.Driver");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM public.Employee");
		
		while(rs.next())
		{
			String firstname = rs.getString("Fname");
			String lastname = rs.getString("Lname");
			int empid = rs.getInt("Eid");
			
			System.out.println(empid+"     "+firstname+"    "+lastname+"     ");
		}
		
		con.close();
		
	}
	
	
}
