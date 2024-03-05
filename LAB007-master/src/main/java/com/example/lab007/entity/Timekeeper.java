package com.example.lab007.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Timekeeper {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Timekeeper_Id")
    private String timekeeperId;
    @Basic
    @Column(name = "Date_Time")
    private Date dateTime;
    @Basic
    @Column(name = "In_Out")
    private String inOut;
    @Basic
    @Column(name = "EMP_ID")
    private int empId;
    @ManyToOne
    @JoinColumn(name = "EMP_ID", referencedColumnName = "EMP_ID", nullable = false)
    private Employee employeeByEmpId;

    public String getTimekeeperId() {
        return timekeeperId;
    }

    public void setTimekeeperId(String timekeeperId) {
        this.timekeeperId = timekeeperId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getInOut() {
        return inOut;
    }

    public void setInOut(String inOut) {
        this.inOut = inOut;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Timekeeper that = (Timekeeper) o;

        if (empId != that.empId) return false;
        if (timekeeperId != null ? !timekeeperId.equals(that.timekeeperId) : that.timekeeperId != null) return false;
        if (dateTime != null ? !dateTime.equals(that.dateTime) : that.dateTime != null) return false;
        if (inOut != null ? !inOut.equals(that.inOut) : that.inOut != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = timekeeperId != null ? timekeeperId.hashCode() : 0;
        result = 31 * result + (dateTime != null ? dateTime.hashCode() : 0);
        result = 31 * result + (inOut != null ? inOut.hashCode() : 0);
        result = 31 * result + empId;
        return result;
    }

    public Employee getEmployeeByEmpId() {
        return employeeByEmpId;
    }

    public void setEmployeeByEmpId(Employee employeeByEmpId) {
        this.employeeByEmpId = employeeByEmpId;
    }
}
