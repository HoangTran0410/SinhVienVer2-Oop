
package sinhvien;

public class SinhVienLienThong extends SinhVien {
    private String nganhHocCu;
    private int namTotNghiepCaoDang;
    
    public SinhVienLienThong() {
        super();
        nganhHocCu = "";
        namTotNghiepCaoDang = 1999;
    }
    public SinhVienLienThong(SinhVienLienThong sv) {
        super(sv);
        nganhHocCu = sv.nganhHocCu;
        namTotNghiepCaoDang = sv.namTotNghiepCaoDang;
    }
    public SinhVienLienThong(String ms, String ho, String ten, 
            String gt, int namSinh, String n_h_c, int ntn) {
        super(ms, ho, ten, gt, namSinh);
        nganhHocCu = n_h_c;        
        namTotNghiepCaoDang = ntn;
    }
    
    @Override
    public void nhap() {
        super.nhap();
        scan.nextLine();
        System.out.print("Nganh hoc cu: ");
        nganhHocCu = scan.nextLine();
        System.out.print("Nam tot nghiep cao dang: ");
        namTotNghiepCaoDang = scan.nextInt();
    }
    
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Nganh hoc cu: " + nganhHocCu);
        System.out.println("Nam tot nghiep cao dang: " + namTotNghiepCaoDang);
    }

    public String getNganhHocCu() {
        return nganhHocCu;
    }

    public void setNganhHocCu(String nganhHocCu) {
        this.nganhHocCu = nganhHocCu;
    }

    public int getNamTotNghiepCaoDang() {
        return namTotNghiepCaoDang;
    }

    public void setNamTotNghiepCaoDang(int namTotNghiepCaoDang) {
        this.namTotNghiepCaoDang = namTotNghiepCaoDang;
    }
}
