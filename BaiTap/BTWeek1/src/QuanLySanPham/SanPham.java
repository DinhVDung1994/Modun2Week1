package QuanLySanPham;

public class SanPham implements Comparable {
    private String masanpham;
    private String tensanpham;
    private int gia;
    private int soluong;
    private String mota;

    public SanPham(){}

    public SanPham(String masanpham, String tensanpham, int gia, int soluong, String mota) {
        this.masanpham = masanpham;
        this.tensanpham = tensanpham;
        this.gia = gia;
        this.soluong = soluong;
        this.mota = mota;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return "SanPham[" +
                "masanpham='" + masanpham + '\'' +
                ", tensanpham='" + tensanpham + '\'' +
                ", gia=" + gia +
                ", soluong=" + soluong +
                ", mota='" + mota + '\'' +
                ']';
    }




    @Override
    public int compareTo(Object o) {
        int compareGia = ((SanPham) o).getGia();
        return this.gia - compareGia;
    }
}
