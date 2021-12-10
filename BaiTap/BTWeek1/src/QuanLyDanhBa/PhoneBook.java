package QuanLyDanhBa;

import java.io.Serializable;

public class PhoneBook implements Serializable {
    private String hoten;
    private String phone;
    private String diachi;
    private String email;
    private String facebook;

    public PhoneBook() {
    }

    public PhoneBook(String hoten, String phone, String diachi, String email, String facebook) {
        this.hoten = hoten;
        this.phone = phone;
        this.diachi = diachi;
        this.email = email;
        this.facebook = facebook;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "hoten='" + hoten + '\'' +
                ", phone='" + phone + '\'' +
                ", diachi='" + diachi + '\'' +
                ", email='" + email + '\'' +
                ", facebook='" + facebook + '\'' +
                '}';
    }
}
