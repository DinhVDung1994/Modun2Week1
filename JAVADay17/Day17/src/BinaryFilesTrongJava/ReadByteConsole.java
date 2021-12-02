package BinaryFilesTrongJava;


import java.io.*;

public class ReadByteConsole {
    public static void main(String[] args) throws IOException {
        readFile();
        writeToFile();
    }

    private static void writeToFile() throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("product.txt"));
            Product product = new Product(1, "IPhone 12", 2800000, "New");
            oos.writeObject(product);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("Success!");
    }


    private static void readFile() throws IOException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("product.txt"));
            Product product = (Product) ois.readObject();
            System.out.println(product);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ois.close();
        }
    }

}
