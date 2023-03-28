import java.util.Scanner;

public class Hinhtrutron {
    final float Pi = 3.14f;
    float r, h, cv, dt, tt;
    
    public void nhapBanKinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r: "); r = sc.nextFloat();
    sc.close();
    }
    public void nhapChieucao()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao h: "); h = sc.nextFloat();
    sc.close();
    }


     public void tinhChuvi()
     {
        cv= 2*r*h*Pi;
     }
     

     public void tinhDientich()
     {
        dt = 2 * r * r * Pi + 2 * r * Pi * h ;
     }


     public void tinhThetich()
     {
        tt= r*r*h*Pi;
     }

     public void inThongso()
     {
        System.out.printf("Chu vi cua hinh tru tron co r = %f la: %f",r,cv);
        System.out.printf("\nDien tich cua hinh tru tron co r = %f la: %f",r,dt);
        System.out.printf("\nDien tich cua hinh tru tron co r = %f la: %f",r,tt);
        
     }
    }
    

    
    