package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class exp11 {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
		Statement stmt = con.createStatement();
		/*String q = "insert into Employee values(500011488,'Utkarsh','SOCS',89000.90)";
		stmt.execute(q);*/
		/*String i = "update Employee set salary=20000 where salary<20000";
		stmt.execute(i);*/
		/*String j = "delete from Employee where dept = 'SODS'";
		stmt.execute(j);*/
		ResultSet rs = stmt.executeQuery("select * from Employee");
		/*while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
		}*/
		System.out.println("Employees whose salary is greater than 25000");
		while(rs.next())
		{
			if(rs.getFloat(4)>25000)
			{
				System.out.println(rs.getString(2)+" "+rs.getString(3));
			}
		}
		con.close();
		System.out.println("Query executed");
	}

}
