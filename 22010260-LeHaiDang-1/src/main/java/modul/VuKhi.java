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
public class VuKhi {
    private String ID;
    private String tenVuKhi;
    private int soLuong;
    private String loai;
    private int gia;
    private Date ngayNhap;

    public VuKhi() {
    }

    public VuKhi(String ID, String tenVuKhi, int soLuong, String loai, int gia, Date ngayNhap) {
        this.ID = ID;
        this.tenVuKhi = tenVuKhi;
        this.soLuong = soLuong;
        this.loai = loai;
        this.gia = gia;
        this.ngayNhap = ngayNhap;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTenVuKhi() {
        return tenVuKhi;
    }

    public void setTenVuKhi(String tenVuKhi) {
        this.tenVuKhi = tenVuKhi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    

}
