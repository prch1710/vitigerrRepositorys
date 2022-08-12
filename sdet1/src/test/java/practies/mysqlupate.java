package practies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class mysqlupate {
	public static void main(String[] args) throws SQLException {
	Driver DriverRef=new Driver();
	DriverManager.registerDriver(DriverRef);
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/teachers_info","root","root");
Statement stat=conn.createStatement();
String query="insert into teachers(first_name,address)values('chayan','bang')";
int result=stat.executeUpdate(query);
if(result==1)
{
System.out.println("user is created");	
}else
{
System.out.println("user not created");

}
conn.close();
	}}
