import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a; int b;
        System.out.println ("Nhap a:"); 
        a = sc.nextInt();
        System.out.println ("Nhap b:"); 
        b = sc.nextInt();
        int tong = a+b;
        System.out.println("Tong:" +tong);
        int hieu = a-b;
        System.out.println("Hieu:" +hieu);
        int tich = a*b;
        System.out.println("Tich:" +tich);
        float thuong = a/b;
        System.out.println("Thuong:" +thuong);
        int phandu = a%b;
        System.out.println("phandu:" +phandu);
        
        System.out.println("Ket qua so sanh bang 2 so " + a + " va " + 
        b + " la " + (a == b) );
        System.out.println("Ket qua so sanh lon hon hoac bang 2 so " + a + " va " + 
        b + " la " + (a <= b) );
        System.out.println("Ket qua so sanh nho hon hoac bang 2 so " + a + " va " + 
        b + " la " + (a >= b) );
        System.out.println("Ket qua so sanh khong bang 2 so " + a + " va " + 
        b + " la " + (a != b) );
        System.out.println("Ket qua so sanh nho hon 2 so " + a + " va " + 
        b + " la " + (a < b) );
        System.out.println("Ket qua so sanh lon hon 2 so " + a + " va " + 
        b + " la " + (a > b)) ;


      


       



    }
}
