package Main;

import shapes.Hinhchunhat;
import shapes.Hinhtrutron;
import shapes.Hinhvuong;
import shapes.hinhTron;

public class Mainclass {
    public static void main(String[] args) {
        hinhTron ht = new hinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuvi();
        ht.tinhDienTich();
        ht.inChuvi();
        ht.inDientich();

        Hinhtrutron htt = new Hinhtrutron();
        htt.xuatTen();
        htt.nhapChieucao();
        htt.tinhThetich();
        htt.inThetich();

        Hinhchunhat hcn = new Hinhchunhat();
        hcn.xuatTen();
        hcn.nhapChieudai();
        hcn.nhapChieurong();
        hcn.tinhChuvi();
        hcn.tinhDienTich();
        hcn.inChuvi();
        hcn.inDientich();

        Hinhvuong hv = new Hinhvuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuvi();
        hv.tinhDienTich();
        hv.inChuvi();
        hv.inDientich();
    }
    
}