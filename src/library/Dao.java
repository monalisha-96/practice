package library;
import java.sql.*;
public class Dao {
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@PC326439:1521:xe","system","password-1");
		}
		catch(Exception e){}
		return con;
	}
	public static int insert(Book obj)
	{
		int i=0;
		try
		{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into BookName values (?,?,?)");
		ps.setString(1,obj.getName() );
		ps.setString(2,obj.getAuthor());
		ps.setString(3, obj.getCallno());
		i=ps.executeUpdate();
		}
		catch(Exception e){}
		return i;
	}
}
