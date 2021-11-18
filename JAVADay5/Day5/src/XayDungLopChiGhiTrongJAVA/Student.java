package XayDungLopChiGhiTrongJAVA;

public class Student {
    private String name = "john";
    private String classes = "SD02";

    public Student(){}


    public void getName(String name){
        this.name = name;
    }
    public void getClasses(String classes){
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
