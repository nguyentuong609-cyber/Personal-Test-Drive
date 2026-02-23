/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SD21301_36_Lab05;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class SD21301_36_Lab05_Bai02 {
    ArrayList<SinhVien> dssv = new ArrayList<>();
    static void menu(){
        String menu = """
                      Chao mung xin nhap so de chon bai
                      Bai 1: Nhập danh sách họ và tên.                      
                      Bai 2: Xuất danh sách vừa nhập.
                      Bai 3: Xuất danh sách ngẫu nhiên.
                      Bai 4: Sắp xếp giảm dần và xuất danh sách.
                      Bai 5: Tìm và xóa họ tên nhập từ bàn phím.
                      6: Exit
                      """;
        System.out.println(menu);
        System.out.print("Nhap so de chon bai: ");
    }
    static void clearScreen() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

    static void promptEnterKey(){
       System.out.println("Press \"ENTER\" to continue...");
       Scanner scanner = new Scanner(System.in);
       scanner.nextLine();
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int choice = 0;
        
        DanhSachSV ds = new DanhSachSV();
        do {
            clearScreen();
            menu();
            choice = s.nextInt();
            clearScreen();
            
            switch(choice){
                    case 1:
                        clearScreen();
                        System.out.println("Bai 1: Nhập danh sách họ và tên.\n");
                        ds.nhapsv();
                        promptEnterKey();

                        break;
                    case 2:
                        clearScreen();
                        System.out.println("Bai 2: Xuất danh sách vừa nhập.\n");
                        ds.xuatSV();
                        promptEnterKey();
                       
                        break;
                    case 3:
                        clearScreen();
                        System.out.println("Bai 3: Xuất danh sách ngẫu nhiên.\n");
                        ds.sapxepngaunhien();
                        ds.xuatSV();
                       
                        promptEnterKey();
                        break;
                    case 4:
                        clearScreen();
                        System.out.println("Bai 4: Sắp xếp giảm dần và xuất danh sách.\n");
                        ds.sapxepgiamdan();
                        ds.xuatSV();
                        promptEnterKey();
                        break;
                    case 5:
                        clearScreen();
                        System.out.println("Bai 5: Tìm và xóa họ tên nhập từ bàn phím.\n");
                        s.nextLine();
                        String tenTim;
                        System.out.print("Ban nhap ten san pham muon tim: ");
                        tenTim = s.nextLine();
                        
                        SinhVien sinhvientim = ds.tiemSV(tenTim);
                        if(sinhvientim != null){
                           System.out.println("Tim thay san pham:");
                           sinhvientim.XuatSinhVien();
                        }else{
                           System.out.println("Khong tim thay");
                        }



                        promptEnterKey();
                        break;
                }
            
        }while(choice !=6);
    }
}
