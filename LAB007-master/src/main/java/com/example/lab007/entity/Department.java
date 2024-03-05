package com.example.lab007.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Department implements java.io.Serializable{
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Basic(optional = false)
    @Column(name = "DEPT_ID")
    private int deptId;
    @Basic
    @Column(name = "DEPT_NAME")
    private String deptName;
    @Basic
    @Column(name = "DEPT_NO")
    private String deptNo;
    @Basic
    @Column(name = "LOCATION")
    private String location;
    @OneToMany(mappedBy = "departmentByDeptId")
    private Collection<Employee> employeesByDeptId;

    public Department(int DEPT_ID, String DEPT_NAME, String DEPT_NO, String LOCATION){}

    public Department(int deptId, String deptName, String deptNo, String location, Collection<Employee> employeesByDeptId) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptNo = deptNo;
        this.location = location;
        this.employeesByDeptId = employeesByDeptId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (deptId != that.deptId) return false;
        if (deptName != null ? !deptName.equals(that.deptName) : that.deptName != null) return false;
        if (deptNo != null ? !deptNo.equals(that.deptNo) : that.deptNo != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptId;
        result = 31 * result + (deptName != null ? deptName.hashCode() : 0);
        result = 31 * result + (deptNo != null ? deptNo.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }

    public Collection<Employee> getEmployeesByDeptId() {
        return employeesByDeptId;
    }

    public void setEmployeesByDeptId(Collection<Employee> employeesByDeptId) {
        this.employeesByDeptId = employeesByDeptId;
    }
}
