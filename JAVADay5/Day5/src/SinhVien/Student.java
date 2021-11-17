package SinhVien;

public class Student {
    private String maSV;
    private String hoTenSV;
    private float diemTH;
    private float diemLT;

    public Student(){
    }

    public Student(String maSV, String hoTenSV, float diemTH, float diemLT) {
        this.maSV = maSV;
        this.hoTenSV = hoTenSV;
        this.diemTH = diemTH;
        this.diemLT = diemLT;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTenSV() {
        return hoTenSV;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }
    public float diemTB(){
        return (diemLT+diemTH)/2;
    }

}
