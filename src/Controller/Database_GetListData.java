package Controller;

import Module.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Database_GetListData {
    public static ArrayList<SinhVien> getListSinhVien() {
        ArrayList<SinhVien> listSinhVien = new ArrayList<SinhVien>();
        String sqlSinhVien = "SELECT * FROM SinhVien";
        try {
            PreparedStatement s = Database_Connect.getConnection().prepareStatement(sqlSinhVien);
            ResultSet rs = s.executeQuery();
            while(rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSinhVien(rs.getString(1));
                sv.setHoDem(rs.getString(2));
                sv.setTen(rs.getString(3));
                sv.setNamSinh(rs.getInt(4));
                sv.setGioiTinh(rs.getString(5));
                listSinhVien.add(sv);
            }
        } catch (Exception e) { e.printStackTrace(); }
        return listSinhVien;
    }

    public static ArrayList<MonHoc> getListMonHoc() {
        ArrayList<MonHoc> listMonHoc = new ArrayList<MonHoc>();
        String sqlMonHoc = "SELECT * FROM MonHoc";
        try {
            PreparedStatement s = Database_Connect.getConnection().prepareStatement(sqlMonHoc);
            ResultSet rs = s.executeQuery();
            while(rs.next()) {
                MonHoc mh = new MonHoc();
                mh.setMaMonHoc(rs.getString(1));
                mh.setTenMonHoc(rs.getString(2));
                mh.setHeSoMonHoc(rs.getInt(3));
                listMonHoc.add(mh);
            }
        } catch (Exception e) { e.printStackTrace(); }
        return listMonHoc;
    }

    public static ArrayList<Diem> getListDiem() {
        ArrayList<Diem> listDiem = new ArrayList<Diem>();
        String sqlDiem = "SELECT * FROM Diem";
        try {
            PreparedStatement s = Database_Connect.getConnection().prepareStatement(sqlDiem);
            ResultSet rs = s.executeQuery();
            while(rs.next()) {
                Diem d = new Diem();
                d.setMaSinhVien(rs.getString(1));
                d.setMaMonHoc(rs.getString(2));
                d.setDiemSo(rs.getFloat(3));
                listDiem.add(d);
            }
        } catch (Exception e) { e.printStackTrace(); }
        return listDiem;
    }
}
