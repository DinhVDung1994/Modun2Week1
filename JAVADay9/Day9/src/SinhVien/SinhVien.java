package SinhVien;

public class SinhVien {
    private int id;
    private String name;
    private String phonenumber;
    private String address;

    private static int idnumber = 1;

    public SinhVien() {
    }

    public SinhVien(String name, String phonenumber, String address) {
        this.id = idnumber++;
        System.out.println("id sau khi saua = "+id);
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdnumber() {
        return idnumber;
    }

    public static void setIdnumber(int idnumber) {
        SinhVien.idnumber = idnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "SinhVien: "+ id +
                ", name: " + name +
                ", phonenumber: " + phonenumber  +
                ", address: " + address;
    }
}
