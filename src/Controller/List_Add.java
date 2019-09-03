package Controller;

import Module.*;

import java.util.ArrayList;

public class List_Add {
    public static void themSinhVien() {
        SinhVien sinhVien = Data_Input.nhapSinhVien();
        if (!Helper_Exception.themSinhVien(sinhVien)) {
            System.err.println("\t\t-> Ma sinh vien vua nhap da ton tai, khong the them.");
            return;
        }
        Database_Add.themSinhVien(sinhVien);
        System.out.println("\t\t=> Them sinh vien thanh cong.");
    }

    public static void themMonHoc() {
        MonHoc monHoc = Data_Input.nhapMonHoc();
        if (!Helper_Exception.themMonHoc(monHoc)) {
            System.err.println("\t\t-> Ma mon hoc vua nhap da ton tai, khong the them.");
            return;
        }
        Database_Add.themMonHoc(monHoc);
        System.out.println("\t\t=> Them mon hoc thanh cong.");
    }

    public static void themDiem() {
        Diem diem = Data_Input.nhapDiem();
        if (!Helper_Exception.themDiem(diem)) {
            System.err.println("\t\t-> Thong tin diem vua nhap da ton tai, khong the them.");
            return;
        }
        Database_Add.themDiem(diem);
        System.out.println("\t\t=> Them diem thanh cong.");
    }
}
