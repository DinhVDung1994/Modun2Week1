package WriteAndReadFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Tên File Muốn Đọc và Ghi: ");
        String namefile = scanner.nextLine();

        File file = getFile(namefile);

        List product = new ArrayList<>();
        product.add("Hello Java!");
        product.add("Good Bye!");
        product.add("Tom Đú");
        System.out.println("Độ Dài File: "+product.size());
        System.out.println("Các Phần Tử Trong file: "+product);
       //writeToFile(product,file);

        readfile(file);

    }

    private static File getFile(String namefile) throws IOException {
        File file = new File(namefile +".txt");
        if (file.isFile()){//kiểm tra file có tồn tại hay ko
            System.out.println("File Đã Tồn Tại");
            System.out.println(file.getAbsolutePath());
        }else {
            System.out.println("Đã Tạo File Mới");
            file.createNewFile();//cú pháp tạo file
            System.out.println(file.getAbsolutePath());//lấy đường linl chứa file
        }
        return file;
    }

    private static void readfile(File file) throws IOException {
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String line ="";
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
    }


    private static void writeToFile(List product, File file) {
        try{
            FileWriter fileWriter = new FileWriter(file);
            for (int i = 0; i < product.size(); i++) {
                fileWriter.write(product.toString());
                fileWriter.write("\n");
            }
            fileWriter.close();
        }catch (Exception e){
                e.printStackTrace();
        }finally {
            System.out.println("Đã Ghi Vào File");
        }
    }
}
