package com.example.lab007.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EMP_ID")
    private int empId;
    @Basic
    @Column(name = "EMP_NAME")
    private String empName;
    @Basic
    @Column(name = "EMP_NO")
    private String empNo;
    @Basic
    @Column(name = "HIRE_DATE")
    private Date hireDate;
    @Basic
    @Column(name = "IMAGE")
    private byte[] image;
    @Basic
    @Column(name = "JOB")
    private String job;
    @Basic
    @Column(name = "SALARY")
    private double salary;
    @Basic
    @Column(name = "DEPT_ID")
    private int deptId;
    @Basic
    @Column(name = "MNG_ID")
    private Integer mngId;
    @ManyToOne
    @JoinColumn(name = "DEPT_ID", referencedColumnName = "DEPT_ID", nullable = false)
    private Department departmentByDeptId;
    @ManyToOne
    @JoinColumn(name = "MNG_ID", referencedColumnName = "EMP_ID")
    private Employee employeeByMngId;
    @OneToMany(mappedBy = "employeeByMngId")
    private Collection<Employee> employeesByEmpId;
    @OneToMany(mappedBy = "employeeByEmpId")
    private Collection<Timekeeper> timekeepersByEmpId;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public Integer getMngId() {
        return mngId;
    }

    public void setMngId(Integer mngId) {
        this.mngId = mngId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (empId != employee.empId) return false;
        if (Double.compare(salary, employee.salary) != 0) return false;
        if (deptId != employee.deptId) return false;
        if (empName != null ? !empName.equals(employee.empName) : employee.empName != null) return false;
        if (empNo != null ? !empNo.equals(employee.empNo) : employee.empNo != null) return false;
        if (hireDate != null ? !hireDate.equals(employee.hireDate) : employee.hireDate != null) return false;
        if (!Arrays.equals(image, employee.image)) return false;
        if (job != null ? !job.equals(employee.job) : employee.job != null) return false;
        if (mngId != null ? !mngId.equals(employee.mngId) : employee.mngId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = empId;
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        result = 31 * result + (empNo != null ? empNo.hashCode() : 0);
        result = 31 * result + (hireDate != null ? hireDate.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(image);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + deptId;
        result = 31 * result + (mngId != null ? mngId.hashCode() : 0);
        return result;
    }

    public Department getDepartmentByDeptId() {
        return departmentByDeptId;
    }

    public void setDepartmentByDeptId(Department departmentByDeptId) {
        this.departmentByDeptId = departmentByDeptId;
    }

    public Employee getEmployeeByMngId() {
        return employeeByMngId;
    }

    public void setEmployeeByMngId(Employee employeeByMngId) {
        this.employeeByMngId = employeeByMngId;
    }

    public Collection<Employee> getEmployeesByEmpId() {
        return employeesByEmpId;
    }

    public void setEmployeesByEmpId(Collection<Employee> employeesByEmpId) {
        this.employeesByEmpId = employeesByEmpId;
    }

    public Collection<Timekeeper> getTimekeepersByEmpId() {
        return timekeepersByEmpId;
    }

    public void setTimekeepersByEmpId(Collection<Timekeeper> timekeepersByEmpId) {
        this.timekeepersByEmpId = timekeepersByEmpId;
    }
}
