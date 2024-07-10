package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modul.VuKhi;

public class VuKhiDAO {
    private Connection conn;

    public VuKhiDAO(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bangvukhi", "root", "Dng1234.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addVuKhi(VuKhi v){

        String sql = "INSERT INTO tblVuKhi(ID, tenVuKhi, soLuong, loai, gia, ngayNhap) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, v.getID());
            ps.setString(2, v.getTenVuKhi());
            ps.setInt(3, v.getSoLuong());
            ps.setString(4, v.getLoai());
            ps.setInt(5, v.getGia());
            ps.setDate(6, new java.sql.Date(v.getNgayNhap().getTime()));

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public ArrayList<VuKhi> getListVuKhi(){
        ArrayList<VuKhi> list = new ArrayList<>();

        String sql = "SELECT * FROM tblvukhi";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                VuKhi v = new VuKhi();
                v.setID(rs.getString("ID"));
                v.setTenVuKhi(rs.getString("tenVuKhi"));
                v.setSoLuong(rs.getInt("soLuong"));
                v.setLoai(rs.getString("loai"));
                v.setGia(rs.getInt("gia"));
                v.setNgayNhap(rs.getDate("ngayNhap"));

                list.add(v);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
        new VuKhiDAO();
    }
}
