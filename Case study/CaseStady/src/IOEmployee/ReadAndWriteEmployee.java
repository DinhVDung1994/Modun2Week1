package IOEmployee;

import Model.Employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    public static List<Employee> readFile() {
        List<Employee> listEmployee = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\HaniPu\\Desktop\\JAVA\\Case study\\CaseStady\\src\\IOEmployee\\inforEmployee.txt");
            if (fileInputStream.available() != 0) {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                listEmployee = (List<Employee>) objectInputStream.readObject();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return listEmployee;
    }

    public static void writeToFile(List<Employee> listEmployee) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\HaniPu\\Desktop\\JAVA\\Case study\\CaseStady\\src\\IOEmployee\\inforEmployee.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listEmployee);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
