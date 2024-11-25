/*
Name: Daiyana Brooks
Date: March 20th, 2024
Class: Comp 167 001
Description: Created a class called Engine that consisted of specified attributes and operations.
*/
public class Engine {
    private String manufacturer;
    private double hoursePower;
    private int cylinders;

    //Default constructor initializes instance variables.
    public Engine(){
        this.manufacturer = "";
        this.hoursePower = 0;
        this.cylinders = 0;
    }

    //Constructor initializes instance variables with specified values.
    public Engine(String manufacturer, double hoursePower, int cylinders){
        this.manufacturer = manufacturer;
        this.hoursePower = hoursePower;
        this.cylinders = cylinders;
    }

    //Getters and Setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getHoursePower() {
        return hoursePower;
    }

    public void setHoursePower(double hoursePower) {
        this.hoursePower = hoursePower;
    }
    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String toString(){
        String info = this.manufacturer + "\n" + this.hoursePower + "\n" + this.cylinders;
        return info;
    }

}
