import model.Customer;

import java.util.ArrayList;

public class Car implements Sales {
    private String brand;
    private String modelYear;
    private String color;
    private double engine;
    public double price;

    Car() {

    }

    Car(String brand, String modelYear, String color, double engine, double price) {
        this.brand = brand;
        this.modelYear = modelYear;
        this.color = color;
        this.engine = engine;
        this.price = price;
    }


    public String getBrand() {
        return brand.toUpperCase();
    }

    public void setBrand(String brnd) {
        brand = brnd;
    }

    public String getModelYear() {
        return modelYear.toUpperCase();
    }

    public void setModelYear(String year) {
        modelYear = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String clr) {
        color = clr;
    }


    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }


    public Object getFullInfo() {
        return getBrand() + " | " + getModelYear() + " | " + getColor() + " | " + getPriceInfo();
    }


    public double getIntInfo() {
        return getEngine();
    }

    public double getPriceInfo() {
        return getPrice();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double sales() {

//        ArrayList<Car> list = new ArrayList<>();
//        list =infos;


        System.out.println(" sales çalıştı");
        System.out.println(Customer.balance);
        return Customer.balance - getPrice();

    }
}