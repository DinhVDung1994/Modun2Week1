package Model;

import java.time.LocalDate;

public class EmployeeIntern extends Employee {
    private String majors;
    private int semester;
    private String university_name;

    public EmployeeIntern(String majors, int semester, String university_name) {
        this.majors = majors;
        this.semester = semester;
        this.university_name = university_name;
    }

    public EmployeeIntern(String id, String fullname, String birthday,
                          int tuoi, String phonenumber, String address,
                          String email, LocalDate date, String majors,
                          int semester, String university_name) {
        super(id, fullname, birthday, tuoi, phonenumber, address, email, date);
        this.majors = majors;
        this.semester = semester;
        this.university_name = university_name;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    @Override
    public String toString() {
        return "EmployeeIntern [" + super.toString() +
                ", Majors='" + majors + '\'' +
                ", Semester=" + semester +
                ", University_name='" + university_name + '\'' +
                ']';

    }
}
