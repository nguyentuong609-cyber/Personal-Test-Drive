/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SD21301_36_Lab05;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class DanhSachSP_Lab05 {
    ArrayList<sanpham> dssp = new ArrayList<sanpham> ();
    
    public void themDanhSachSP(){
        Scanner sc = new Scanner(System.in);
        do{
            sanpham sp = new sanpham();
            sp.nhapSanPham();
            dssp.add(sp);
            
            System.out.print("Ban co muon tiep tuc khong? (Y/N)");
            String chon = sc.nextLine();
            if(chon.toLowerCase().equals("n"))
                break;
        }while(true);
    }
    
    public void xuatDanhSachSP(){
        for(sanpham x:dssp){
            x.xuatSanPham();
        }
    }
    
    
    public void sapXepGiamDan(){
        dssp.sort(Comparator.comparingDouble(sanpham::Getdongia).reversed());
    }
    
    public int TiemkiemSanPham(String tensp){  
        for(int i = 0; i < dssp.size(); i++){
            sanpham s = (sanpham)dssp.get(i);
            if(s.GetTenSp().equals(tensp)){
                return i;
            }
        }
        return -1;
    }
    
    //xoasanpham
    public void xoaSanPham(String tensp){
        int vitri = TiemkiemSanPham(tensp);
        if(vitri == -1){
            System.out.println("Khong co san pham can xoa");
        }
        else
            dssp.remove(vitri);
    }
    
    //Them danh sach
    public void themSanPham(int vitri){
        Scanner sc = new Scanner(System.in);
        sanpham sp = new sanpham();
        if(dssp.size() <= vitri){
            dssp.add(sp);
        }
        else {
            System.out.print("Ban co muon tiep tuc khong? (Y/N)");
            String chon = sc.nextLine();
                if(chon.toLowerCase().equals("n")){
                    return;  // Exit the method instead of break
                }else{
                    dssp.add(vitri, sp);
                }
        }
    }
    
    public double tinhTrungBinh(){
        double tong =0;
        
        for(sanpham x: dssp){
            tong += x.Getdongia();
        }
        double tb = tong / dssp.size();
        System.out.printf("Trunb binh cua san pham la: %.1f\n", tb);
        return tb;
    }
    
    public void giaTrenTB(){
        System.out.println("Danh sach san pham lon hon tb: ");
        for(sanpham x: dssp){
            if(x.Getdongia() > tinhTrungBinh()){
                xuatDanhSachSP();
            }
        }
    }

    public void capNhatSanPham(int vitri){
        dssp.get(vitri).nhapSanPham();
    }

    public void capNhatSanPham2(int vitri){
        Scanner sc = new Scanner(System.in);
        sanpham capnhat = dssp.get(vitri);
        System.out.print("Nhap ten moi: ");
        capnhat.SetTenSp(sc.nextLine());
        System.out.print("Nhap gia moi: ");
        capnhat.SetDonGia(sc.nextDouble());
        System.out.print("Nhap giam gia moi: ");
        capnhat.SetGiamGia(sc.nextDouble());
    }
    
}
