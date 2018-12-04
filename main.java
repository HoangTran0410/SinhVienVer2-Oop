
package sinhvien;

public class main {

    public static void main(String[] args) {
        DanhSachSinhVien ds = new DanhSachSinhVien();
        ds.add(new SinhVienChinhQuy());
        System.out.println(ds.getLength());
    }
    
}
