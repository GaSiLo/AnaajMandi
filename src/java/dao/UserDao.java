package dao;

import conn.MyConn;
import dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
	public boolean login(User user){
		boolean flag = false;
		try {
			         Connection con = MyConn.getConn() ;
			PreparedStatement s =con.prepareStatement("select * from  data where user_name = ? and user_pass = ?");
			s.setString(1, user.getUserName());
			s.setString(2, user.getUserPass());
			ResultSet rs = s.executeQuery();
			if(rs.next()){
				flag = true;
			}
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e){
			System.out.println(e);
		}
		return flag;
	}
}
