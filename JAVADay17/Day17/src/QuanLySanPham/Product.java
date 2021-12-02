package QuanLySanPham;

import java.time.LocalDate;
import java.util.Date;

public class Product{
    private int id;
    private String nameproduct;
    private double price;
    private LocalDate date;
    private int soluong;

    private static int idnumber = 1;

    public Product( String nameproduct, double price, LocalDate date, int soluong) {
        this.id = idnumber++;
        this.nameproduct = nameproduct;
        this.price = price;
        this.date = date;
        this.soluong = soluong;
    }

    public Product(String tensp, double gia, String date, int numbers) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
            this.id = id;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
    this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "San Pham: "+getId()+" - "+getNameproduct()+" - "+getPrice()+" - "+getDate()+" - "+getSoluong();
    }
}
