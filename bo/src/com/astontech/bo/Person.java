package com.astontech.bo;

public class Person extends BaseBO{

    private int PersonId;
    private String Title;
    private String FirstName;
    private String LastName;
    private String DisplayFirstName;
    private String Gender;

    public void setPersonId(int personId) {
        this.PersonId = personId;
    }

    public int getPersonId(){
        return  this.PersonId;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getTitle(){
        return this.Title;
    }

    public void setFirstName(String firstName){
        this.FirstName = firstName;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setLastName(String lastName){
        this.LastName = lastName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setDisplayFirstName(String displayFirstName) {
        this.DisplayFirstName = displayFirstName;
    }

    public String getDisplayFirstName(){
        return this.DisplayFirstName;
    }

    public void setGender(String gender){
        this.Gender = gender;
    }

    public String getGender() {
        return this.Gender;
    }
}
