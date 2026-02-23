/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SD21301_36_Lab05;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class sanpham {
    String TenSP;
    double DonGia;
    double GiamGia;
    double ThueNhapKhau;
    
    public String GetTenSp(){
        return this.TenSP;
    }
    
    public void SetTenSp(String tensp){
        TenSP = tensp;
    }
    
    public double Getdongia(){
        return this.DonGia;
    }
    
    public void SetDonGia(double dongia){
        DonGia  = dongia;
    }
    
    public double GetGiamGia(){
        return this.GiamGia;
    }
    
    public void SetGiamGia(double giamgia){
        GiamGia = giamgia;
    }
    
    public double GetThueNhapKhau(){
        return this.ThueNhapKhau;
    }
    
    public void SetThueNhapKhau(double thuenhapkhau){
        ThueNhapKhau = thuenhapkhau;    
    }
    
    public sanpham(){};
    
    public sanpham(String tensp){
        TenSP = tensp;
        DonGia = 0;
        GiamGia = 0.1;
    }
    
    public sanpham(String tensp, double dongia, double giamgia){
        TenSP = tensp;
        DonGia = dongia;
        GiamGia = giamgia;
    }
    
    public void nhapSanPham (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        TenSP = sc.nextLine();
        System.out.print("Nhap gia tien cua san pham: ");
        DonGia = sc.nextDouble();
        System.out.print("Nhap giam gia: ");
        GiamGia = sc.nextDouble();
        ThueNhapKhau = DonGia*0.1;
    }
    
    public void xuatSanPham(){
        System.out.printf("Ten SP: %s\n Gia Tien: %.2f\n ", TenSP, DonGia);
        System.out.printf("Giam Gia: %.2f\n Thue: %.2f\n", GiamGia, ThueNhapKhau);
    }
}

