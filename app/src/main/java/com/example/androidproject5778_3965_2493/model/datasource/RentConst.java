package com.example.androidproject5778_3965_2493.model.datasource;

import android.content.ContentValues;

import com.example.androidproject5778_3965_2493.model.entities.Branch;
import com.example.androidproject5778_3965_2493.model.entities.Car;
import com.example.androidproject5778_3965_2493.model.entities.CarModel;
import com.example.androidproject5778_3965_2493.model.entities.Customer;
import com.example.androidproject5778_3965_2493.model.entities.Enums;
import com.example.androidproject5778_3965_2493.model.entities.Order;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by שרה  on 30/12/2017.
 */

public class RentConst {
    public static class BranchConst {
        public static final String BRANCHNUMBER = "_branchNumber";
        public static final String ADDRESS = "address";
        public static final String PARKINGSPACES = "parkingSpaces";
    }

    public static class CarConst {
        public static final String CARNUMBER = "_carNumber";
        public static final String HOUSEBRANCH = "houseBranch";
        public static final String MODELCODE = "modelCode";
        public static final String MILEAGE = "mileAge";
    }

    public static class CarModelConst {
        public static final String MODELCODE = "_modelCode";
        public static final String COMPANYNAME = "companyName";
        public static final String MODELNAME = "modelName";
        public static final String ENGINECAPACITY = "engineCapacity";
        public static final String GEARBOX = "gearBox";
        public static final String SEATS = "seats";
        public static final String COLOR = "color";
        public static final String YEARMANUFACTURE = "yearManufacture";
    }

    public static class CustomerConst {
        public static final String ID = "_ID";
        public static final String LASTNAME = "lastName";
        public static final String FIRSTNAME = "firstName";
        public static final String PHONENUMBER = "phoneNumber";
        public static final String EMAIL = "eMail";
        public static final String CREDITCARD = "creditCard";
    }

    public static class OrderConst {
        public static final String CUSTUMERID = "_customerID";
        public static final String ORDERSTATUS = "orderStatus";
        public static final String CARNUMBER = "carNumber";
        public static final String STARTRENT = "startRent";
        public static final String ENDRENT = "endRent";
        public static final String STARTMILEAGE = "startMileAge";
        public static final String ENDMILEAGE = "endMileAge";
        public static final String FUELFILLING = "fuelFilling";
        public static final String FUELLITTER = "fuelLitter";
        public static final String CHARGE = "charge";
        public static final String ORDERID = "orderID";
    }

