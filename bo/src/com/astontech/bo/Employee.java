package com.astontech.bo;

import java.util.Date;

public class Employee extends Person {

    //Params / attributes
    private int EmployeeId;
    private Date HireDate;
    private Date TermDate;

    //constructors
    public Employee(){}

    public Employee(String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);

    }

    public Employee(int employeeId, String firstName){
        this.setFirstName(firstName);
        this.setEmployeeId(employeeId);
    }

    public Employee(String lastName){
        this.setLastName(lastName);
    }


    //getters/setters
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
