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
public class SD21301_36_Lab05_Bai03 {
     static void menu(){
        String menu = """
                      Chao mung xin nhap so de chon bai
                      Bai 1: Nhap danh sach.
                      Bai 2: Sắp xếp giảm dần theo giá và xuất ra màn hình.
                      Bai 3: Tìm và xóa sản phẩm theo tên nhập từ bàn phím.
                      Bai 4: Xuất giá trung bình của các sản phẩm.
                      Bai 5: Thêm một sản phảm vào danh sách tại vị trí người dùng ngõ.
                      Bài 6: Cập nhật sản phẩm theo tên.
                      Bài 7: Xuất danh sách sản phẩm trên giá trung bình.
                      So 8: Exit.
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
       System.out.println("Nham \"ENTER\" de tiep tuc...");
       Scanner scanner = new Scanner(System.in);
       scanner.nextLine();
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DanhSachSP_Lab05 ds = new DanhSachSP_Lab05();
        int choice = 0;
        do {
            clearScreen();
            menu();
            choice = s.nextInt();
            
            
            switch(choice){
                    case 1:
                        clearScreen();
                        System.out.println("Bai 1: Nhap danh sach.\n");
                        ds.themDanhSachSP();
                        promptEnterKey();

                        break;
                    case 2:
                        clearScreen();
                        System.out.println("Bai 2: Sắp xếp giảm dần theo giá và xuất ra màn hình.\n");
                        ds.sapXepGiamDan();
                        ds.xuatDanhSachSP();
                        promptEnterKey();
                       
                        break;
                    case 3:
                        clearScreen();
                        System.out.println("Bai 3: Tìm và xóa sản phẩm theo tên nhập từ bàn phím\n");
                        s.nextLine();
                        String tensp = s.nextLine();

                        System.out.print("Ban co muon xoa khong (Y/N): ");
                        String chon = s.nextLine();
                        if(chon.toLowerCase().equals("y")){
                            ds.xoaSanPham(tensp);
                            break;
                        }
                        else{
                            System.out.println("Huy Xoa san pham");
                        }

                        promptEnterKey();
                        break;
                    case 4:
                        clearScreen();
                        System.out.println("Bai 4: Xuất giá trung bình của các sản phẩm.\n");
                        ds.tinhTrungBinh();
                        promptEnterKey();
                        
                        break;
                    case 5:
                        clearScreen();
                        System.out.println("Bai 5: Thêm một sản phảm vào danh sách tại vị trí người dùng ngõ.");
                        int vitri;
                        System.out.print("Nhap so vi tri: ");
                        vitri = s.nextInt();
                        ds.themSanPham(vitri);
                        promptEnterKey();
                        
                        break;
                        
                    case 6:
                        clearScreen();
                        System.out.println("Bài 6: Cập nhật sản phẩm theo tên.");
                        System.out.print("Nhap ten san pham: ");
                        String tensptiem = s.nextLine();
                        
                        int vitritiem = ds.TiemkiemSanPham(tensptiem);
                        if(vitritiem != -1){

                            ds.capNhatSanPham(vitritiem);
                        }else{
                            System.out.println("\n Khong tim san pham co ten: " + tensptiem);
                        }
                        
                        promptEnterKey();
                        break;
                        
                    case 7:
                        clearScreen();
                        System.out.println("Bài 7: Xuất danh sách sản phẩm trên giá trung bình.");
                        ds.giaTrenTB();
                        
                        promptEnterKey();
                        break;
                    case 8:
                        clearScreen();
                        System.out.println("chao tam biet va hen gap lai.\n");
                        
                        break;
                }
            
        }while(choice !=8);
    }
}
