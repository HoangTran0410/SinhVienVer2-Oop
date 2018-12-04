
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
    
    public void add(SinhVienChinhQuy sv) {
        dssv = Arrays.copyOf(dssv, n+1);
        dssv[n] = new SinhVienChinhQuy(sv);
        n++;
    }
    public void add(SinhVienLienThong sv) {
        dssv = Arrays.copyOf(dssv, n+1);
        dssv[n] = new SinhVienLienThong(sv);
        n++;
    }
    
    public void delete(int index) {
        for (int i = index+1; i < n; i++) {
            dssv[i-1] = dssv[i];
        }
        n--;
    }
    public void delete(String ma) {
        int c, i;
        for (c = i = 0; i < n; i++) {
            if (!dssv[i].getMssv().equals(ma)) {
                dssv[c] = dssv[i];
                c++;
            }
        }
        n = c;
    }
    
    public int indexOf_Ma(String ma) {
        for(int i = 0; i < n; i++) {
            if(dssv[i].getMssv().equals(ma)) return i;
        }
        return -1;
    }
    public SinhVien[] findHo(String ho) {
        SinhVien[] result = new SinhVien[0];
        for(int i = 0; i < n; i++) {
            if(dssv[i].getHo().equals(ho)) {
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = dssv[i];
            }
        }
        return result;
    }
    public SinhVien[] findTen(String ten) {
        SinhVien[] result = new SinhVien[0];
        for(int i = 0; i < n; i++) {
            if(dssv[i].getTen().equals(ten)) {
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = dssv[i];
            }
        }
        return result;
    }
    public SinhVien[] findDrl(int drl) {
        SinhVien[] result = new SinhVien[0];
        for(int i = 0; i < n; i++) {
            if(dssv[i] instanceof SinhVienChinhQuy) {
                SinhVienChinhQuy sv = (SinhVienChinhQuy)dssv[i];
                if(sv.getDrl() == drl) {
                    result = Arrays.copyOf(result, result.length+1);
                    result[result.length-1] = sv;
                }
            }
        }
        return result;
    }
    public SinhVien[] findNamTotNghiep(int nam) {
        SinhVien[] result = new SinhVien[0];
        for(int i = 0; i < n; i++) {
            if(dssv[i] instanceof SinhVienLienThong) {
                SinhVienLienThong sv = (SinhVienLienThong)dssv[i];
                if(sv.getNamTotNghiepCaoDang()== nam) {
                    result = Arrays.copyOf(result, result.length+1);
                    result[result.length-1] = sv;
                }
            }
        }
        return result;
    }
    public SinhVien[] findNganhHocCu(String n_h_c) {
        SinhVien[] result = new SinhVien[0];
        for(int i = 0; i < n; i++) {
            if(dssv[i] instanceof SinhVienLienThong) {
                SinhVienLienThong sv = (SinhVienLienThong)dssv[i];
                if(sv.getNganhHocCu().equalsIgnoreCase(n_h_c)) {
                    result = Arrays.copyOf(result, result.length+1);
                    result[result.length-1] = sv;
                }
            }
        }
        return result;
    }
    
    public void themSinhVien() {
        System.out.println("Loai sinh vien muon them (chinhquy/lienthong): ");
        String l = scan.nextLine();
        if(l.equalsIgnoreCase("chinhquy")) {
            SinhVienChinhQuy sv = new SinhVienChinhQuy();
            sv.nhap();
            add(sv);
            
        } else if(l.equalsIgnoreCase("lienthong")) {
            SinhVienChinhQuy sv = new SinhVienChinhQuy();
            sv.nhap();
            add(sv);
        }
    }
    public void xoaSinhVien() {
        
    }
    
    public int getLength() {
        return n;
    }
}
