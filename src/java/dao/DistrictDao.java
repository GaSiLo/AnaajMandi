package dao;

import conn.MyConn;
import dto.District;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DistrictDao {
	public int enterDistrict(District district){
		int i = 0;
		try {
		Connection con = MyConn.getConn() ;	
                    PreparedStatement s =con.prepareStatement("insert into district(district_name) values(?)");
			s.setString(1, district.getDistrictName());
			i = s.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e){
			System.out.println(e);
		}
		return i;
	}
	
	public ArrayList<District> getDistricts(){
		ArrayList<District> list = new ArrayList<>();
		try {
		Connection con = MyConn.getConn() ;	
    PreparedStatement s =con.prepareStatement("select * from district");
			ResultSet rs = s.executeQuery();
			while(rs.next()){
				District d = new District();
				d.setDistrictId(rs.getInt(1));
				d.setDistrictName(rs.getString(2));
				list.add(d);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e){
			System.out.println(e);
		}
		return list;
	}
	
	public int deleteDistrict(int districtId){
		int i = 0;
		try {
			Connection con = MyConn.getConn() ;	
    PreparedStatement s = con.prepareStatement("delete from district where district_id = ?");
		 s.setInt(1, districtId);
			i = s.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e){
			System.out.println(e);
		}
		return i;
	}
	
	public int updateDistrict(District district){
		int i = 0;
		try {
				Connection con = MyConn.getConn() ;	
    
                    PreparedStatement s =con.prepareStatement("update district set district_name = ? where district_id = ?");
			s.setString(1, district.getDistrictName());
			s.setInt(2, district.getDistrictId());
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
