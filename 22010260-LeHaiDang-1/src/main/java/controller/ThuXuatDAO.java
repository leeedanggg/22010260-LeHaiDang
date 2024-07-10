package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modul.ThuXuat;

public class ThuXuatDAO {
    private Connection conn;

    public ThuXuatDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bangthuxuat", "root", "Dng1234.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addThuXuat(ThuXuat t) {
        String sql = "INSERT INTO tblThuXuat(tenVuKhi, ngay, hanhDong, soLuong, soLuongDan) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getTenVuKhi());
            ps.setDate(2, new java.sql.Date(t.getNgay().getTime()));
            ps.setString(3, t.getHanhDong());
            ps.setInt(4, t.getSoLuong());
            ps.setInt(5, t.getSoLuongDan());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<ThuXuat> getListThuXuat() {
        ArrayList<ThuXuat> list = new ArrayList<>();
        String sql = "SELECT * FROM tblthuxuat";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThuXuat t = new ThuXuat();
                t.setTenVuKhi(rs.getString("tenVuKhi"));
                t.setNgay(rs.getDate("ngay"));
                t.setHanhDong(rs.getString("hanhDong"));
                t.setSoLuong(rs.getInt("soLuong"));
                t.setSoLuongDan(rs.getInt("soLuongDan"));
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        new ThuXuatDAO();
    }
}
