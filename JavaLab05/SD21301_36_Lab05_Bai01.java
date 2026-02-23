/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SD21301_36_Lab05;
import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class SD21301_36_Lab05_Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> danhsach = new ArrayList<>();
        
        do{
            System.out.print("Nhap so vao danh sach: ");
            double sonhap = sc.nextDouble();
            danhsach.add(sonhap);
            sc.nextLine();
            
            System.out.print("Ban co muon tiep tuc khong? (Y/N)");
            String chon = sc.nextLine();
            if(chon.toLowerCase().equals("n"))
                break;
        }while(true);
        
        for(double x:danhsach){
            System.out.println(x);
        }
        
        System.out.println("Tong cua so danh sach");
        double tong = 0;
        for(double x : danhsach){
            tong += x;
        }
        System.out.print(tong);

    }
    
}
