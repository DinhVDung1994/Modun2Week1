package Service;

import IOEmployee.ReadAndWriteEmployee;
import Model.Account;
import Model.Employee;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmployee {
    public static List<Employee> listEmployee = ReadAndWriteEmployee.readFile();
    static Scanner scanner = new Scanner(System.in);

    public static int valiTuoi() {
        int tuoi = 0;
        while (true) {
            System.out.println("Nhap Tuoi");
            try {
                tuoi = Integer.parseInt(scanner.nextLine());
                if (tuoi > 0 && tuoi < 120) {
                    break;
                } else {
                    System.err.println("Bạn Nghĩ " + tuoi + " Có Thể Đi Làm Được Hay Sao");
                }
            } catch (Exception e) {
                System.err.println("Tuổi Phải Được Nhập Vào Bằng Số");
            }
        }
        return tuoi;
    }

    public static int valiYearExp() {
        int yearExp = 0;
        while (true) {
            try {
                System.out.println("Nhap So Nam Kinh Nghiem");
                yearExp = Integer.parseInt(scanner.nextLine());
                if (yearExp >= 1) {
                    break;
                } else {
                    System.err.println("Bạn Là Người Mới Đến Hay Sao");
                }
            } catch (Exception e) {
                System.err.println("Thâm Niên Trong Nghề Phải Được Nhập Vào Bằng Số");
            }
        }
        return yearExp;
    }

    public static int valiSemeter() {
        int yearExp = 0;
        while (true) {
            try {
                System.out.println("Học Kì Bạn Đang Học Là: ");
                yearExp = Integer.parseInt(scanner.nextLine());
                if (yearExp >= 1 && yearExp <= 10) {
                    break;
                } else {
                    System.err.println("Bạn Học Nhiều Vậy.Chắc Bạn Nói Điêu Rồi");
                }
            } catch (Exception e) {
                System.err.println("Học Kì Phải Được Nhập Vào Bằng Số");
            }
        }
        return yearExp;
    }

    public static int valiDateGraduation() {
        int dateGraduation = 0;
        while (true) {
            try {
                System.out.println("Nhap Nam Tot Nghiep");
                dateGraduation = Integer.parseInt(scanner.nextLine());
                if (dateGraduation <= LocalDate.now().getYear()) {
                    break;
                } else {
                    System.out.println("Bạn Không Thể Tốt Nghiệp Vào Năm Lớn Hơn Năm Hiện Tại");
                }
            } catch (Exception e) {
                System.out.println("Bạn Đã Nhập Ký Tự Không Phù Hợp, Năm Phải Là Số");
            }
        }
        return dateGraduation;
    }

    public static String valiName() {
        String name;
        String reg = "^\\s$";
        while (true) {
            System.out.println("Nhap FullName");
            try {
                name = scanner.nextLine();
                if (!name.matches("[0-9]") || !name.matches(reg)) {
                    break;
                } else {
                    System.err.println("Phải Là Chữ");
                }
            } catch (Exception e) {
                System.out.println("Phải Là Chữ");
            }

        }
        return name;
    }

    //public static String valiName() {
//    int countName = 1;
//    String regex = "^[A-Z][a-z]{2,}$";
//    while (countName < 4) {
//        System.out.println("Nhập name");
//        String name = scanner.nextLine();
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(name);
//        if (matcher.find()) {
//            return name;
//        }
//        countName++;
//    }
//    return null;
//}
    public static String valiBirthday() {
        String birthday;
        //String regx = "^[0-3]?[0-9]?[-|/][0-1]?[0-9]?[-|/]\\d{4}$";
        String regx1 = "^([0-2][1-9]||[1-2][0-9]||3[0-1])/(0[1-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
        while (true) {
            System.out.println("Nhap Ngay/Thang/Nam Sinh");
            try {
                birthday = scanner.nextLine();
                if (birthday.matches(regx1)) {
                    break;
                } else {
                    System.out.println("Mời Bạn Nhập Lại Theo Định Dạng: dd/mm/yyyy");
                }
            } catch (Exception e) {
                System.out.println("Lỗi Định Dạng");
            }
        }
        return birthday;
    }

    public static String valiPhoneNumber() {
        String phone;
        String regx = "^(0|\\+84)(\\s|\\.)?(\\d{9,11}+)$";
        //  String regx = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
        while (true) {
            System.out.println("Nhap PhoneNumber");
            try {
                phone = scanner.nextLine();
                if (phone.matches(regx)) {
                    break;
                } else {
                    System.err.println("Mời Bạn Nhâp Lại");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return phone;
    }

    public static String valiEmail() {
        String email;
        String regx = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        while (true) {
            System.out.println("Nhap Email");
            try {
                email = scanner.nextLine();
                if (email.matches(regx)) {
                    break;
                } else {
                    System.out.println("Email Không Hợp Lệ");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return email;
    }

    public static String valiMaNV(int value) {
        String id;
        int count = 0;
        String regx1 = "^E[0-9]{1,4}+$";
        String regx2 = "^P[0-9]{1,4}+$";
        String regx3 = "^I[0-9]{1,4}+$";
        while (true) {
            System.out.println("Nhap Mã NV \n" +
                    "Nếu Là Experience Employee Nhập: E + Mã Số\n" +
                    "Nếu Là Fresher Employee Nhập: P + Mã Số\n" +
                    "Nếu Là Intern Employee Nhập: I + Mã Số");
            id = scanner.nextLine();
//            for (int i = 0; i < listEmployee.size(); i++) {
//                if (id.equals(listEmployee.get(i).getId())) {
//                    System.out.println("Mã Nhân Viên Đã Có Trong Danh Sách");
//                    break;
//                }
            if (value == 1 && id.matches(regx1)) {
                break;
            } else if (value == 2 && id.matches(regx2)) {
                break;
            } else if (value == 3 && id.matches(regx3)) {
                break;
            }else {
                System.out.println("Sai Định Dạng MAVN");
                break;
            }

        }
        return id;
    }
}
