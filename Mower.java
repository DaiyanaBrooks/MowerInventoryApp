/*
Name: Daiyana Brooks
Date: March 20th, 2024
Class: Comp 167 001
Description: Created an abstract class called Mower that consisted of specified attributes and operations.
*/
public abstract class Mower {
    private String manufacturer;
    private int year;
    private String serialNumber;
    private char type;

    //Default constructor.
    public Mower(){
        this.manufacturer = null;
        this.year = 0;
        this.serialNumber = null;
        type = '#';
    }

    //Constructor with specific values.
    public Mower(String manufacturer, int year, String serialNumber){
        this.manufacturer = manufacturer;
        this.year = year;
        this.serialNumber = serialNumber;
    }

    //Setters and Getters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String toString(){
        String info = this.manufacturer + "\n" + this.year + "\n" + this.serialNumber + "\n#";
        return info;
    }
}
