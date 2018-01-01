package com.example.androidproject5778_3965_2493.model.backend;

import android.content.ContentValues;

import com.example.androidproject5778_3965_2493.model.entities.Branch;
import com.example.androidproject5778_3965_2493.model.entities.Car;
import com.example.androidproject5778_3965_2493.model.entities.CarModel;
import com.example.androidproject5778_3965_2493.model.entities.Customer;
import com.example.androidproject5778_3965_2493.model.entities.Order;

import java.util.List;

/**
 * Created by שרה  on 30/12/2017.
 */

public interface DB_manager {
    boolean addCustomer(ContentValues newCustomer);
    boolean addCar(ContentValues newCar);
    boolean addCarModel(ContentValues newCarModel);
    boolean addBranch(ContentValues newBranch);
    boolean addOrder(ContentValues newOrder);

   /* boolean removeCustomer(long id);
    boolean removeCar(String id);
    boolean removeBranch(long id);
    boolean removeOrder(long id);

    boolean updateCustomer(int id,ContentValues values);*/
    boolean updateCar(int id,ContentValues values);
  /*  boolean updateBranch(int id,ContentValues values);
    boolean updateOrder(int id,ContentValues values);*/


    boolean existCustomer(ContentValues customer);
   /* boolean existcar(ContentValues car);
    boolean existbranch(ContentValues branch);
    boolean existorder(ContentValues order);*/



    List<Customer> getCustomers();
    List<Car> getCars();
    List<CarModel> getCarModels();
    List<Branch> getBranchs();
    List<Order> getOrders();
    List<Car> getAvailableCars();
    List<Car> getAvailableCarsByBranch(int branchNumber);
    List<Order> getOpenOrders();

}
