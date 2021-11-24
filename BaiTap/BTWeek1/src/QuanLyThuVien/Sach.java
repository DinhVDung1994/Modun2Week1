package QuanLyThuVien;

public class Sach {
    private String tensach;
    private String loaisach;
    private int namxuatban;
    private String tentacgia;

    public Sach(){}

    public Sach(String tensach, String loaisach, int namxuatban, String tentacgia) {
        this.tensach = tensach;
        this.loaisach = loaisach;
        this.namxuatban = namxuatban;
        this.tentacgia = tentacgia;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getLoaisach() {
        return loaisach;
    }

    public void setLoaisach(String loaisach) {
        this.loaisach = loaisach;
    }

    public int getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    @Override
    public String toString() {
        return "Sach[" +
                "tensach='" + tensach + '\'' +
                ", loaisach='" + loaisach + '\'' +
                ", namxuatban=" + namxuatban +
                ", tentacgia='" + tentacgia + '\'' +
                ']';
    }
}
