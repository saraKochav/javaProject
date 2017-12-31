package com.example.androidproject5778_3965_2493.model.entities;

import java.util.Date;

/**
 * Created by שרה  on 30/12/2017.
 */

public class Order {
    int customerID;
    Enums.OrderStatus orderStatus;
    int carNumber;
    Date startRent;
    Date endRent;
    float startMileAge;
    float endMileAge;
    Boolean fuelFilling;
    float fuelLitter;
    float charge;
    int orderID;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Enums.OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Enums.OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public Date getStartRent() {
        return startRent;
    }

    public void setStartRent(Date startRent) {
        this.startRent = startRent;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }

    public float getStartMileAge() {
        return startMileAge;
    }

    public void setStartMileAge(float startMileAge) {
        this.startMileAge = startMileAge;
    }

    public float getEndMileAge() {
        return endMileAge;
    }

    public void setEndMileAge(float endMileAge) {
        this.endMileAge = endMileAge;
    }

    public Boolean getFuelFilling() {
        return fuelFilling;
    }

    public void setFuelFilling(Boolean fuelFilling) {
        this.fuelFilling = fuelFilling;
    }

    public float getFuelLitter() {
        return fuelLitter;
    }

    public void setFuelLitter(float fuelLitter) {
        this.fuelLitter = fuelLitter;
    }

    public float getCharge() {
        return charge;
    }

    public void setCharge(float charge) {
        this.charge = charge;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerID=" + customerID +
                ", orderStatus=" + orderStatus +
                ", carNumber='" + carNumber + '\'' +
                ", startRent=" + startRent +
                ", endRent=" + endRent +
                ", startMileAge=" + startMileAge +
                ", endMileAge=" + endMileAge +
                ", fuelFilling=" + fuelFilling +
                ", fuelLitter=" + fuelLitter +
                ", charge=" + charge +
                ", orderID=" + orderID +
                '}';
    }
}
