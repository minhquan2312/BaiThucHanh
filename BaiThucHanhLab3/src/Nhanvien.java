import java.util.Scanner;

public class Nhanvien {
    String  hoten;
    int maNV, tuoi, hesoluong, luong;
    final int luongcb = 1490000;

    public void nhaphesoluong()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so luong: "); hesoluong = sc.nextInt();
    sc.close();
    }
    
    public void tinhluong()
    {
        luong = hesoluong *luongcb;

    }

    public void inThongTinNV()
    {
        System.out.printf("\nNhan vien vua nhap co thong tin la:\nho ten: %s\ntuoi: %d \nmaNV: %d" , hoten, tuoi, maNV);
    }
}
    


