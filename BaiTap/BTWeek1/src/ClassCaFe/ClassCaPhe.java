package ClassCaFe;

public class ClassCaPhe {
    private String tenCaPhe;
    private double giaTien1kg;
    private double khoiLuong;

    public ClassCaPhe(){

    }
    public ClassCaPhe(String ten,double gia,double kl){
        this.tenCaPhe= ten;
        this.giaTien1kg=gia;
        this.khoiLuong=kl;
    }

    public double tinhTongTien(){
        return this.giaTien1kg*this.khoiLuong;
    }
    public boolean kiemTraKhoiLuongLonHon(double KhoiLuong){
        if (this.khoiLuong>KhoiLuong){
            return true;
        }else {
            return false;
        }
    }
    public boolean kiemTraTongTienLonHon500k(){
        if (this.tinhTongTien()>500000){
            return true;
        }else {
            return false;
        }
    }

    public double giamGia(double x){
        if (this.tinhTongTien()>500000){
            return (x/100)*this.tinhTongTien();
        }else {
            return 0;
        }
    }
    public double tienPhaiTra(double x){
        return this.tinhTongTien()-this.giamGia(x);
    }

}
