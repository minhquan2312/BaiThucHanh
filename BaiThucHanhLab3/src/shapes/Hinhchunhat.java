package shapes;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc{
    public static float dai;
    public static float rong;

    public Hinhchunhat(){
        ten = "Hinh Chu Nhat";
    }

    public void nhapChieudai(){
        System.out.println("Chieu dai  =");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }
    public void nhapChieurong(){
        System.out.println("Chieu rong  =");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }
    public void tinhChuvi(){
        Chuvi = 2* ( dai + rong);
    }
    public void tinhDienTich(){
        Dientich = dai * rong ;
    }
}