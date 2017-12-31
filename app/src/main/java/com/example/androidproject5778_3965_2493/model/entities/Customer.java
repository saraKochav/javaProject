package com.example.androidproject5778_3965_2493.model.entities;

/**
 * Created by שרה  on 30/12/2017.
 */

public class Customer {
    String lastName;
    String firstName;
    int ID;
    String phoneNumber;
    String eMail;
    String creditCard;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                " lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", ID=" + ID +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", eMail='" + eMail + '\'' +
                ", creditCard='" + creditCard + '\'' +
                '}';
    }
}
