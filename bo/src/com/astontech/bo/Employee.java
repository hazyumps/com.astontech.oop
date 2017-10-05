package com.astontech.bo;

import java.util.Date;

public class Employee extends Person {
    private int EmployeeId;
    private Date HireDate;
    private Date TermDate;

    public void setEmployeeId(int employeeId){
        this.EmployeeId = employeeId;
    }

    public int getEmployeeId(){
        return this.EmployeeId;
    }

    public void setHireDate(Date hireDate){
        this.HireDate = hireDate;
    }

    public Date getHireDate(){
        return this.HireDate;
    }

    public void setTermDate(Date termDate){
        this.TermDate = termDate;
    }

    public Date getTermDate(){
        return this.TermDate;
    }


}
