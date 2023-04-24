package shapes;

import java.util.Scanner;


public class hinhTron extends Hinhhoc {
    
    public static float banKinh;

    public hinhTron(){
        ten = "Hinh Tron";
    }

    public void nhapBanKinh(){
        System.out.println("Ban kinh =");
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();
    }
    public void tinhChuvi(){
        Chuvi = 2* PI * banKinh;
    }
    public void tinhDienTich(){
        Dientich = PI * banKinh * banKinh ;
    }

	public void inThongso() {
	}
}