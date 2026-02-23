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
public class SinhVien {
    String Hoten;
    float Diem;
    
    // phuong thuc thouc tinh
    public String getHoten(){
        return this.Hoten;
    }
    
    public void setHoten (String hoten){
        Hoten = hoten;
    }
    
    public float getDiem(){
        return Diem;
    }
    
    public void setDiem(float diem){
        this.Diem = diem;
    }
    
    //phương thức khởi tạo constructor
    public SinhVien(){};
    
    public SinhVien (String hoten){
        Hoten = hoten;
        Diem = 0;
    }
    
    public SinhVien (String hoten, float diem){
        Hoten = hoten;
        Diem = diem;
    }
    
    //nhâp sinh vien
    public void NhapSinhvien(){
        Scanner s = new Scanner(System.in);
        System.out.print("Ho ten: ");
        Hoten = s.nextLine();
        System.out.print("Diem: ");
        Diem = s.nextFloat();
        s.nextLine();
    }
    
    //xuất sinh vien
    public void XuatSinhVien(){
        System.out.printf("%-20s %.1f \n", Hoten, Diem);
    }
    
    @Override
    public String toString(){
        return String.format("%-20s %.1f", Hoten, Diem);
    }
}