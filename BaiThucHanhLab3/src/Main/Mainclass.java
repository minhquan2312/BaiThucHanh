package Main;

import shapes.Hinhchunhat;
import shapes.Hinhtrutron;
import shapes.Hinhvuong;
import shapes.hinhTron;

public class Mainclass {
    public static void main(String[] args) {
        hinhTron ht = new hinhTron();
        hinhTron.xuatTen();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuvi();
        hinhTron.tinhDienTich();
        hinhTron.inChuvi();
        hinhTron.inDientich();

        Hinhtrutron htt = new Hinhtrutron();
        Hinhtrutron.xuatTen();
        Hinhtrutron.nhapChieucao();
        Hinhtrutron.tinhThetich();
        Hinhtrutron.inThetich();

        Hinhchunhat hcn = new Hinhchunhat();
        Hinhchunhat.xuatTen();
        Hinhchunhat.nhapChieudai();
        Hinhchunhat.nhapChieurong();
        Hinhchunhat.tinhChuvi();
        Hinhchunhat.tinhDienTich();
        Hinhchunhat.inChuvi();
        Hinhchunhat.inDientich();

        Hinhvuong hv = new Hinhvuong();
        Hinhvuong.xuatTen();
        Hinhvuong.nhapCanh();
        Hinhvuong.tinhChuvi();
        Hinhvuong.tinhDienTich();
        Hinhvuong.inChuvi();
        Hinhvuong.inDientich();
    }
    
}
