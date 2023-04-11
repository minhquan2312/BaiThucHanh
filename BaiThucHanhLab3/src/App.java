import java.util.Scanner;

import Nhanvien.Nhanvien;
import Student.Sinhvien;
import shapes.Hinhtrutron;
import shapes.hinhTron;

public class App {
    public static void main(String[] args) throws Exception {
        hinhTron ht = new hinhTron();
        Sinhvien sd = new Sinhvien();
        Hinhtrutron htt = new Hinhtrutron();
        Nhanvien nv = new Nhanvien();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("1. Hinh tron\n2. Student\n3. Hinh tru tron\n4.Nhan vien \nLua chon cua ban: "); int luachon = sc.nextInt();
        switch(luachon){
            case 1:
                ht.nhapBanKinh();
                ht.tinhChuvi();
                ht.tinhDienTich();
                ht.inThongso();
                break;
            case 2:
                sd.nhapThongTinSv();
                sd.tinhTuoi();
                sd.inThongTinSv();
                break;
            case 3:
                htt.nhapBanKinh();
                htt.nhapChieucao();
                htt.tinhChuvi();
                htt.tinhDienTich();
                htt.tinhThetich();
                htt.inThongso();
                break;
            case 4:
                nv.nhaphesoluong();
                nv.tinhluong();
                nv.inThongTinNV();
                break;
            default:
                System.out.println("Vui long lua chon dung!");
        }
    sc.close();
    }
}