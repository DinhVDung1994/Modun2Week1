package BOOKMANAGEMENT;

import java.util.Scanner;

public class mainThuVien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ThuVien[] library = new ThuVien[5];
        library[0] = new ThuVien(001, "Sách Toán", 1976, "Đinh Văn Đoàn", "Marock", 10);
        library[1] = new ThuVien(002, "Sách Lý", 1986, "Đinh Văn Phong", "English", 11);
        library[2] = new ThuVien(003, "Sách Hóa", 1996, "Đinh Văn Dũng", "Thái Lan", 12);
        library[3] = new ThuVien(004, "Sách Anh", 1906, "Đinh Văn Hiệp", "Đông Lào", 13);
        library[4] = new ThuVien(005, "Sách Phép Thuật", 1916, "Đoàn Văn Sơn", "Việt Nam", 14);
        addBook(library);
    }

    public static ThuVien createBook() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Thêm id: ");
        int id = input1.nextInt();
        System.out.println("Thêm namebook: ");
        String namebook = input1.nextLine();
        System.out.println("Thêm creatTime: ");
        int createTime = input1.nextInt();
        System.out.println("Thêm Tác Giả: ");
        String author = input1.nextLine();
        System.out.println("Thêm Ngôn Ngữ: ");
        String langguega = input1.nextLine();
        System.out.println("Thêm Số Lượng: ");
        int soLuong = input1.nextInt();
        ThuVien creatBook = new ThuVien(id, namebook, createTime, author, langguega, soLuong);
        return creatBook;
    }

    public static ThuVien[] addBook(ThuVien[] library) {
        ThuVien creaBook = createBook();
        ThuVien[] labrary2 = new ThuVien[library.length + 1];
        for (int i = 0; i < library.length; i++) {
            labrary2[i] = library[i];
        }
        labrary2[labrary2.length - 1] = creaBook;


        for (int i = 0; i < labrary2.length; i++) {
            System.out.println(labrary2[i]);
        }
        return labrary2;
    }
}
