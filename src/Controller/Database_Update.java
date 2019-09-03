package Controller;

import Module.*;

import java.sql.PreparedStatement;

public class Database_Update {
    public static boolean suaSinhVien(SinhVien sinhVien) {
        int result = 0;
        String sqlUpdateSV = "UPDATE SinhVien SET hoDem=?, ten=?, namSinh=?, gioiTinh=? WHERE maSinhVien=?";
        try {
            PreparedStatement ps = Database_Connect.getConnection().prepareStatement(sqlUpdateSV);
            ps.setString(1, sinhVien.getHoDem());
            ps.setString(2, sinhVien.getTen());
            ps.setInt(3, sinhVien.getNamSinh());
            ps.setString(4, sinhVien.getGioiTinh());
            ps.setString(5, sinhVien.getMaSinhVien());
            result = ps.executeUpdate();
        } catch (Exception e) {e.printStackTrace(); }
        return result>0;
    }

    public static boolean suaMonHoc(MonHoc monHoc) {
        int result = 0;
        String sqlUpdateMH = "UPDATE MonHoc SET tenMonHoc=?, heSoMonHoc=? WHERE maMonHoc=?";
        try {
            PreparedStatement ps = Database_Connect.getConnection().prepareStatement(sqlUpdateMH);
            ps.setString(1, monHoc.getTenMonHoc());
            ps.setInt(2, monHoc.getHeSoMonHoc());
            ps.setString(3, monHoc.getMaMonHoc());
            result = ps.executeUpdate();
        } catch (Exception e) {e.printStackTrace(); }
        return result>0;
    }

    public static boolean suaDiem(Diem diem){
        int result = 0;
        String sqlUpdateD = "UPDATE Diem SET diemSo=? WHERE maSinhVien=? AND maMonHoc=?";
        try {
            PreparedStatement ps = Database_Connect.getConnection().prepareStatement(sqlUpdateD);
            ps.setFloat(1, diem.getDiemSo());
            ps.setString(2, diem.getMaSinhVien());
            ps.setString(3, diem.getMaMonHoc());
            result = ps.executeUpdate();
        } catch (Exception e) { e.printStackTrace(); }
        return result>0;
    }
}
