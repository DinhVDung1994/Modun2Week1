package Service;

import IOEmployee.ReadAndWriteEmployee;
import Model.Employee;
import Model.EmployeeExp;
import Model.EmployeeFre;
import Model.EmployeeIntern;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    static Scanner scanner = new Scanner(System.in);
    public static List<Employee> listEmployee = ReadAndWriteEmployee.readFile();

    public static Employee addEmployee(int num) {

        String id = ValidateEmployee.valiMaNV(num);

        String name = ValidateEmployee.valiName();

        String birthday = ValidateEmployee.valiBirthday();

        int tuoi = ValidateEmployee.valiTuoi();

        String phone = ValidateEmployee.valiPhoneNumber();

        System.out.println("Nhap Dia Chi");
        String address = scanner.nextLine();

        String email = ValidateEmployee.valiEmail();

        LocalDate date = LocalDate.now();

        if (num == 1) {
            int yearExp = ValidateEmployee.valiYearExp();

            System.out.println("Nhap Ky Nang");
            String skilPro = scanner.nextLine();

            EmployeeExp employeeExp = new EmployeeExp(id, name, birthday,tuoi, phone,
                    address, email,date, yearExp, skilPro);
            listEmployee.add(employeeExp);
            ReadAndWriteEmployee.writeToFile(listEmployee);
        } else if (num == 2) {
            int dateGraduation = ValidateEmployee.valiDateGraduation();

            System.out.println("Tot Nghiep Chuyen Nganh Loai");
            String rankGraduation = scanner.nextLine();

            System.out.println("Ten Truong Theo Hoc");
            String education = scanner.nextLine();

            EmployeeFre employeeFre = new EmployeeFre(id, name, birthday,tuoi, phone, address, email,date,
                    dateGraduation, rankGraduation, education);
            listEmployee.add(employeeFre);
            ReadAndWriteEmployee.writeToFile(listEmployee);
        } else if (num == 3) {

            System.out.println("Chuyen Nganh Dang Theo Hoc");
            String chuyenganh = scanner.nextLine();


            int hocki = ValidateEmployee.valiSemeter();

            System.out.println("Ten Truong Dang Theo Hoc Tap");
            String nameUniversity = scanner.nextLine();

            EmployeeIntern employeeIntern = new EmployeeIntern(id, name, birthday,tuoi, phone, address,
                    email,date, chuyenganh, hocki, nameUniversity);
            listEmployee.add(employeeIntern);
            ReadAndWriteEmployee.writeToFile(listEmployee);

        }
        return null;
    }

    public static void showListEmployee() {
        for (Employee x : listEmployee) {
            System.out.println(x);
        }
    }


    public static int findIndex() {

        System.out.println("Nhap Vao Id Cua Employee");
        String findID = scanner.nextLine();
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getId().equals(findID)) {
                return i;
            }
        }
        return -1;
    }

    public static void deleteEmployee() {
        int index = findIndex();
        if (index >= 0) {
            System.out.println("Ban Co Muon Xoa?(Y/N)");
            String YN = scanner.nextLine();
            if (YN.equals("Y")) {
                listEmployee.remove(index);
                ReadAndWriteEmployee.writeToFile(listEmployee);
                System.out.println("Done!");
            }
        } else {
            System.err.println("Lua Chon Cua Ban Khong Ton Tai");
        }
    }

    public static void editEmployee() {
        int index = findIndex();
        if (index >= 0) {
            System.out.println("Nhan Vien Ban Can Tim:");
            System.out.println(listEmployee.get(index).toString());

            System.out.println("Bat Dau Sau Thong Tin Nhan Vieen");

            if (listEmployee.get(index) instanceof EmployeeExp) {
                infoEmployee(index);
                int yearExp = ValidateEmployee.valiYearExp();
                ((EmployeeExp) listEmployee.get(index)).setExpInYear(yearExp);
                System.out.println("Nhap Ky Nang");
                String skilPro = scanner.nextLine();
                ((EmployeeExp) listEmployee.get(index)).setProSkill(skilPro);
                ReadAndWriteEmployee.writeToFile(listEmployee);
            } else if (listEmployee.get(index) instanceof EmployeeFre) {
                infoEmployee(index);
                int dateGraduation = ValidateEmployee.valiDateGraduation();
                ((EmployeeFre) listEmployee.get(index)).setGraduation_date(dateGraduation);
                System.out.println("Tot Nghiep Chuyen Nganh Loai");
                String rankGraduation = scanner.nextLine();
                ((EmployeeFre) listEmployee.get(index)).setGraduation_rank(rankGraduation);
                System.out.println("Ten Truong Theo Hoc");
                String education = scanner.nextLine();
                ((EmployeeFre) listEmployee.get(index)).setEducation(education);
                ReadAndWriteEmployee.writeToFile(listEmployee);
            } else if (listEmployee.get(index) instanceof EmployeeIntern) {
                infoEmployee(index);
                System.out.println("Chuyen Nganh Dang Theo Hoc");
                String chuyenganh = scanner.nextLine();
                ((EmployeeIntern) listEmployee.get(index)).setMajors(chuyenganh);
                int hocki = ValidateEmployee.valiSemeter();
                ((EmployeeIntern) listEmployee.get(index)).setSemester(hocki);
                System.out.println("Ten Truong Dang Theo Hoc Tap");
                String nameUniversity = scanner.nextLine();
                ((EmployeeIntern) listEmployee.get(index)).setUniversity_name(nameUniversity);
                ReadAndWriteEmployee.writeToFile(listEmployee);
            }
        } else {
            System.err.println("Lua Chon Cua Ban Khong Ton Tai");
        }
    }

    private static void infoEmployee(int index) {
        String name = ValidateEmployee.valiName();
        listEmployee.get(index).setFullname(name);
        String birthday = ValidateEmployee.valiBirthday();
        listEmployee.get(index).setBirthday(birthday);
        int tuoi = ValidateEmployee.valiTuoi();
        listEmployee.get(index).setTuoi(tuoi);
        String phone = ValidateEmployee.valiPhoneNumber();
        listEmployee.get(index).setPhonenumber(phone);
        System.out.println("Nhap Dia Chi");
        String address = scanner.nextLine();
        listEmployee.get(index).setAddress(address);
        String email = ValidateEmployee.valiEmail();
        listEmployee.get(index).setEmail(email);
    }

    public static void findEmployeeRequest(int value) {
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i) instanceof EmployeeExp && value == 1) {
                System.out.println(listEmployee.get(i));
            } else if (listEmployee.get(i) instanceof EmployeeFre && value == 2) {
                System.out.println(listEmployee.get(i));
            } else if (listEmployee.get(i) instanceof EmployeeIntern && value == 3) {
                System.out.println(listEmployee.get(i));
            }
        }
    }

    public static void getMoney(){
        int index = findIndex();
        System.out.println("Nhập Số Ngày Công Làm Việc");
        float daywork = Float.parseFloat(scanner.nextLine());
        if (listEmployee.get(index) instanceof EmployeeExp){
            if (daywork >24 ){
                System.out.print("Mức Lương Bạn Được Nhận Là: ");
                System.out.println((int)daywork*800000+(int)((daywork*800000)/10)+" VND");
            }else {
                System.out.print("Mức Lương Bạn Được Nhận Là: ");
                System.out.println((int)daywork*800000+" VND");
            }
        }else if (listEmployee.get(index) instanceof EmployeeFre){
            if (daywork >24 ){
                System.out.print("Mức Lương Bạn Được Nhận Là: ");
                System.out.println((int)daywork*600000+(int)((daywork*600000)/10)+" VND");
            }else {
                System.out.print("Mức Lương Bạn Được Nhận Là: ");
                System.out.println((int)daywork*600000+" VND");
            }
        } else if (listEmployee.get(index) instanceof EmployeeIntern){
             if (daywork >24 ){
                 System.out.print("Mức Lương Bạn Được Nhận Là: ");
                 System.out.println((int) daywork*400000+(int)((daywork*400000)/10)+" VND");
             }else {
                 System.out.print("Mức Lương Bạn Được Nhận Là: ");
                 System.out.println((int)daywork*400000+" VND");
             }
        }
    }

    public static void ShowComparableYear() {
        Collections.sort(listEmployee, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getTuoi()>o2.getTuoi()?1:-1;
            }
        });
        for (int i = 0; i < listEmployee.size(); i++) {
            System.out.println(listEmployee.get(i));
        }
    }
    public static void ShowComparableName() {
        Collections.sort(listEmployee, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getFullname().compareTo(o2.getFullname());
            }
        });
        for (int i = 0; i < listEmployee.size(); i++) {
            System.out.println(listEmployee.get(i));
        }
    }

}
