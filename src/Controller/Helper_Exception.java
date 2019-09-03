package Controller;

import Module.*;

import java.util.ArrayList;
import java.util.Date;

public class Helper_Exception {
    public static boolean kiemTraNam(int nam) {
        Date x = new Date();
        return 1000<nam && nam<=x.getYear()+1900;
    }

    public static boolean kiemTraKyTuSo(String check) {
        for (int i=0; i<check.length(); i++) {
            if (check.charAt(i)>=0 && check.charAt(i)<=9) return true;
        }
        return false;
    }

    public static boolean kiemTraKyTuDacBiet(String check) {
        String s = "~`!@#$%^&*()_+-={}[]|:;'<,>.?";
        for (int i=0; i<check.length(); i++) {
            if (s.indexOf(check.charAt(i))!=-1) return true;
        }
        return false;
    }

    public static boolean kiemTraGioiTinh(String gioiTinh) {
        return gioiTinh.compareToIgnoreCase("nam")==0 || gioiTinh.compareToIgnoreCase("nu")==0;
    }

    public static boolean themSinhVien(SinhVien sinhVien) {
        ArrayList<SinhVien> listSinhVien = Database_GetListData.getListSinhVien();
        for (int i=0; i<listSinhVien.size(); i++) { if (sinhVien.getMaSinhVien().compareTo(listSinhVien.get(i).getMaSinhVien())==0) return false; }
        return true;
    }

    public static boolean themMonHoc(MonHoc monHoc) {
        ArrayList<MonHoc> listMonHoc = Database_GetListData.getListMonHoc();
        for (int i=0; i<listMonHoc.size(); i++) { if (monHoc.getMaMonHoc().compareTo(listMonHoc.get(i).getMaMonHoc())==0) return false; }
        return true;
    }

    public static boolean themDiem(Diem diem) {
        ArrayList<SinhVien> listSinhVien = Database_GetListData.getListSinhVien();
        ArrayList<MonHoc> listMonHoc = Database_GetListData.getListMonHoc();
        ArrayList<Diem> listDiem = Database_GetListData.getListDiem();
        //kiem tra trong bang diem da co ma sv va ma mh nhap vao chua
        for (int i=0; i<listDiem.size(); i++) { if (diem.getMaSinhVien().compareTo(listDiem.get(i).getMaSinhVien())==0 && diem.getMaMonHoc().compareTo(listDiem.get(i).getMaMonHoc())==0) return false; }
        //kiem tra ma sinh vien nhap vao co trong bang sinh vien hay khong
        int demSinhVien = 0;
        for (int j=0; j<listSinhVien.size(); j++) { if (diem.getMaSinhVien().compareTo(listSinhVien.get(j).getMaSinhVien())==0) demSinhVien++; }
        if (demSinhVien==0) { return false; }
        //kiem tra ma mon hoc nhap vao co trong bang mon hoc hay khong
        int demMonHoc = 0;
        for (int k=0; k<listMonHoc.size(); k++) { if (diem.getMaMonHoc().compareTo(listMonHoc.get(k).getMaMonHoc())==0) demMonHoc++; }
        if (demMonHoc==0) { return false; }
        return true;
    }

    public static boolean suaSinhVien(SinhVien sinhVien) {
        ArrayList<SinhVien> listSinhVien = Database_GetListData.getListSinhVien();
        int demSinhVien = 0;
        for (int i=0; i<listSinhVien.size(); i++) { if (sinhVien.getMaSinhVien().compareTo(listSinhVien.get(i).getMaSinhVien())==0) demSinhVien++; }
        return demSinhVien>0;
    }

    public static boolean suaMonHoc(MonHoc monHoc) {
        ArrayList<MonHoc> listMonHoc = Database_GetListData.getListMonHoc();
        int demMonHoc = 0;
        for (int i=0; i<listMonHoc.size(); i++) { if (monHoc.getMaMonHoc().compareTo(listMonHoc.get(i).getMaMonHoc())==0) demMonHoc++; }
        return demMonHoc>0;
    }

    public static boolean suaDiem(Diem diem) {
        ArrayList<Diem> listDiem = Database_GetListData.getListDiem();
        int demDiem = 0;
        for (int i=0; i<listDiem.size(); i++) { if (diem.getMaSinhVien().compareTo(listDiem.get(i).getMaSinhVien())==0 && diem.getMaMonHoc().compareTo(listDiem.get(i).getMaMonHoc())==0) demDiem++; }
        return demDiem>0;
    }

    public static boolean xoaSinhVien(String maSinhVien) {
        ArrayList<SinhVien> listSinhVien = Database_GetListData.getListSinhVien();
        ArrayList<Diem> listDiem = Database_GetListData.getListDiem();
        int demSinhVien = 0, demDiem = 0;
        for (int i=0; i<listDiem.size(); i++) { if (maSinhVien.compareTo(listDiem.get(i).getMaSinhVien())==0)   demDiem++; }
        for (int j=0; j<listSinhVien.size(); j++) { if (maSinhVien.compareTo(listSinhVien.get(j).getMaSinhVien())==0) demSinhVien++; }
        if (demSinhVien==0) return false;
        if (demSinhVien!=0 && demDiem!=0) return false;
        return true;
    }

    public static boolean xoaMonHoc(String maMonHoc) {
        ArrayList<MonHoc> listMonHoc = Database_GetListData.getListMonHoc();
        ArrayList<Diem> listDiem = Database_GetListData.getListDiem();
        int demMonHoc = 0, demDiem = 0;
        for (int i=0; i<listDiem.size(); i++) { if (maMonHoc.compareTo(listDiem.get(i).getMaMonHoc())==0)   demDiem++; }
        for (int j=0; j<listMonHoc.size(); j++) { if (maMonHoc.compareTo(listMonHoc.get(j).getMaMonHoc())==0) demMonHoc++; }
        if (demMonHoc==0) return false;
        if (demMonHoc!=0 && demDiem!=0) return false;
        return true;
    }

    public static boolean xoaDiem(String maSinhVien, String maMonHoc) {
        ArrayList<Diem> listDiem = Database_GetListData.getListDiem();
        int demDiem = 0;
        for (int i=0; i<listDiem.size(); i++) { if (maSinhVien.compareTo(listDiem.get(i).getMaSinhVien())==0 && maMonHoc.compareTo(listDiem.get(i).getMaMonHoc())==0) demDiem++; }
        return demDiem>0;
    }
}
