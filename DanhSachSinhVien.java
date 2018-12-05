package sinhvien;

import java.util.Arrays;
import java.util.Scanner;

public class DanhSachSinhVien {

    private SinhVien[] dssv;
    private static int n;

    Scanner scan = new Scanner(System.in);

    public DanhSachSinhVien() {
        n = 0;
        dssv = new SinhVien[0];
    }
    public DanhSachSinhVien(SinhVien[] ds) {
        dssv = ds.clone();
        n = dssv.length;
    }
    public DanhSachSinhVien(DanhSachSinhVien ds) {
        dssv = ds.dssv.clone();
    }
    
    public void add(SinhVien sv) {
        dssv = addTo(dssv, sv);
        n++;
    }
    public SinhVien[] addTo(SinhVien[] arr, SinhVien sv) {
        SinhVien[] result = Arrays.copyOf(arr, arr.length + 1);
        result[result.length - 1] = sv;
        return result;
    }
    
    public void delete(int index) {
        for (int i = index + 1; i < n; i++) {
            dssv[i - 1] = dssv[i];
        }
        n--;
    }
    public void delete_Ma(String ma) {
        int c, i;
        for (c = i = 0; i < n; i++) {
            if (!dssv[i].getMssv().equals(ma)) {
                dssv[c] = dssv[i];
                c++;
            }
        }
        n = c;
    }

    public SinhVien findMa(String ma) {
        for (int i = 0; i < n; i++) {
            if (dssv[i].getMssv().equals(ma)) {
                return dssv[i];
            }
        }
        return null;
    }
    public SinhVien[] findHo(String ho) {
        SinhVien[] result = new SinhVien[0];
        for (int i = 0; i < n; i++) {
            if (dssv[i].getHo().equals(ho)) {
                result = addTo(result, dssv[i]);
            }
        }
        return result;
    }
    public SinhVien[] findTen(String ten) {
        SinhVien[] result = new SinhVien[0];
        for (int i = 0; i < n; i++) {
            if (dssv[i].getTen().equals(ten)) {
                result = addTo(result, dssv[i]);
            }
        }
        return result;
    }
    public SinhVien[] findDrl(int drl) {
        SinhVien[] result = new SinhVien[0];
        for (int i = 0; i < n; i++) {
            if (dssv[i] instanceof SinhVienChinhQuy) {
                SinhVienChinhQuy sv = (SinhVienChinhQuy) dssv[i];
                if (sv.getDrl() == drl) {
                    result = addTo(result, dssv[i]);
                }
            }
        }
        return result;
    }
    public SinhVien[] findNamTotNghiep(int nam) {
        SinhVien[] result = new SinhVien[0];
        for (int i = 0; i < n; i++) {
            if (dssv[i] instanceof SinhVienLienThong) {
                SinhVienLienThong sv = (SinhVienLienThong) dssv[i];
                if (sv.getNamTotNghiepCaoDang() == nam) {
                    result = addTo(result, dssv[i]);
                }
            }
        }
        return result;
    }
    public SinhVien[] findNganhHocCu(String n_h_c) {
        SinhVien[] result = new SinhVien[0];
        for (int i = 0; i < n; i++) {
            if (dssv[i] instanceof SinhVienLienThong) {
                SinhVienLienThong sv = (SinhVienLienThong) dssv[i];
                if (sv.getNganhHocCu().equalsIgnoreCase(n_h_c)) {
                    result = addTo(result, dssv[i]);
                }
            }
        }
        return result;
    }

    public void themSinhVien() {
        System.out.print("Loai sinh vien muon them (chinhquy/lienthong): ");
        String l = scan.nextLine();
        if (l.equalsIgnoreCase("chinhquy")) {
            SinhVienChinhQuy sv = new SinhVienChinhQuy();
            sv.nhap();
            dssv = addTo(dssv, sv);
            n++;

        } else if (l.equalsIgnoreCase("lienthong")) {
            SinhVienLienThong sv = new SinhVienLienThong();
            sv.nhap();
            dssv = addTo(dssv, sv);
            n++;
        }
    }
    public void themNhieuSinhVien() {
        System.out.print("Nhap so luong sinh vien muon nhap: ");
        int len = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= len; i++) {
            System.out.println("=====================");
            System.out.println("Sinh Vien " + i + ":");
            themSinhVien();
        }
    }

    public void xuat() {
        for (int i = 0; i < n; i++) {
            System.out.println("");
            dssv[i].xuat();
        }
    }

    public int getLength() {
        return n;
    }
}
