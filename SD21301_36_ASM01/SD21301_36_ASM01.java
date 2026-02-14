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
public class SD21301_36_ASM01 {
    static void menu() {
        System.out.println("Ban can lam gi:");
        System.out.println("1. Nhap danh sach nhan vien");
        System.out.println("2. Xuat danh sach");
        System.out.println("3. Tim nhan vien theo Ma");
        System.out.println("4. Xoa nhan vien");
        System.out.println("5. Cap nhat thong tin");
        System.out.println("6. Tim nhan vien theo quan luong");
        System.out.println("7. Sap xep nhan vien theo ho va ten");
        System.out.println("8. Sap xep nhan vien theo thu nhap");
        System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
        System.out.println("10. Exit");
        System.out.print("Nhap so de chon chuc nang: ");
    }
    
    static void promptEnterKey(){
       System.out.println("Nhap \"ENTER\" de tiep tuc...");
       Scanner sc = new Scanner(System.in);
       sc.nextLine();
    }
    
    static void clearScreen() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        danhsachNV ds = new danhsachNV();
        int choice = 0;
        do {
            clearScreen();
            menu();
            choice = s.nextInt();
            clearScreen();
            
            switch(choice){
                case 1:
                    clearScreen();
                    System.out.println("Ban da chon cong thuc so 1\n");
                    System.out.println("Nhap danh sach nhan vien");
                    System.out.println("");
                    // ds.nhapDanhSachNV();
                    ds.taoDuLieuMau();
                    System.out.println("");
                    promptEnterKey();
                    break;
                case 2:
                    clearScreen();
                    System.out.println("Ban da chon cong thuc so 2\n");
                    System.out.println("Xuat danh sach");
                    System.out.println("");
                    ds.xuatDanhSachNV();
                    System.out.println("");
                    promptEnterKey();
                    break;
                case 3:
                    do{
                        clearScreen();
                        System.out.println("Ban da chon cong thuc so 3\n");
                        System.out.println("3. Tim nhan vien theo Ma");
                        System.out.println("");
                        ds.timNhanVienTheoMa();

                        System.out.print("\nBan co muon tiep tuc tim kiem? (Y/N): ");
                        Scanner sc = new Scanner(System.in);
                        String tiepTuc = sc.nextLine();

                        if(tiepTuc.equalsIgnoreCase("N")){
                            break;
                        }
                    }while(true);
                    break;
                case 4:
                    do{
                        clearScreen();
                        System.out.println("Ban da chon cong thuc so 4\n");
                        System.out.println("4. Xoa nhan vien");
                        System.out.println("");
                        ds.xoaNhanVien();
                        System.out.println("");
                        System.out.print("\nBan co muon xoa them khong? (Y/N): ");
                        Scanner sc = new Scanner(System.in);
                        String tiepTuc = sc.nextLine();

                        if(tiepTuc.equalsIgnoreCase("N")){
                            break;
                        }
                    }while(true);

                    break;
                case 5:
                    do{
                        clearScreen();
                        System.out.println("Ban da chon cong thuc so 5\n");
                        System.out.println("5. Cap nhat thong tin");
                        System.out.println("");
                        ds.capNhatThongTin();
                        System.out.println("");
                        System.out.print("\nBan co muon cap nhat them khong? (Y/N): ");
                        Scanner sc = new Scanner(System.in);
                        String tiepTuc = sc.nextLine();

                        if(tiepTuc.equalsIgnoreCase("N")){
                            break;
                        }
                    }while(true);
                    break;
                case 6:
                    clearScreen();
                    System.out.println("Ban da chon cong thuc so 6\n");
                    System.out.println("6. Tim nhan vien theo quan luong");
                    System.out.println("");
                    ds.timNhanVienTheoLuong();
                    System.out.println("");
                    promptEnterKey();
                    break;
                case 7:
                    clearScreen();
                    System.out.println("Ban da chon cong thuc so 7\n");
                    System.out.println("7. Sap xep nhan vien theo ho va ten");
                    System.out.println("");
                    ds.sapXepTheoHoTen();
                    System.out.println("Da sap xep thanh cong!");
                    System.out.println("\nDanh sach sau khi sap xep:");
                    ds.xuatDanhSachNV();
                    System.out.println("");
                    promptEnterKey();
                    break;
                case 8:
                    clearScreen();
                    System.out.println("Ban da chon cong thuc so 8\n");
                    System.out.println("8. Sap xep nhan vien theo thu nhap");
                    System.out.println("");
                    ds.sapXepTheoThuNhap();
                    System.out.println("Da sap xep thanh cong!");
                    System.out.println("\nDanh sach sau khi sap xep:");
                    ds.xuatDanhSachNV();
                    System.out.println("");
                    promptEnterKey();
                    break;
                case 9:
                    clearScreen();
                    System.out.println("Ban da chon cong thuc so 9\n");
                    System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
                    System.out.println("");
                    ds.xuat5ThuNhatCao();
                    System.out.println("");
                    promptEnterKey();
                    break;
                case 10:
                    clearScreen();
                    System.out.println("Chao tam biet va gap lai");
                    break;
                default:
                    System.out.println("Khong hop le, phien ban chon lai");
            }
            
        }while(choice !=10);
        s.close();
    }
}
