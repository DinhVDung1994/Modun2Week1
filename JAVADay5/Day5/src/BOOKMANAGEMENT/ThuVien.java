package BOOKMANAGEMENT;

public class ThuVien {
    private int idBook;
    private String namebook;
    private int createTime;
    private String author;
    private String languega;
    private int soluongbook;

    public ThuVien() {
    }

    public ThuVien(int idBook, String namebook, int createTime, String author, String languega, int soluongbook) {
        this.idBook = idBook;
        this.namebook = namebook;
        this.createTime = createTime;
        this.author = author;
        this.languega = languega;
        this.soluongbook = soluongbook;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguega() {
        return languega;
    }

    public void setLanguega(String languega) {
        this.languega = languega;
    }

    public int getSoluongbook() {
        return soluongbook;
    }

    public void setSoluongbook(int soluongbook) {
        this.soluongbook = soluongbook;
    }

    @Override
    public String toString() {
        return "ThuVien{" +
                "idBook=" + idBook +
                ", namebook='" + namebook + '\'' +
                ", createTime=" + createTime +
                ", author='" + author + '\'' +
                ", languega='" + languega + '\'' +
                ", soluongbook=" + soluongbook +
                '}';
    }
}
