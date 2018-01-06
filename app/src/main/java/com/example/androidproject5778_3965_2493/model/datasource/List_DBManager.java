package com.example.androidproject5778_3965_2493.model.datasource;


import android.content.ContentValues;

import com.example.androidproject5778_3965_2493.model.backend.DB_manager;
import com.example.androidproject5778_3965_2493.model.entities.Branch;
import com.example.androidproject5778_3965_2493.model.entities.Car;
import com.example.androidproject5778_3965_2493.model.entities.CarModel;
import com.example.androidproject5778_3965_2493.model.entities.Customer;
import com.example.androidproject5778_3965_2493.model.entities.Enums;
import com.example.androidproject5778_3965_2493.model.entities.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.example.androidproject5778_3965_2493.model.datasource.RentConst.ContentValuesToBranch;
import static com.example.androidproject5778_3965_2493.model.datasource.RentConst.ContentValuesToCar;
import static com.example.androidproject5778_3965_2493.model.datasource.RentConst.ContentValuesToCarModel;
import static com.example.androidproject5778_3965_2493.model.datasource.RentConst.ContentValuesToCustomer;
import static com.example.androidproject5778_3965_2493.model.datasource.RentConst.ContentValuesToOrder;
import static com.example.androidproject5778_3965_2493.model.datasource.RentConst.OrderToContentValues;

/**
 * Created by שרה  on 30/12/2017.
 */

public class List_DBManager implements DB_manager {
    public static List<Customer> customers;
    public static List<Car> cars;
    public static List<CarModel> carModels;
    public static List<Branch> branchs;
    public static List<Order> orders;
    static {
        customers = new ArrayList<>();
        cars = new ArrayList<>();
        carModels = new ArrayList<>();
        branchs = new ArrayList<>();
        orders = new ArrayList<>();

    }


    @Override
    public boolean existCustomer(ContentValues newcustomer) {
        Customer customer = ContentValuesToCustomer(newcustomer);
        for (Customer item : customers)
            if (item.getID() == customer.getID()) {
                return true;
            }
        return false;    }

   /* @Override
    public boolean existcar(ContentValues newCar) {
        Car car = ContentValuesToCar(newCar);
        for (Car item : cars)
            if (item.getCarNumber().equals(car.getCarNumber())) {
                return true;
            }
        return false;
    }

    @Override
    public boolean existbranch(ContentValues newbranch) {
        Branch branch = ContentValuesToBranch(newbranch);
        for (Branch item : branchs)
            if (item.getBranchNumber() == branch.getBranchNumber()) {
                return true;
            }
        return false;
    }

    @Override
    public boolean existorder(ContentValues neworder) {
        Order order = ContentValuesToOrder(neworder);
        for (Order item : orders)
            if (item.getOrderID() == order.getOrderID()) {
                return true;
            }
        return false;
    }*/

    @Override
    public boolean addCustomer(ContentValues newCustomer) {
        if (existCustomer(newCustomer)==true)
        {
            //  throw ("The customer already exists in our system\n")
            return false;
        }
        else {
            Customer customer = ContentValuesToCustomer(newCustomer);
            customers.add(customer);
        }
        return true;
    }


    @Override
    public boolean addCar(ContentValues newCar) {
        Car car = ContentValuesToCar(newCar);
        cars.add(car);
        return true;
    }

    @Override
    public boolean addCarModel(ContentValues newCarModel) {
        CarModel carModel = ContentValuesToCarModel(newCarModel);
        carModels.add(carModel);
        return true;
    }

    @Override
    public boolean addBranch(ContentValues newBranch) {
        Branch branch = ContentValuesToBranch(newBranch);
        branchs.add(branch);
        return true;
    }

    @Override
    public boolean addOrder(ContentValues newOrder) {
        Order order = ContentValuesToOrder(newOrder);
        orders.add(order);
        return true;
    }

