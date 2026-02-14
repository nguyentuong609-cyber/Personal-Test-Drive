/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SD21301_36_ASM01;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
/**
 *
 * @author ADMIN
 */
public class danhsachNV {
    ArrayList<NhanVien> dsnv = new ArrayList<>();
    
    public void nhapDanhSachNV(){
        do{
           Scanner s = new Scanner(System.in);
           System.out.print("Ban muon nhap truong phong (tp) hay tiep thi (tt): ");
           String chonLoai = s.nextLine();
           NhanVien nv;
           if(chonLoai.equalsIgnoreCase("tp")){
               nv = new TruongPhong("Truong Phong");
           }
           else{
               nv = new TiepThi("Tiep Thi");
           }
           
           nv.nhap();
           dsnv.add(nv);

           System.out.println("Ban co muon tiep tuc khong ?(Y/N): ");
           String ketqua = s.nextLine();
           s.nextLine();
           if(ketqua.equalsIgnoreCase("n")){
               break;
           }
        }while(true);
    }

    public void xuatDanhSachNV(){
        for(NhanVien nv : dsnv){
            if(nv.getLoaiNV().equalsIgnoreCase("Truong Phong")){
                nv.xuat();
                System.out.println("");
            }

        }

        for(NhanVien nv: dsnv){
            if(nv.getLoaiNV().equalsIgnoreCase("Tiep Thi")){
                nv.xuat();
                System.out.println("");
            }
        }
    }

    public void timNhanVienTheoMa(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can tim: ");
        String maCanTim = s.nextLine();

        boolean timThay = false;

        for(NhanVien nv : dsnv){
            if(nv.getMaNV().equalsIgnoreCase(maCanTim)){
                System.out.println("\nThong tin nhan vien:");
                nv.xuat();
                System.out.println("");
                timThay = true;
                break;
            }
        }

        if(!timThay){
            System.out.println("Khong tim thay nhan vien voi ma: " + maCanTim);
        }
    }

    public void timNhanVienTheoLuong(){
        Scanner s = new Scanner(System.in);
        System.out.println("Chon cach tiem kiem");
        System.out.println("1. Tim nhan vien >=  gia tri nhap");
        System.out.println("2. Tim nhan vien <= gia tri nhap");
        System.out.println("3. Tim nhan vien trong khoang gia tri nhap");
        System.out.print("Nhap lua chon: ");
        int choice = s.nextInt();

        double min = 0, max = 0;
        boolean found = false;

        switch (choice){
            case 1:
                System.out.print("Nhap muc luong toi thieu: ");
                min = s.nextDouble();

                System.out.println("\nDanh sach nhan vien co luong >= " + min +":");
                for(NhanVien nv : dsnv){
                    if(nv.getLuong() >= min){
                        nv.xuat();
                        System.out.println("");
                        found = true;
                    }
                }
                break;

            case 2:
                System.out.print("Nhap muc luong toi da: ");
                max = s.nextDouble();

                System.out.println("\nDanh sach nhan vien co luong <= " + max + ":");
                for(NhanVien nv : dsnv){
                    if(nv.getLuong() <= max){
                        nv.xuat();
                        System.out.println("");
                        found = true;
                    }
                }
                break;

            case 3:
                System.out.print("Nhap muc luong toi thieu: ");
                min = s.nextDouble();

                System.out.print("Nhap muc luong toi da: ");
                max = s.nextDouble();

                if(min > max){
                    System.out.println("Luong toi thieu phai nho hon toi da");
                    return;
                }

                System.out.println("\nDanh sach nhan vien co luong tu " + min + " toi " + max);
                for(NhanVien nv : dsnv){
                    if(nv.getLuong() >= min && nv.getLuong() <= max){
                        nv.xuat();
                        System.out.println("");
                        found = true;
                    }
                }
                break;

            default:
                System.out.println("Lua chon khong hop le!");
                return;
        }
        if(!found){
            System.out.println("Khong tim thay nhan vien phu hop voi dieu kien");
        }
    }

