package com.example.messageapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Model{
    @Id
    @Column(name = "iD", nullable = false)
     long iD;
    String firstName;
    String lastName;

    public Long getID() {
        return iD;
    }

    public void setID(Long iD) {
        this.iD = iD;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
}
