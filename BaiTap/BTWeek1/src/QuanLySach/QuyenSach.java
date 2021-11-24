package QuanLySach;

public class QuyenSach {
    private String tenSach;
    private double giaBan;
    private int namSanXuat;
    private TacGia tacGia;

    public QuyenSach(String tenSach, double giaBan, int namSanXuat, TacGia tacGia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namSanXuat = namSanXuat;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public void InTenSach(){
        System.out.println(this.tenSach);
    }

    public boolean SoSanhNamSAnXuat(QuyenSach sach){
        if (this.namSanXuat == sach.getNamSanXuat()){
            return true;
        }else {
         return false;
        }
    }

    public double GiaSauKhiGiamGia(double x){
        return this.giaBan*(1-x/100);
    }

    @Override
    public String toString() {
        return "QuyenSach{" + tenSach  +
                ", giaBan=" + giaBan +
                ", namSanXuat=" + namSanXuat +
                ", tacGia=" + getTacGia() +
                '}';
    }
}
