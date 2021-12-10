package QuanLyDanhBa;


import java.util.List;
import java.util.Scanner;

public class ManagerPhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       List<PhoneBook> phoneBookList = ReadAndWrite.readFile();
        while (true) {
            System.out.println("-----------------Menu--------------");
            System.out.println("1. Xem danh sách");
            System.out.println("2. thêm mới");
            System.out.println("3. cập nhật");
            System.out.println("4. xóa");
            System.out.println("5. tìm kiếm");
            System.out.println("6. đọc từ file");
            System.out.println("7. ghi vào file");
            System.out.println("8. thoát");
            System.out.println("chọn chức năng: ");
            int luachon = Integer.parseInt(scanner.nextLine());
            switch (luachon){
                case 1:
                    System.out.println("danh sách danh bạ");
                    for (PhoneBook pb:phoneBookList) {
                        System.out.println(pb);
                    }
                    break;
                case 2:
                    System.out.println("họ tên cần lưu:");
                    String hoten = scanner.nextLine();
                    System.out.println("số điện thoại");
                    String phone = scanner.nextLine();
                    System.out.println("địa chỉ");
                    String diachi = scanner.nextLine();
                    System.out.println("email");
                    String email = scanner.nextLine();
                    System.out.println("facebook cá nhân");
                    String fb = scanner.nextLine();
                    PhoneBook newphonebook = new PhoneBook(hoten,phone,diachi,email,fb);
                    phoneBookList.add(newphonebook);
                    ReadAndWrite.writeToFile(phoneBookList);
                    break;
                case 3:
                    System.out.println("nhập số điện thoại muốn sửa:");
                    String editphone3 = scanner.nextLine();
                    for (PhoneBook pb:phoneBookList) {
                        if (pb.getPhone().equals(editphone3)){
                            System.out.println("họ tên cần lưu:");
                            pb.setHoten(scanner.nextLine());
                            System.out.println("số điện thoại");
                            pb.setPhone(scanner.nextLine());
                            System.out.println("địa chỉ");
                            pb.setDiachi(scanner.nextLine());
                            System.out.println("email");
                            pb.setEmail(scanner.nextLine());
                            System.out.println("facebook cá nhân");
                            pb.setFacebook(scanner.nextLine());
                            ReadAndWrite.writeToFile(phoneBookList);
                        }
                    }
                    break;
                case 4: {
                    System.out.println("nhập số điện thoại muốn xóa:");
                    String editphone4 = scanner.nextLine();
                    for (PhoneBook pb:phoneBookList) {
                        if (pb.getPhone().equals(editphone4)){
                            System.out.println("Nhập 'Y' để xóa");
                            String yes = scanner.nextLine();
                            if (yes.equals("Y")){
                                phoneBookList.remove(pb);
                                ReadAndWrite.writeToFile(phoneBookList);
                            }
                        }
                        else {
                            System.out.println("không tìm thấy trong danh bạ");
                        }
                    }
                    break;
                }
                case 5:
                    System.out.println("------Menu---------");
                    System.out.println("1. tìm theo tên");
                    System.out.println("2. tìm theo số điện thoại");
                    System.out.println("lựa chọn của bạn là:");
                    int luachon1 = Integer.parseInt(scanner.nextLine());
                    switch (luachon1){
                        case 1:
                            System.out.println("Nhập tên danh bạ");
                            String name = scanner.nextLine();
                            for (PhoneBook pb:phoneBookList ) {
                                if (pb.getHoten().contains(name)){
                                    System.out.println(pb);
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Nhập số điện thoại");
                            String phone5 = scanner.nextLine();
                            for (PhoneBook pb:phoneBookList) {
                                if (pb.getPhone().contains(phone5)){
                                    System.out.println(pb);
                                }
                            }
                            break;
                    }
                    break;
                case 8:
                    System.exit(8);
                    break;


            }
        }

    }
}
