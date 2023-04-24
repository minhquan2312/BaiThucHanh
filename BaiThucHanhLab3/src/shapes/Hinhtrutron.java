package shapes;

import java.util.Scanner;

public class Hinhtrutron extends hinhTron {
   public static float Chieucao;

   public Hinhtrutron(){
       ten = "Hinh Tru";
   }

   public void nhapChieucao(){
      nhapBanKinh();

      System.out.println("Chieu cao =");
       Scanner sc = new Scanner(System.in);
       Chieucao = sc.nextFloat();
   }
   public void tinhThetich(){
      tinhDienTich();
      Thetich =  Chieucao * Dientich;
   }
   
    }



