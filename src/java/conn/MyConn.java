package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConn {
	private static Connection con;
	public static Connection getConn()throws ClassNotFoundException,SQLException{
		if(con==null || con.isClosed()){
			Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anaj_mandi","root","root");
		}
		return con;
	}    
}
