package com.example.androidproject5778_3965_2493.model.entities;

/**
 * Created by שרה  on 30/12/2017.
 */

public class Branch {
    String address;
    int parkingSpaces;
    int branchNumber;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "address='" + address + '\'' +
                ", parkingSpaces=" + parkingSpaces +
                ", branchNumber=" + branchNumber +
                '}';
    }
}
