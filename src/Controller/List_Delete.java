package Controller;

import Module.*;

public class List_Delete {
    public static void xoaSinhVien() {
        System.out.println("\t\t---- Ban dang thao tac tren bang Sinh Vien ----");
        System.out.print("\t\t- Nhap vao ma sinh vien muon xoa: ");
        String maSinhVien = Data_Input.stringCheck();
        if (!Helper_Exception.xoaSinhVien(maSinhVien)) {
            System.err.println("\t\t-> Ma sinh vien vua nhap khong ton tai hoac da duoc hoc va co diem, khong the xoa.");
            return;
        }
        Database_Delete.xoaSinhVien(maSinhVien);
        System.out.println("\t\t=> Xoa thong tin sinh vien thanh cong.");
    }

    public static void xoaMonHoc() {
        System.out.println("\t\t---- Ban dang thao tac tren bang Mon Hoc ----");
        System.out.print("\t\t- Nhap vao ma mon hoc muon xoa: ");
        String maMonHoc = Data_Input.stringCheck();
        if (!Helper_Exception.xoaMonHoc(maMonHoc)) {
            System.err.println("\t\t-> Ma mon hoc vua nhap khong ton tai hoac da duoc hoc va co diem, khong the xoa.");
            return;
        }
        Database_Delete.xoaMonHoc(maMonHoc);
        System.out.println("\t\t=> Xoa thong tin mon hoc thanh cong.");
    }

    public static void xoaDiem() {
        System.out.println("\t\t---- Ban dang thao tac tren bang Diem ----");
        System.out.print("\t\t- Nhap vao ma sinh vien muon xoa: ");
        String maSinhVien = Data_Input.stringCheck();
        System.out.print("\t\t- Nhap vao ma mon hoc muon xoa: ");
        String maMonHoc = Data_Input.stringCheck();
        if (!Helper_Exception.xoaDiem(maSinhVien, maMonHoc)) {
            System.err.println("\t\t-> Ma sinh vien va ma mon hoc vua nhap khong ton tai.");
            return;
        }
        Database_Delete.xoaDiem(maSinhVien, maMonHoc);
        System.out.println("\t\t=> Xoa thong tin diem thanh cong.");
    }
}
