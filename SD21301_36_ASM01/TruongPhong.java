/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SD21301_36_ASM01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TruongPhong extends NhanVien{
    private double trachNhiem;

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    
    public TruongPhong(){}

    public TruongPhong(double trachNhiem, String MaNV, String Hoten, double Luong, String LoaiNV) {
        super(MaNV, Hoten, Luong, LoaiNV);
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(String LoaiNV) {
        super(LoaiNV);
    }
    
     @Override 
    public double getThuNhap(){
     return getLuong() + trachNhiem;
    }
    
    @Override
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten Truong Phong: ");
        setHoten(s.nextLine());
        System.out.print("Nhap ma Truong Phong: ");
        setMaNV(s.nextLine());
        System.out.print("Nhap Luong Truong phong: ");
        setLuong(s.nextDouble());
        System.out.print("Nhap trach nhiem: ");
        setTrachNhiem(s.nextDouble());
    }
    
    @Override
    public void xuat(){
        System.out.printf("%-20s %-10s %-15.1f %-15s %-10.1f", getHoten(), getMaNV(), getLuong(), getLoaiNV(), getThuNhap());
    }
}
