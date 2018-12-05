
package sinhvien;

public class main {

    public static void main(String[] args) {
        DanhSachSinhVien ds = new DanhSachSinhVien();
        SinhVienChinhQuy svcq = new SinhVienChinhQuy("1", "tran", "hoang"
            ,"nam", 1999, 90);
        SinhVienChinhQuy svcq2 = new SinhVienChinhQuy("2", "phan", "hoang"
            ,"nam", 1999, 89);
        SinhVienLienThong svlt = new SinhVienLienThong("2", "tran",
            "hien", "nu", 2000, "Cntt", 2017);
        SinhVienLienThong svlt2 = new SinhVienLienThong("3", "pham",
            "hien", "nu", 2000, "Cntt", 2017);
        ds.add(svcq);
        ds.add(svcq2);
        ds.add(svlt);
        ds.add(svlt2);
        System.out.println("Danh sach sinh vien: ");
        ds.xuat();
        
        DanhSachSinhVien ds2 = 
                new DanhSachSinhVien(ds.findDrl(89));
        System.out.println("\nDanh sach sau khi xoa sinh vien ma '1':");
        ds2.xuat();
    }
}
