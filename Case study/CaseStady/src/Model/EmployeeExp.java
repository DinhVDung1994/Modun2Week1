package Model;

import java.time.LocalDate;

public class EmployeeExp extends Employee {
    private double expInYear;
    private String proSkill;

    public EmployeeExp(double expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public EmployeeExp(String id, String fullname, String birthday, int tuoi,
                       String phonenumber, String address, String email,
                       LocalDate date, double expInYear, String proSkill) {
        super(id, fullname, birthday, tuoi, phonenumber, address, email, date);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public double getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(double expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "EmployeeExp [" + super.toString() +
                ", ExpInYear=" + expInYear +
                ", ProSkill='" + proSkill + '\'' +
                ']';
    }
}
