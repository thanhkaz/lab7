package com.example.lab007.entity;

import javax.persistence.*;

@Entity
@Table(name = "SALARY_GRADE", schema = "dbo", catalog = "LAB007_NguyenTuanAnh_2110900006")
public class SalaryGrade {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "GRADE")
    private int grade;
    @Basic
    @Column(name = "HIGH_SALARY")
    private double highSalary;
    @Basic
    @Column(name = "LOW_SALARY")
    private double lowSalary;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getHighSalary() {
        return highSalary;
    }

    public void setHighSalary(double highSalary) {
        this.highSalary = highSalary;
    }

    public double getLowSalary() {
        return lowSalary;
    }

    public void setLowSalary(double lowSalary) {
        this.lowSalary = lowSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalaryGrade that = (SalaryGrade) o;

        if (grade != that.grade) return false;
        if (Double.compare(highSalary, that.highSalary) != 0) return false;
        if (Double.compare(lowSalary, that.lowSalary) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = grade;
        temp = Double.doubleToLongBits(highSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lowSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
