
package sinhvien;

public class SinhVienChinhQuy extends SinhVien {
    
    private int drl;

    public SinhVienChinhQuy() {
        super();
        drl = 0;
    }
    public SinhVienChinhQuy(SinhVienChinhQuy sv) {
        super(sv);
        drl = sv.drl;
    }
    
    public SinhVienChinhQuy(String ms, String ho, 
            String ten, String gt, int namSinh, int drl) {
        super(ms, ho, ten, gt, namSinh);
        this.drl = drl;
    }
    
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Diem ren luyen: ");
        drl = scan.nextInt();
    }
    
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Diem ren luyen: "+drl);
    }

    public int getDrl() {
        return drl;
    }

    public void setDrl(int drl) {
        this.drl = drl;
    }
}
