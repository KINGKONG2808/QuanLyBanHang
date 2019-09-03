package Controller;

import Module.*;
import java.util.ArrayList;
import java.util.Scanner;

public class List_Finder {
    static Scanner input = new Scanner(System.in);

    public static void timKiem_MaSinhVien() {
        ArrayList<SinhVien> listSinhVien = Database_GetListData.getListSinhVien();
        ArrayList<MonHoc> listMonHoc = Database_GetListData.getListMonHoc();
        ArrayList<Diem> listDiem = Database_GetListData.getListDiem();
        System.out.print("\t\t- Nhap vao ma sinh vien can tim: ");
        String maSinhVien = input.nextLine();
        int dem = 0;
        for (int i=0; i<listSinhVien.size(); i++) {
            if (listSinhVien.get(i).getMaSinhVien().compareTo(maSinhVien)==0) dem++;
        }
        if (dem!=0) {
            int demHeSo = 0;
            float tongDiem = 0;
            System.out.println("\n\t\t--------------------------------------------------------------------------------");
            System.out.printf("%s%56s%23s%n", "\t\t|", "TIM KIEM THONG TIN SINH VIEN", "|");
            System.out.println("\t\t--------------------------------------------------------------------------------");
            System.out.printf("%s%19s%20s%20s%20s%n", "\t\t|", "Ma Sinh Vien |", "Ho Va Ten |", "Ten Mon Hoc |", "Diem Mon Hoc |");
            System.out.println("\t\t--------------------------------------------------------------------------------");
            for (int i=0; i<listSinhVien.size(); i++) {
                if (listSinhVien.get(i).getMaSinhVien().compareTo(maSinhVien)==0) {
                    for (int j=0; j<listDiem.size(); j++) {
                        for (int k=0; k<listMonHoc.size(); k++) {
                            if(listDiem.get(j).getMaSinhVien().compareTo(listSinhVien.get(i).getMaSinhVien())==0 &&
                                    listDiem.get(j).getMaMonHoc().compareTo(listMonHoc.get(k).getMaMonHoc())==0) {
                                System.out.printf("%s%19s%20s%20s%18.1f%s%n",
                                        "\t\t|",listSinhVien.get(i).getMaSinhVien()+" |",
                                        listSinhVien.get(i).getHoDem()+" "+listSinhVien.get(i).getTen()+" |",
                                        listMonHoc.get(k).getTenMonHoc()+" |",
                                        listDiem.get(j).getDiemSo()," |");
                                tongDiem+=listDiem.get(j).getDiemSo()*listMonHoc.get(k).getHeSoMonHoc();
                                demHeSo+=listMonHoc.get(k).getHeSoMonHoc();
                            }
                        }
                    }
                    System.out.println("\t\t--------------------------------------------------------------------------------");
                    System.out.printf("%s%47s%5.1f%27s%n", "\t\t|", "=====> Diem tong ket:", tongDiem/demHeSo, "|");
                    System.out.println("\t\t--------------------------------------------------------------------------------");
                }
            }
        } else {
            System.err.println("\t\t=> Ma sinh vien vua nhap khong ton tai. Dung tim kiem...");
            return;
        }
    }

    public static void timKiem_MaMonHoc() {
        ArrayList<SinhVien> listSinhVien = Database_GetListData.getListSinhVien();
        ArrayList<MonHoc> listMonHoc = Database_GetListData.getListMonHoc();
        ArrayList<Diem> listDiem = Database_GetListData.getListDiem();
        System.out.print("\t\t- Nhap vao ma mon hoc can tim: ");
        String maMonHoc = input.nextLine();
        int dem = 0;
        for (int i=0; i<listMonHoc.size(); i++) {
            if (listMonHoc.get(i).getMaMonHoc().compareTo(maMonHoc)==0) dem++;
        }
        if (dem!=0) {
            System.out.println("\n\t\t--------------------------------------------------------------------------------");
            System.out.printf("%s%56s%23s%n", "\t\t|", "TIM KIEM THONG TIN SINH VIEN", "|");
            System.out.println("\t\t--------------------------------------------------------------------------------");
            System.out.printf("%s%19s%20s%20s%20s%n", "\t\t|", "Ma Sinh Vien |", "Ho Va Ten |", "Ten Mon Hoc |", "Diem Mon Hoc |");
            System.out.println("\t\t--------------------------------------------------------------------------------");
            for (int i=0; i<listSinhVien.size(); i++) {
                for (int j=0; j<listDiem.size(); j++) {
                    for (int k=0; k<listMonHoc.size(); k++) {
                        if(listMonHoc.get(k).getMaMonHoc().compareTo(maMonHoc)==0 &&
                                listDiem.get(j).getMaSinhVien().compareTo(listSinhVien.get(i).getMaSinhVien())==0 &&
                                listDiem.get(j).getMaMonHoc().compareTo(listMonHoc.get(k).getMaMonHoc())==0) {
                            System.out.printf("%s%19s%20s%20s%18.1f%s%n",
                                    "\t\t|",listSinhVien.get(i).getMaSinhVien()+" |",
                                    listSinhVien.get(i).getHoDem()+" "+listSinhVien.get(i).getTen()+" |",
                                    listMonHoc.get(k).getTenMonHoc()+" |",
                                    listDiem.get(j).getDiemSo()," |");
                        }
                    }
                }
            }
            System.out.println("\t\t--------------------------------------------------------------------------------");
        } else {
            System.err.println("\t\t=> Ma mon hoc vua nhap khong ton tai. Dung tim kiem...");
            return;
        }
    }
}
