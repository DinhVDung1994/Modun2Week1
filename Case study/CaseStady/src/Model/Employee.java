package Model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Locale;


public class Employee implements Serializable {
    private String id;
    private String fullname;
    private String birthday;
    private int tuoi;
    private String phonenumber;
    private String address;
    private String email;
    private LocalDate date;


    public Employee() {
    }


    public Employee(String id, String fullname, String birthday,
                    int tuoi, String phonenumber, String address,
                    String email, LocalDate date) {
        this.id = id.toUpperCase(Locale.ROOT);
        this.fullname = fullname;
        this.birthday = birthday;
        this.tuoi = tuoi;
        this.phonenumber = phonenumber;
        this.address = address;
        this.email = email;
        this.date = date;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "=> Mã NV='" + id + '\'' +
                ", Fullname='" + fullname + '\'' +
                ", Birthday='" + birthday + '\'' +
                ", Tuổi='"+ tuoi+'\'' +
                ", Phonenumber='" + phonenumber + '\'' +
                ", Address='" + address + '\'' +
                ", Email='" + email + '\''+
                ", Ngày Nhập: "+date
                ;
    }


//    @Override
//    public int compareTo(Employee o) {
//        return this.fullname.compareTo(o.fullname);
//    }

}
