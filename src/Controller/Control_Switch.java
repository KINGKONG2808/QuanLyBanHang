package Controller;

public class Control_Switch {
    static boolean endLoop = true;
    public static void mainMenu(int luaChonMenu) {
        switch (luaChonMenu) {
            case 1:
                endLoop = true;
                while (endLoop) {
                    Control_ListMenu.hienThiDatabaseMenuLv1();
                    int luaChonHienThi = Data_Input.choose(4);
                    hienThiDatabaseMenuLv1(luaChonHienThi);
                } break;
            case 2:
                endLoop = true;
                while (endLoop) {
                    Control_ListMenu.capNhatDatabaseMenuLv1();
                    int luaChonCapNhat = Data_Input.choose(3);
                    capNhatDatabaseMenuLv1(luaChonCapNhat);
                } break;
            case 3:
                endLoop = true;
                while (endLoop) {
                    Control_ListMenu.timKiemDatabaseLv1();
                    int luaChonTimKiem = Data_Input.choose(2);
                    timKiemDatabaseLv1(luaChonTimKiem);
                } break;
            case 0:
                Control_ListMenu.thoatChuongTrinhLv1();
                System.exit(0);
        }
    }

    public static void hienThiDatabaseMenuLv1(int luaChonHienThi) {
        switch (luaChonHienThi) {
            case 1: Data_Output.xuatSinhVien(); break;
            case 2: Data_Output.xuatMonHoc(); break;
            case 3: Data_Output.xuatDiem(); break;
            case 4: Data_Output.xuatDanhSach(); break;
            case 0: endLoop = false;
        }
    }

    public static void capNhatDatabaseMenuLv1(int luaChonCapNhat) {
        switch (luaChonCapNhat) {
            case 1:
                endLoop = true;
                while (endLoop) {
                    Control_ListMenu.themDatabaseMenuLv2();
                    int luaChonThem = Data_Input.choose(3);
                    themDatabaseMenuLv2(luaChonThem);
                } break;
            case 2:
                endLoop = true;
                while (endLoop) {
                    Control_ListMenu.suaDatabaseMenuLv2();
                    int luaChonSua = Data_Input.choose(3);
                    suaDatabaseMenuLv2(luaChonSua);
                } break;
            case 3:
                endLoop = true;
                while (endLoop) {
                    Control_ListMenu.xoaDatabaseMenuLv2();
                    int luaChonXoa = Data_Input.choose(3);
                    xoaDatabaseMenuLv2(luaChonXoa);
                } break;
            case 0: endLoop = false;
        }
    }

    public static void themDatabaseMenuLv2(int luaChonThem) {
        switch (luaChonThem) {
            case 1: List_Add.themSinhVien(); break;
            case 2: List_Add.themMonHoc(); break;
            case 3: List_Add.themDiem(); break;
            case 0: endLoop = false;
        }
    }

    public static void suaDatabaseMenuLv2(int luaChonSua) {
        switch (luaChonSua) {
            case 1: List_Update.suaSinhVien(); break;
            case 2: List_Update.suaMonHoc(); break;
            case 3: List_Update.suaDiem(); break;
            case 0: endLoop = false;
        }
    }

    public static void xoaDatabaseMenuLv2(int luaChonXoa) {
        switch (luaChonXoa) {
            case 1: List_Delete.xoaSinhVien(); break;
            case 2: List_Delete.xoaMonHoc(); break;
            case 3: List_Delete.xoaDiem(); break;
            case 0: endLoop = false;
        }
    }

    public static void timKiemDatabaseLv1(int luaChonTimKiem) {
        switch (luaChonTimKiem) {
            case 1: List_Finder.timKiem_MaSinhVien(); break;
            case 2: List_Finder.timKiem_MaMonHoc(); break;
            case 0: endLoop = false;
        }
    }
}
