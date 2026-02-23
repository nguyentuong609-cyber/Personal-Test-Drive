/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SD21301_36_Lab05;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
/**
 *
 * @author ADMIN
 */
public class DanhSachSV {
    ArrayList<SinhVien> dssv = new ArrayList<>();
    
    public void nhapsv(){
        Scanner sc = new Scanner(System.in);
        do{
            SinhVien sv = new SinhVien();
            sv.NhapSinhvien();
            dssv.add(sv);
            
            System.out.print("Ban co muon them khong? (Y/N): ");
            String chon = sc.nextLine();
            if(chon.toLowerCase().equals("n"))
                break;
        }while(true);
    }
    
    public void xuatSV(){
        for(SinhVien x: dssv){
            x.XuatSinhVien();
        }
    }
    
    public void sapxepgiamdan(){
        dssv.sort(Comparator.comparingDouble(SinhVien :: getDiem).reversed());
    }
    
    public void sapxepngaunhien(){
        Collections.shuffle(dssv);
    }
    
    public SinhVien tiemSV(String tensv){
        for(int i = 0; i < dssv.size(); i ++){
            SinhVien s = (SinhVien)dssv.get(i);
            if(s.getHoten().equals(tensv)){
                return s;
            }
        }
        return null;
    }
    
    public void xoaSanPham(){
        
    }
}
