package shapes;

import java.util.Scanner;

public class Hinhtrutron extends hinhTron {
   public static float Chieucao;

   public Hinhtrutron(){
       ten = "Hinh Tru";
   }

   public static void nhapChieucao(){
      nhapBanKinh();

      System.out.println("Chieu cao =");
       Scanner sc = new Scanner(System.in);
       Chieucao = sc.nextFloat();
   }
   public static void tinhThetich(){
      tinhDienTich();
      Thetich =  Chieucao * Dientich;
   }
   
    }
    

    
    