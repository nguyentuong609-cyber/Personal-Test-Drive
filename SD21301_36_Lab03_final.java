/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SD21301_36_Lab03;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SD21301_36_Lab03_final {
    static void menu()
    {
        System.out.println("Cac chuc nang:");
        System.out.println("1. Bai 1: kiem tra so nguyen to ");
        System.out.println("2. Bai 2: Bang cuu trung");
        System.out.println("3. Bai 3: Mang so nguyen");
        System.out.println("4. Bai 4: Ho ten va diem cua Sinh Vien");
        System.out.println("5. Exit");
        System.out.print("Nhap so de chon chuc nang: ");
    }
    
    static void promptEnterKey(){
       System.out.println("Nhap \"ENTER\" de tiep tuc...");
       Scanner scanner = new Scanner(System.in);
       scanner.nextLine();
    }
    
    static void clearScreen() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
    
    static boolean kiemTraSoNT (int x){
        for (int i = 2; i <= x/2; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
    
    static void bangCuuChuong(){
        
        for (int startTable = 2; startTable <= 9; startTable += 3){
            int endTable = Math.min(startTable + 2, 9);

            for (int i = 1; i <= 10; i++){
                for (int j = startTable; j <= endTable; j++){
                    System.out.print(j + " nhan " + i + " = " + (i * j) + "\t");
                }
                System.out.println();
            }
            System.out.println(); 
        }
    }
    
    static String hocluc(int x){
        if (x < 5) return "Yeu";
        else if (x < 6.5) return "Trung Binh";
        else if (x < 7.5) return "Kha";
        else if (x < 9 ) return "Gioi";
        else if (x <= 10) return "Xuat Sac";
        else return "Khong hop le";
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = 0;
        do{
            clearScreen();
            menu();
            choice = s.nextInt();
            
            switch(choice){
                case 1:
                    clearScreen();
                    System.out.println("Ban da chon bai 1");
                    System.out.print("Nhap so de kiem tra:");
                    int x = s.nextInt();
                    s.nextLine();
                    if(kiemTraSoNT(x)){
                        System.out.printf("%d la so nguyen\n", x);
                    }
                    else{
                        System.out.printf("%d khong la so nguyen\n", x);
                    }
                    promptEnterKey();
                    break;
                case 2:
                    clearScreen();
                    System.out.println("Ban da chon bai 2");
                    bangCuuChuong();
                    promptEnterKey();
                    break;
                    
                case 3:
                    clearScreen();
                    System.out.println("Ban da chon  bai 3");
                    
                    int a[];
                    
                    System.out.print("Nhap so mang: ");
                    int n = s.nextInt();
                    a = new int[n];
                    for (int i = 0; i < n; i++){
                        System.out.print("Nhap vao so trong mang: ");
                        a[i] = s.nextInt();
                    }

                    System.out.println("Mang da nhap");
                    for (int i = 0; i < n; i++){
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                    promptEnterKey();

                    System.out.println("xap xep");
                    Arrays.sort(a);
                    for(int i : a){
                        System.out.print(i +" ");
                    }
                    promptEnterKey();
                    

                    System.out.println("Tim so nho nhat");
                    int arraymin = a[0];
                    for (int i : a){
                        arraymin = Math.min(arraymin, i);
                    }
                    System.out.println("So nho nhat la "+arraymin);
                    promptEnterKey();

                    System.out.println("Tinh so trung binh chia het cho 3");
                    int count = 0;
                    int tong = 0;
                    for(int i = 0; i < n; i++){
                        if(a[i] % 3 == 0){
                            tong += a[i];
                            count ++;
                        }                
                    }
                    
                    double trungBinh = (double) tong / count;
                    System.out.printf("Trung binh cua so chia het cho 3: %.2f\n", trungBinh);
                    
                    promptEnterKey();
                    break;
                case 4:
                    clearScreen();
                    System.out.println("Ban da chon bai 4");
                    
                    int soSV;
        
                    System.out.print("lop co bao nhieu sinh vien: ");
                    soSV = s.nextInt();
                    s.nextLine();
                    String tenSV [] = new String[soSV];
                    int diemSV [] = new int [soSV];

                    for(int i = 0; i < soSV; i++){
                        System.out.printf("Nhap Sinh vien so %d: ", i +1);
                        tenSV[i] = s.nextLine();
                        System.out.printf("Nhap diem sinh vien so %d: ", i +1);
                        diemSV[i] = s.nextInt();
                        s.nextLine();
                        System.out.println("");
                    }
                    promptEnterKey();
                    System.out.println("int ra sinh vien");
                    for(int i = 0; i < soSV; i ++){
                        System.out.printf("Sinh vien %d\n", i +1);
                        System.out.printf("sinh vien :%s  diem: %d\n",tenSV[i], diemSV[i]);
                        hocluc(diemSV[i]);
                        System.out.println("");
                    }

                    promptEnterKey();
                    System.out.println("");
                    System.out.println("Xap xep");

                    //xap xep
                    for(int i = 0; i < soSV; i ++){
                        for (int j = i + 1; j < soSV; j ++){
                            if(diemSV[i] > diemSV[j]){
                                int tempdiem = diemSV[i];
                                diemSV[i] = diemSV[j];
                                diemSV[j] = tempdiem;

                                String tempTen = tenSV[i];
                                tenSV[i] = tenSV[j];
                                tenSV[j] = tempTen;
                            }
                        }
                    }

                    //print sau khi xap xep
                    System.out.println("Sau khi xap xep");
                    for(int i = 0; i < soSV; i ++){
                        System.out.printf("sinh vien :%s  diem: %d\n",tenSV[i], diemSV[i]);
                        System.out.println("");
                    }
                    
                    promptEnterKey();
                    break;
                case 5:
                    clearScreen();
                    System.out.println("Cam on va chao tam biet");
                    break;
            }
        }while(choice != 5);
    }
}
