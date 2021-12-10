package IOEmployee;

import Model.Account;
import Model.Employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteAccount {
    public static List<Account> readFile() {
        List<Account> accountList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\HaniPu\\Desktop\\JAVA\\Case study\\CaseStady\\src\\IOEmployee\\fileAccount.txt");
            if (fileInputStream.available() != 0) {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                accountList = (List<Account>) objectInputStream.readObject();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return accountList;
    }

    public static void writeToFile(List<Account> accountList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\HaniPu\\Desktop\\JAVA\\Case study\\CaseStady\\src\\IOEmployee\\fileAccount.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(accountList);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
