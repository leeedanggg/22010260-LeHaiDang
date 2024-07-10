/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul;

import java.util.Date;

/**
 *
 * @author LeeĐăgg
 */
public class ThuXuat {
    private String TenVuKhi;
    private String HanhDong;
    private Date Ngay;
    private int SoLuong;
    private int SoLuongDan;

    public ThuXuat() {
    }

    public ThuXuat(String TenVuKhi, String HanhDong, Date Ngay, int SoLuong, int SoLuongDan) {
        this.TenVuKhi = TenVuKhi;
        this.HanhDong = HanhDong;
        this.Ngay = Ngay;
        this.SoLuong = SoLuong;
        this.SoLuongDan = SoLuongDan;
    }

    public String getTenVuKhi() {
        return TenVuKhi;
    }

    public void setTenVuKhi(String TenVuKhi) {
        this.TenVuKhi = TenVuKhi;
    }

    public String getHanhDong() {
        return HanhDong;
    }

    public void setHanhDong(String HanhDong) {
        this.HanhDong = HanhDong;
    }

    public Date getNgay() {
        return Ngay;
    }

    public void setNgay(Date Ngay) {
        this.Ngay = Ngay;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getSoLuongDan() {
        return SoLuongDan;
    }

    public void setSoLuongDan(int SoLuongDan) {
        this.SoLuongDan = SoLuongDan;
    }

    
}
