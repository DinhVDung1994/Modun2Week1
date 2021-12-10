package QuanLyDanhBa;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<PhoneBook> readFile(){
        List<PhoneBook> phoneBookList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\HaniPu\\Desktop\\BTVN\\BTVN_QLNV_Tuan2\\src\\QuanLyDanhBa\\contacts.csv");
            if (fis.available() !=0){
                ObjectInputStream obis = new ObjectInputStream(fis);
                phoneBookList = (List<PhoneBook>) obis.readObject();
            }
        }catch (Exception e){
            e.getMessage();
        }
        return phoneBookList;
    }

    public static void writeToFile(List<PhoneBook> phoneBookList){
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\HaniPu\\Desktop\\BTVN\\BTVN_QLNV_Tuan2\\src\\QuanLyDanhBa\\contacts.csv");
            ObjectOutputStream obos = new ObjectOutputStream(fos);
            obos.writeObject(phoneBookList);
            fos.close();
            obos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
