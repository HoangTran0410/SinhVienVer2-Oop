package sinhvien;

import java.util.Scanner;

public class SinhVien {

    private String ho, ten, mssv, gioiTinh;
    private int namSinh;

    Scanner scan = new Scanner(System.in);

    public SinhVien() {
        ho = ten = mssv = gioiTinh = "";
        namSinh = 1999;
    }

    public SinhVien(String ms, String ho, String ten, String gt, int namSinh) {
        this.ho = ho;
        this.ten = ten;
        this.mssv = ms;
        this.gioiTinh = gt;
        this.namSinh = namSinh;
    }

    public SinhVien(SinhVien s) {
        this.ho = s.ho;
        this.ten = s.ten;
        this.mssv = s.mssv;
        this.namSinh = s.namSinh;
        this.gioiTinh = s.gioiTinh;
    }

    public void nhap() {
        System.out.print("Mssv: ");
        mssv = scan.nextLine();
        System.out.print("Ho: ");
        ho = scan.nextLine();
        System.out.print("Ten: ");
        ten = scan.nextLine();
        System.out.print("Gioi tinh (nam/nu): ");
        gioiTinh = scan.nextLine();
        System.out.print("Nam sinh: ");
        namSinh = scan.nextInt();
    }
    
    public void xuat() {
        System.out.println("Mssv: "+ mssv);
        System.out.println("Ho va ten:"+ ho + " " +ten);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Nam sinh: " + namSinh);
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamsinh() {
        return namSinh;
    }

    public void setNamsinh(int namsinh) {
        this.namSinh = namsinh;
    }
}