    public static ContentValues BranchToContentValues(Branch branch) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(BranchConst.ADDRESS, branch.getAddress());
        contentValues.put(BranchConst.BRANCHNUMBER, branch.getBranchNumber());
        contentValues.put(BranchConst.PARKINGSPACES, branch.getParkingSpaces());
        return contentValues;
    }

    public static Branch ContentValuesToBranch(ContentValues contentValues) {
        Branch branch = new Branch();
        branch.setAddress(contentValues.getAsString(BranchConst.ADDRESS));
        branch.setParkingSpaces(contentValues.getAsInteger(BranchConst.PARKINGSPACES));
        branch.setBranchNumber(contentValues.getAsInteger(BranchConst.BRANCHNUMBER));
        return branch;
    }

    public static ContentValues CarToContentValues(Car car) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CarConst.CARNUMBER, car.getCarNumber());
        contentValues.put(CarConst.HOUSEBRANCH, car.getHouseBranch());
        contentValues.put(CarConst.MODELCODE, car.getModelCode());
        contentValues.put(CarConst.MILEAGE, car.getMileAge());
        return contentValues;
    }

    public static Car ContentValuesToCar(ContentValues contentValues) {
        Car car = new Car();
        car.setCarNumber(contentValues.getAsInteger(CarConst.CARNUMBER));
        car.setHouseBranch(contentValues.getAsInteger(CarConst.HOUSEBRANCH));
        car.setModelCode(contentValues.getAsInteger(CarConst.MODELCODE));
        car.setMileAge(contentValues.getAsFloat(CarConst.MILEAGE));
        return car;
    }

    public static ContentValues CarModelToContentValues(CarModel carModel) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CarModelConst.MODELCODE, carModel.getModelCode());
        contentValues.put(CarModelConst.COMPANYNAME, carModel.getCompanyName());
        contentValues.put(CarModelConst.MODELNAME, carModel.getModelName());
        contentValues.put(CarModelConst.ENGINECAPACITY, carModel.getEngineCapacity());
        contentValues.put(CarModelConst.GEARBOX, carModel.getGearBox().toString());
        contentValues.put(CarModelConst.SEATS, carModel.getSeats());
        contentValues.put(CarModelConst.COLOR, carModel.getColor());
        contentValues.put(CarModelConst.YEARMANUFACTURE, String.valueOf(carModel.getYearManufacture()));

        DateFormat dateFormat = new SimpleDateFormat("yyyy"); // like MySQL Format
        String dateString = dateFormat.format(carModel.getYearManufacture());
        contentValues.put(CarModelConst.YEARMANUFACTURE, dateString);

        return contentValues;
    }

    public static CarModel ContentValuesToCarModel(ContentValues contentValues) {
        CarModel carModel = new CarModel();
        carModel.setModelCode(contentValues.getAsInteger(CarModelConst.MODELCODE));
        carModel.setCompanyName(contentValues.getAsString(CarModelConst.COMPANYNAME));
        carModel.setModelName(contentValues.getAsString(CarModelConst.MODELNAME));
        carModel.setEngineCapacity(contentValues.getAsFloat(CarModelConst.ENGINECAPACITY));
        carModel.setGearBox(Enums.GearBox.valueOf(contentValues.getAsString(CarModelConst.GEARBOX)));
        carModel.setSeats(contentValues.getAsInteger(CarModelConst.SEATS));
        carModel.setColor(contentValues.getAsString(CarModelConst.COLOR));

        DateFormat dateFormat = new  SimpleDateFormat("yyyy"); // like MySQL Format
        String dateString = contentValues.getAsString(CarModelConst.YEARMANUFACTURE);
        try {
            carModel.setYearManufacture(dateFormat.parse(dateString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return carModel;
    }

    public static ContentValues CustomerToContentValues(Customer customer) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CustomerConst.LASTNAME, customer.getLastName());
        contentValues.put(CustomerConst.FIRSTNAME, customer.getFirstName());
        contentValues.put(CustomerConst.ID, customer.getID());
        contentValues.put(CustomerConst.PHONENUMBER, customer.getPhoneNumber());
        contentValues.put(CustomerConst.EMAIL, customer.geteMail());
        contentValues.put(CustomerConst.CREDITCARD, customer.getCreditCard());
        return contentValues;
    }


    public static Customer ContentValuesToCustomer(ContentValues contentValues) {
        Customer customer = new Customer();
        customer.setLastName(contentValues.getAsString(CustomerConst.LASTNAME));
        customer.setFirstName(contentValues.getAsString(CustomerConst.FIRSTNAME));
        customer.setID(contentValues.getAsInteger(CustomerConst.ID));
        customer.setPhoneNumber(contentValues.getAsString(CustomerConst.PHONENUMBER));
        customer.seteMail(contentValues.getAsString(CustomerConst.EMAIL));
        customer.setCreditCard(contentValues.getAsString(CustomerConst.CREDITCARD));
        return customer;
    }

    public static ContentValues OrderToContentValues(Order order) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(OrderConst.CUSTUMERID, order.getCustomerID());
        contentValues.put(OrderConst.ORDERSTATUS, order.getOrderStatus().toString());
        contentValues.put(OrderConst.CARNUMBER, order.getCarNumber());

        DateFormat dateFormatStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // like MySQL Format
        String dateStringStart = dateFormatStart.format(order.getStartRent());
        contentValues.put(OrderConst.STARTRENT, dateStringStart);

        DateFormat dateFormatEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // like MySQL Format
        String dateStringEnd = dateFormatEnd.format(order.getEndRent());
        contentValues.put(OrderConst.ENDRENT, dateStringEnd);

        contentValues.put(OrderConst.STARTMILEAGE, order.getStartMileAge());
        contentValues.put(OrderConst.ENDMILEAGE, order.getEndMileAge());
        contentValues.put(OrderConst.FUELFILLING, order.getFuelFilling());
        contentValues.put(OrderConst.FUELLITTER, order.getFuelLitter());
        contentValues.put(OrderConst.CHARGE, order.getCharge());
        contentValues.put(OrderConst.ORDERID, order.getOrderID());
        return contentValues;
    }

    public static Order ContentValuesToOrder(ContentValues contentValues) {
        Order order = new Order();
        order.setCustomerID(contentValues.getAsInteger(OrderConst.CUSTUMERID));
        order.setOrderStatus(Enums.OrderStatus.valueOf(contentValues.getAsString(OrderConst.ORDERSTATUS)));
        order.setCarNumber(contentValues.getAsInteger(OrderConst.CARNUMBER));

        DateFormat dateFormatStart = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // like MySQL Format
        String DateStartString = contentValues.getAsString(OrderConst.STARTRENT);
        try {
            order.setStartRent(dateFormatStart.parse(DateStartString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        DateFormat dateFormatEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // like MySQL Format
        String DateEndString = contentValues.getAsString(OrderConst.ENDRENT);
        try {
            order.setEndRent(dateFormatEnd.parse(DateEndString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        order.setStartMileAge(contentValues.getAsFloat(OrderConst.STARTMILEAGE));
        order.setEndMileAge(contentValues.getAsFloat(OrderConst.ENDMILEAGE));
        order.setFuelFilling(contentValues.getAsBoolean(OrderConst.FUELFILLING));
        order.setFuelLitter(contentValues.getAsFloat(OrderConst.FUELLITTER));
        order.setCharge(contentValues.getAsFloat(OrderConst.CHARGE));
        order.setOrderID(contentValues.getAsInteger(OrderConst.ORDERID));
        return order;
    }
}
