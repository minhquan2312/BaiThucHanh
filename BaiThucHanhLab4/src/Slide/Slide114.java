package Slide;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Models.SinhVien;

public interface Slide114 {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        Map<String, SinhVien> svm = new HashMap<>();
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());
        sv.nhapSinhVien(svm, n, sc);
        sv.showSvLop(svm, sc);
        sv.showSvMSV(svm, sc);
    }
}