    /*@Override
    public boolean removeCustomer(long id) {
        Customer customerToRemove = null;
        for (Customer item : customers)
            if (item.getID() == id) {
                customerToRemove = item;
                break;
            }
        return customers.remove(customerToRemove);
    }


    @Override
    public boolean removeCar(String id) {
        Car carToRemove = null;
        for (Car item : cars)
            if (item.getCarNumber().equals(id)) {
                carToRemove = item;
                break;
            }
        return cars.remove(carToRemove);

    }

    @Override
    public boolean removeBranch(long id) {
        Branch branchToRemove = null;
        for (Branch item : branchs)
            if (item.getBranchNumber() == id) {
                branchToRemove = item;
                break;
            }
        return branchs.remove(branchToRemove);

    }

    @Override
    public boolean removeOrder(long id) {
        Order orderToRemove = null;
        for (Order item : orders)
            if (item.getOrderID() == id) {
                orderToRemove = item;
                break;
            }
        return orders.remove(orderToRemove);
    }

    @Override
    public boolean updateCustomer(int id,ContentValues values) {
        Customer customer = ContentValuesToCustomer(values);
        customer.setID(id);
        for (int i = 0; i < customers.size(); i++)
            if (customers.get(i).getID() == id) {
                customers.set(i, customer);
                return true;
            }
        return false;
    }
*/

    @Override
    public boolean updateCar(int id,ContentValues values) {
        Car car = ContentValuesToCar(values);
        car.setCarNumber(id);
        for (int i = 0; i < cars.size(); i++)
            if (cars.get(i).getCarNumber()== id) {
                cars.set(i, car);
                return true;
            }
        return false;
    }

    /* @Override
    public boolean updateBranch(int id,ContentValues values) {
        Branch branch = ContentValuesToBranch(values);
        branch.setBranchNumber(id);
        for (int i = 0; i < branchs.size(); i++)
            if (branchs.get(i).getBranchNumber() == id) {
                branchs.set(i, branch);
                return true;
            }
        return false;
    }*/

    //@Override
    public boolean updateOrder(int id, ContentValues values) {
        Order order = ContentValuesToOrder(values);
        order.setOrderID(id);
        for (int i = 0; i < orders.size(); i++)
            if (orders.get(i).getOrderID() == id) {
                orders.set(i, order);
                return true;
            }
        return false;
    }

    @Override
    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<CarModel> getCarModels() {
        return carModels;
    }

    @Override
    public List<Branch> getBranchs() {
        return branchs;
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public List<Car> getAvailableCars() {
        /** This method is used to check which cars are available for rent.
         * @return list of cars.
         */
        List<Car> AvailableCars= getCars();
        for (final Order item : getOrders())
            if (item.getOrderStatus()== Enums.OrderStatus.OPEN) {
               // AvailableCars.removeIf(p -> p.getCarNumber()== item.getCarNumber());///?????????????????????????????????
                Car c=getCarByID(item.getCarNumber());
                AvailableCars.remove(c);
            }
       return AvailableCars;
    }

    @Override
    public List<Car> getAvailableCarsByBranch(int branchNumber) {
        /**This method is used to check which cars are available for rent at a particular branch.
         * @return list of cars.
         */
        List<Car> AvailableCars=null;
        for (Car item : cars)
            if (item.getHouseBranch()==branchNumber) {
                AvailableCars.add(item);
            }
        return AvailableCars;
    }

    @Override
    public List<Order> getOpenOrders() {
        /**This method is used to check which order is open,
         * ie the vehicle is still leased.
         * @return list of orders
         */
        List<Order> OpenOrders= null;
        for (Order item : orders)
            if (item.getOrderStatus()== Enums.OrderStatus.OPEN) {
                OpenOrders.add(item);
            }
        return OpenOrders;
    }

    private Order getOrderByID( int orderID)
    {
        for(Order o : getOrders())
        {
            if(o.getOrderID()==orderID)
                return o;
        }
        return null;
    }

    private Car getCarByID( int carID)
    {
        for(Car c : getCars())
        {
            if(c.getCarNumber()==carID)
                return c;
        }
        return null;
    }

    public void closeExistOrder(int orderId, float km)
    {
        Order order=getOrderByID(orderId);
        if (order!= null)
        {
            order.setEndMileAge(km);
            order.setEndRent(new Date());
            float chargePerMin=(float)0.1;
            float chargePerKM=(float)0.6;
            float calculateCharge=chargePerMin* (order.getStartRent().getTime()- order.getEndRent().getTime())
                    +chargePerKM*(order.getStartMileAge()-order.getEndMileAge());
            order.setCharge(calculateCharge);
            order.setOrderStatus(Enums.OrderStatus.CLOSE);
            updateOrder(order.getOrderID(), OrderToContentValues(order));
        }
    }

}
