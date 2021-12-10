package Model;

import java.time.LocalDate;

public class EmployeeFre extends Employee {
    private int graduation_date;
    private String graduation_rank;
    private String education;

    public EmployeeFre(int graduation_date, String graduation_rank, String education) {
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    public EmployeeFre(String id, String fullname, String birthday,
                       int tuoi, String phonenumber, String address,
                       String email, LocalDate date, int graduation_date,
                       String graduation_rank, String education) {
        super(id, fullname, birthday, tuoi, phonenumber, address, email, date);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    public int getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(int graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "EmployeeFre [" + super.toString() +
                ", Graduation_date=" + graduation_date +
                ", Graduation_rank='" + graduation_rank + '\'' +
                ", Education='" + education + '\'' +
                ']';
    }
}
