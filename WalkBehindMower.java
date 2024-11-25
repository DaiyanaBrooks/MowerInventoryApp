/*
Name: Daiyana Brooks
Date: March 20th, 2024
Class: Comp 167 001
Description: I created an abstract class called WalkBehindMower that consisted of specified attributes and operations.
*/
public abstract class WalkBehindMower extends Mower {
    private double cutWidth;
    private double wheelDiameter;

    //Default constructor initializes instance variables.
    public WalkBehindMower(){
        this.cutWidth = 0;
        this.wheelDiameter = 0;
        this.setType('#');
    }

    //Getters and Setters
    public double getCutWidth() {
        return cutWidth;
    }

    public void setCutWidth(double cutWidth) {
        this.cutWidth = cutWidth;
    }

    public double getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public String toString(){

        String info = super.getManufacturer() + "\n" + super.getYear() + "\n" + super.getSerialNumber() + "\n" + "#\n" + this.cutWidth + "\n" + this.wheelDiameter;
        return info;
    }
}
