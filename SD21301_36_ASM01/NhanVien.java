/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SD21301_36_ASM01;

/**
 *
 * @author ADMIN
 */
public abstract class NhanVien {
    String MaNV;
    String Hoten;
    double Luong;
    String LoaiNV;

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public String getLoaiNV() {
        return LoaiNV;
    }

    public void setLoaiNV(String LoaiNV) {
        this.LoaiNV = LoaiNV;
    }
    
    
    
    public NhanVien(){
        
    }

    public NhanVien(String MaNV, String Hoten, double Luong, String LoaiNV) {
        this.MaNV = MaNV;
        this.Hoten = Hoten;
        this.Luong = Luong;
        this.LoaiNV = LoaiNV;
    }

    public NhanVien(String LoaiNV) {
        this.LoaiNV = LoaiNV;
    }

    
    
    public double getThue(double thue){
        return thue;
    }
    
    abstract public double getThuNhap();
    abstract public void nhap();
    abstract public void xuat();
    
}