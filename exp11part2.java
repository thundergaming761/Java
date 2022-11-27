package jdbc;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class exp11part2 {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
		Scanner sc = new Scanner(System.in);
		String i = "insert into Employee values(?,?,?,?)";
		PreparedStatement ps = con. prepareStatement(i);
		 while(true)
		{
			System.out.println("Enter emp_id");
			String s = sc.nextLine();
			int empid = Integer.parseInt(s);
			System.out.println("Enter emp_name");
			String empname = sc.nextLine();
			System.out.println("Enter dept");
			String dept = sc.nextLine();
			System.out.println("Enter salary");
			String s1 = sc.nextLine();
			float salary = Float.parseFloat(s1);
			ps.setInt(1,empid);
			ps.setString(2,empname);
			ps.setString(3,dept);
			ps.setFloat(4,salary);
			ps.execute();
			System.out.println("Do you want to continue y/n");
			String ch = sc.nextLine();
			if(ch.equals("n"))
				break;
		}
		Statement stmt = con.createStatement();
		String j = "update Employee set salary=20000 where salary<20000";
		stmt.execute(j);
		stmt.execute("delete from Employee where dept = 'SODS'");
		ResultSet rs = stmt.executeQuery("select * from Employee");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
		}
		System.out.println("Employees who have salary greater than 25000");
		while(rs.next())
		{
			if(rs.getFloat(4)>25000)
			{
				System.out.println(rs.getString(2)+" "+rs.getString(3));
			}
		}
		con.close();
		System.out.println("Executed");
	}

}
