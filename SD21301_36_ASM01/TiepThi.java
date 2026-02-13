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
public class TiepThi  extends NhanVien{
    private double DoanhSo;
    private double hueHOng;

    public double getDoanhSo() {
        return DoanhSo;
    }

    public void setDoanhSo(double DoanhSo) {
        this.DoanhSo = DoanhSo;
    }

    public double getHueHOng() {
        return hueHOng;
    }

    public void setHueHOng(double hueHOng) {
        this.hueHOng = hueHOng;
    }
    
    public TiepThi(){}

    public TiepThi(double DoanhSo, double hueHOng, String MaNV, String Hoten, double Luong, String LoaiNV) {
        super(MaNV, Hoten, Luong, LoaiNV);
        this.DoanhSo = DoanhSo;
        this.hueHOng = hueHOng;
    }
    
    public TiepThi(String LoaiNV){
        super(LoaiNV);
    }
    
    @Override 
    public double getThuNhap(){
     return getLuong() + DoanhSo*hueHOng;
    }
    
    @Override 
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten nhan vien: ");
        setHoten(s.nextLine());
        System.out.print("Nhap ma nhan vien: ");
        setMaNV(s.nextLine());
        System.out.print("Nhap Luong nhan vien: ");
        setLuong(s.nextDouble());
        System.out.print("Nhap hue hong: ");
        setHueHOng(s.nextDouble());
        System.out.print("Nhap doanh so: ");
        setDoanhSo(s.nextDouble());
    }
    
    @Override
    public void xuat(){
        System.out.printf("%-20s %-10s %-15.1f %-15s %-10.1f", getHoten(), getMaNV(), getLuong(), getLoaiNV(), getThuNhap());
    }
}
