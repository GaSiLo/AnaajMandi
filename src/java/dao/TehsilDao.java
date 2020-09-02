package dao;

import conn.MyConn;
import dto.District;
import dto.Tehsil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TehsilDao {
	public int enterTehsil(Tehsil tehsil){
		int i = 0;
		try{
		         Connection con = MyConn.getConn() ;
				
                    PreparedStatement s =con.prepareStatement("insert into tehsil(tehsil_name,district_id) values(?,?)");
			s.setString(1, tehsil.getTehsilName());
			s.setInt(2, tehsil.getDistrictId());
			i = s.executeUpdate();
			con.close();
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}catch(SQLException e){
			System.out.println(e);
		}
		return i;
	}
public ArrayList<Tehsil> getTehsils(){
		ArrayList<Tehsil> list = new ArrayList<>();
		try {
		Connection con = MyConn.getConn() ;	
    PreparedStatement s =con.prepareStatement("select * from tehsil");
			ResultSet rs = s.executeQuery();
			while(rs.next()){
				 Tehsil t = new Tehsil();
				t.setTehsilId(rs.getInt(1));
                                t.setTehsilName(rs.getString(2));
				t.setDistrictId(rs.getInt(3));
			list.add(t);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e){
			System.out.println(e);
		}
		return list;
	}
	
	public int deleteTehsil(int tehsilId){
		int i = 0;
		try {
			Connection con = MyConn.getConn() ;	
    PreparedStatement s = con.prepareStatement("delete from tehsil where tehsil_id = ?");
		 s.setInt(1, tehsilId);
			i = s.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e){
			System.out.println(e);
		}
		return i;
	}
	
	public int updateTehsil(Tehsil tehsil){
		int i = 0;
		try {
				Connection con = MyConn.getConn() ;	
    
                    PreparedStatement s =con.prepareStatement("update tehsil set tehsil_name = ? where tehsil_id = ?");
			s.setString(1, tehsil.getTehsilName());
                        s.setInt(2, tehsil.getDistrictId());
			
			i = s.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e){
			System.out.println(e);
		}
		return i;
                			
	}
	
}