    public void xoaNhanVien(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can xoa: ");
        String maCanXoa = s.nextLine();

        boolean found = false;

        for(int i = 0; i < dsnv.size(); i++){
            if(dsnv.get(i).getMaNV().equalsIgnoreCase(maCanXoa)){
                System.out.println("\nThong tin nhan vien se bi xoa:");
                dsnv.get(i).xuat();
                System.out.println("");

                System.out.print("Ban co chac chan muon xoa nhan vien nay? (Y/N): ");
                String xacNhan = s.nextLine();

                if(xacNhan.equalsIgnoreCase("Y")){
                    dsnv.remove(i);
                    System.out.println("Da xoa nhan vien thanh cong!");
                } else {
                    System.out.println("Huy bo xoa nhan vien.");
                }

                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Khong tim thay nhan vien");
        }
    }

    public void capNhatThongTin(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can cap nhat: ");
        String maCanCapNhat = s.nextLine();

        boolean found = false;

        for(int i = 0; i < dsnv.size(); i++){
            if(dsnv.get(i).getMaNV().equalsIgnoreCase(maCanCapNhat)){
                System.out.println("\nThong tin nhan vien hien tai:");
                dsnv.get(i).xuat();
                System.out.println("\n");

                System.out.println("Chon thong tin can cap nhat:");
                System.out.println("1. Cap nhat ten");
                System.out.println("2. Cap nhat luong");

                // Check if it's TiepThi or TruongPhong to show specific options
                if(dsnv.get(i) instanceof TiepThi){
                    System.out.println("3. Cap nhat hue hong");
                    System.out.println("4. Cap nhat doanh so");
                } else if(dsnv.get(i) instanceof TruongPhong){
                    System.out.println("3. Cap nhat trach nhiem");
                }

                System.out.print("Nhap lua chon: ");
                int luaChon = s.nextInt();
                s.nextLine();

                switch(luaChon){
                    case 1:
                        System.out.print("Nhap ten moi: ");
                        String tenMoi = s.nextLine();
                        dsnv.get(i).setHoten(tenMoi);
                        System.out.println("Da cap nhat ten thanh cong!");
                        break;
                    case 2:
                        System.out.print("Nhap luong moi: ");
                        double luongMoi = s.nextDouble();
                        dsnv.get(i).setLuong(luongMoi);
                        System.out.println("Da cap nhat luong thanh cong!");
                        break;
                    case 3:
                        if(dsnv.get(i) instanceof TiepThi){
                            System.out.print("Nhap hue hong moi: ");
                            double hueHongMoi = s.nextDouble();
                            ((TiepThi)dsnv.get(i)).setHueHOng(hueHongMoi);
                            System.out.println("Da cap nhat hue hong thanh cong!");
                        } else if(dsnv.get(i) instanceof TruongPhong){
                            System.out.print("Nhap trach nhiem moi: ");
                            double trachNhiemMoi = s.nextDouble();
                            ((TruongPhong)dsnv.get(i)).setTrachNhiem(trachNhiemMoi);
                            System.out.println("Da cap nhat trach nhiem thanh cong!");
                        }
                        break;
                    case 4:
                        if(dsnv.get(i) instanceof TiepThi){
                            System.out.print("Nhap doanh so moi: ");
                            double doanhSoMoi = s.nextDouble();
                            ((TiepThi)dsnv.get(i)).setDoanhSo(doanhSoMoi);
                            System.out.println("Da cap nhat doanh so thanh cong!");
                        }
                        break;
                    default:
                        System.out.println("Lua chon khong hop le!");
                }

                System.out.println("\nThong tin sau khi cap nhat:");
                dsnv.get(i).xuat();
                System.out.println("");

                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Khong tim thay nhan vien voi ma: " + maCanCapNhat);
        }
    }

    public void sapXepTheoHoTen(){
        dsnv.sort(Comparator.comparing(NhanVien :: getHoten));
    }

    public void sapXepTheoThuNhap(){
        dsnv.sort(Comparator.comparingDouble(NhanVien :: getLuong).reversed());
    }

    public void xuat5ThuNhatCao(){
        sapXepTheoThuNhap();
        System.out.println("5 nhan vien much luong cao nhat");
        for(int i = 0; i < Math.min(5, dsnv.size()); i++){
            NhanVien nv = dsnv.get(i);
            nv.xuat();
            System.out.println("");
        }
    }
// DELETE THIS BEFORE TURN IN!!!!
    public void taoDuLieuMau(){
        // 5 Truong Phong
        TruongPhong tp1 = new TruongPhong(5000, "TP001", "Nguyen Van An", 15000, "Truong Phong");
        TruongPhong tp2 = new TruongPhong(4500, "TP002", "Tran Thi Binh", 18000, "Truong Phong");
        TruongPhong tp3 = new TruongPhong(6000, "TP003", "Le Van Cuong", 20000, "Truong Phong");
        TruongPhong tp4 = new TruongPhong(4000, "TP004", "Pham Thi Dung", 12000, "Truong Phong");
        TruongPhong tp5 = new TruongPhong(5500, "TP005", "Hoang Van Em", 16000, "Truong Phong");

        // 5 Tiep Thi
        TiepThi tt1 = new TiepThi(50000, 0.1, "TT001", "Vo Thi Phuong", 8000, "Tiep Thi");
        TiepThi tt2 = new TiepThi(80000, 0.12, "TT002", "Dang Van Giang", 9000, "Tiep Thi");
        TiepThi tt3 = new TiepThi(60000, 0.08, "TT003", "Bui Thi Ha", 7500, "Tiep Thi");
        TiepThi tt4 = new TiepThi(100000, 0.15, "TT004", "Nguyen Van Hung", 10000, "Tiep Thi");
        TiepThi tt5 = new TiepThi(45000, 0.09, "TT005", "Tran Thi Lan", 8500, "Tiep Thi");

        // Add all to the list
        dsnv.add(tp1);
        dsnv.add(tp2);
        dsnv.add(tp3);
        dsnv.add(tp4);
        dsnv.add(tp5);
        dsnv.add(tt1);
        dsnv.add(tt2);
        dsnv.add(tt3);
        dsnv.add(tt4);
        dsnv.add(tt5);

        System.out.println("Da them 10 nhan vien mau vao danh sach!");
    }
}
