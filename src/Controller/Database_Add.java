package Controller;

import Module.*;

import java.sql.PreparedStatement;

public class Database_Add {
    public static boolean themSinhVien(SinhVien sinhVien) {
        String sqlAdd = "INSERT INTO SinhVien(maSinhVien, hoDem, ten, namSinh, gioiTinh) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = Database_Connect.getConnection().prepareStatement(sqlAdd);
            ps.setString(1, sinhVien.getMaSinhVien());
            ps.setString(2, sinhVien.getHoDem());
            ps.setString(3, sinhVien.getTen());
            ps.setInt(4, sinhVien.getNamSinh());
            ps.setString(5, sinhVien.getGioiTinh());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean themMonHoc(MonHoc monHoc) {
        String sqlAdd = "INSERT INTO MonHoc(maMonHoc, tenMonHoc, heSoMonHoc) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = Database_Connect.getConnection().prepareStatement(sqlAdd);
            ps.setString(1, monHoc.getMaMonHoc());
            ps.setString(2, monHoc.getTenMonHoc());
            ps.setInt(3, monHoc.getHeSoMonHoc());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean themDiem(Diem diem) {
        String sqlAdd = "INSERT INTO Diem(maSinhVien, maMonHoc, diemSo) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = Database_Connect.getConnection().prepareStatement(sqlAdd);
            ps.setString(1, diem.getMaSinhVien());
            ps.setString(2, diem.getMaMonHoc());
            ps.setFloat(3, diem.getDiemSo());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
