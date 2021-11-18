package ClassCaFe;

public class mainCaPhe {
    public static void main(String[] args) {
        ClassCaPhe hd1 = new ClassCaPhe("CaFe TrungNguyen",150000,2.5);
        ClassCaPhe hd2 = new ClassCaPhe("CaFe G7",300000,4);
        System.out.println(hd1.kiemTraKhoiLuongLonHon(2));
        System.out.println("TongTien CaFe TrungNguyen: "+hd1.tinhTongTien()+" VND");
        System.out.println("TongTien CaFe TrungNguyen: "+hd2.tinhTongTien()+" VND");
        System.out.println("Tổng Tiền Có Lớn Hơn 500k không: "+hd1.kiemTraTongTienLonHon500k());
        System.out.println("Tổng Tiền Có Lớn Hơn 500k không: "+hd2.kiemTraTongTienLonHon500k());
        System.out.println("Giảm Giá: "+hd1.giamGia(10));
        System.out.println("Giảm Giá: "+hd2.giamGia(10));
        System.out.println("Tổng Tiền Phải Trả: "+hd1.tienPhaiTra(10));
        System.out.println("Tổng Tiền Phải Trả: "+hd2.tienPhaiTra(10));

    }
}
