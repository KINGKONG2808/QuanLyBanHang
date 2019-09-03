package Controller;

import Module.*;
import java.util.ArrayList;

public class Data_Output {
    public static void xuatSinhVien() {
        ArrayList<SinhVien> listSinhVien = Database_GetListData.getListSinhVien();
        System.out.println("\n\t\t-----------------------------------------------------------------------------------------------------");
        System.out.printf("%s%60s%40s%n", "\t\t|", "THONG TIN SINH VIEN", "|");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------------");
        System.out.printf("%s%19s%20s%20s%20s%19s%s%n", "\t\t|", "Ma Sinh Vien |", "Ho Dem |", "Ten |", "Nam Sinh |", "Gioi Tinh", " |");
        System.out.println("\t\t-----------------------------------------------------------------------------------------------------");
        for (int i=0; i<listSinhVien.size(); i++) {
            System.out.printf("%s%19s%20s%20s%18d%s%19s%s%n",
                    "\t\t|",listSinhVien.get(i).getMaSinhVien()+" |",
                    listSinhVien.get(i).getHoDem()+" |",
                    listSinhVien.get(i).getTen()+" |",
                    listSinhVien.get(i).getNamSinh()," |",
                    listSinhVien.get(i).getGioiTinh(), " |");
        }
        System.out.println("\t\t-----------------------------------------------------------------------------------------------------\n");
    }

    public static void xuatMonHoc() {
        ArrayList<MonHoc> listMonHoc = Database_GetListData.getListMonHoc();
        System.out.println("\n\t\t-------------------------------------------------------------");
        System.out.printf("%s%38s%22s%n", "\t\t|", "THONG TIN MON HOC", "|");
        System.out.println("\t\t-------------------------------------------------------------");
        System.out.printf("%s%19s%20s%19s%s%n", "\t\t|", "Ma Mon Hoc |", "Ten Mon Hoc |", "He So", " |");
        System.out.println("\t\t-------------------------------------------------------------");
        for (int i=0; i<listMonHoc.size(); i++) {
            System.out.printf("%s%19s%20s%19d%s%n",
                    "\t\t|",listMonHoc.get(i).getMaMonHoc()+" |",
                    listMonHoc.get(i).getTenMonHoc()+" |",
                    listMonHoc.get(i).getHeSoMonHoc()," |");
        }
        System.out.println("\t\t-------------------------------------------------------------\n");
    }

    public static void xuatDiem() {
        ArrayList<Diem> listDiem = Database_GetListData.getListDiem();
        System.out.println("\n\t\t-------------------------------------------------------------");
        System.out.printf("%s%45s%15s%n", "\t\t|", "THONG TIN DIEM SO SINH VIEN", "|");
        System.out.println("\t\t-------------------------------------------------------------");
        System.out.printf("%s%19s%20s%21s%n", "\t\t|", "Ma Sinh Vien |", "Ma Mon Hoc |", "Diem So |");
        System.out.println("\t\t-------------------------------------------------------------");
        for (int i=0; i<listDiem.size(); i++) {
            System.out.printf("%s%19s%20s%19.1f%s%n",
                    "\t\t|",listDiem.get(i).getMaSinhVien()+" |",
                    listDiem.get(i).getMaMonHoc()+" |",
                    listDiem.get(i).getDiemSo(), " |");
        }
        System.out.println("\t\t-------------------------------------------------------------\n");
    }

    /*public static float diemTongKet(int i, int j, int k) {

    }*/

    public static void xuatDanhSach() {
        ArrayList<SinhVien> listSinhVien = Database_GetListData.getListSinhVien();
        ArrayList<MonHoc> listMonHoc = Database_GetListData.getListMonHoc();
        ArrayList<Diem> listDiem = Database_GetListData.getListDiem();
        int demHeSo = 0;
        float tongDiem = 0;
        System.out.println("\t\t--------------------------------------------------------------------------------");
        System.out.printf("%s%56s%23s%n", "\t\t|", "THONG TIN DANH SACH QUAN LY SINH VIEN", "|");
        System.out.println("\t\t--------------------------------------------------------------------------------");
        System.out.printf("%s%19s%20s%20s%20s%n", "\t\t|", "Ma Sinh Vien |", "Ho Va Ten |", "Ten Mon Hoc |", "Diem Mon Hoc |");
        System.out.println("\t\t--------------------------------------------------------------------------------");
        for (int i=0; i<listSinhVien.size(); i++) {
            int check = 0;
            for (int j=0; j<listDiem.size(); j++) {
                for (int k=0; k<listMonHoc.size(); k++) {
                    if(listDiem.get(j).getMaSinhVien().compareTo(listSinhVien.get(i).getMaSinhVien())==0 &&
                            listDiem.get(j).getMaMonHoc().compareTo(listMonHoc.get(k).getMaMonHoc())==0) {
                        System.out.printf("%s%19s%20s%20s%18.1f%s%n",
                                "\t\t|",listSinhVien.get(i).getMaSinhVien()+" |",
                                listSinhVien.get(i).getHoDem()+" "+listSinhVien.get(i).getTen()+" |",
                                listMonHoc.get(k).getTenMonHoc()+" |",
                                listDiem.get(j).getDiemSo(), " |");
                        tongDiem+=listDiem.get(j).getDiemSo()*listMonHoc.get(k).getHeSoMonHoc();
                        demHeSo+=listMonHoc.get(k).getHeSoMonHoc();
                        check++;
                    }
                }
            }
            if (check==0) continue;
            else {
                System.out.println("\t\t--------------------------------------------------------------------------------");
                System.out.printf("%s%47s%5.1f%27s%n", "\t\t|", "=====> Diem tong ket:", tongDiem/demHeSo, "|");
                System.out.println("\t\t--------------------------------------------------------------------------------");
            }
        }
    }
}
