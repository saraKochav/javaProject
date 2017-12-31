package com.example.androidproject5778_3965_2493.model.entities;

/**
 * Created by שרה  on 30/12/2017.
 */

public class Car {
    int houseBranch;
    int modelCode;
    float mileAge;
    int carNumber;

    public int getHouseBranch() {
        return houseBranch;
    }

    public void setHouseBranch(int houseBranch) {
        this.houseBranch = houseBranch;
    }

    public int getModelCode() {
        return modelCode;
    }

    public void setModelCode(int modelCode) {
        this.modelCode = modelCode;
    }

    public float getMileAge() {
        return mileAge;
    }

    public void setMileAge(float mileAge) {
        this.mileAge = mileAge;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "houseBranch=" + houseBranch +
                ", modelCode='" + modelCode + '\'' +
                ", mileAge=" + mileAge +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
