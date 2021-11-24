package QuanLySach;

public class Test {
    public static void main(String[] args) {
        Ngay day1 = new Ngay(15, 8, 2000);
        Ngay day2 = new Ngay(1, 9, 2010);
        Ngay day3 = new Ngay(25, 1, 2020);

        TacGia tg1 = new TacGia("PhamHang", day1);
        TacGia tg2 = new TacGia("DinhDung", day2);
        TacGia tg3 = new TacGia("HungNguyet", day3);

        QuyenSach book1 = new QuyenSach("ThoiGian", 15000, 2005, tg1);
        QuyenSach book2 = new QuyenSach("Time", 55000, 1995, tg2);
        QuyenSach book3 = new QuyenSach("First", 75000, 2005, tg3);

        System.out.println(book1.toString());


    }
}
