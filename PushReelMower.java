/*
Name: Daiyana Brooks
Date: March 20th, 2024
Class: Comp 167 001
Description: I created a class called PushReelMower that consists of specified attributes and operations.
*/
public class PushReelMower extends WalkBehindMower {
    private int numWheels;

    //Default constructor initializes instance variables.
    public PushReelMower(){
        this.numWheels = 0;
        this.setType('P');
    }

    //Getters and Setters
    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public String toString(){
        String info = super.getManufacturer() + "\n" + super.getYear() + "\n" + super.getSerialNumber() + "\n" + "P\n" + super.getCutWidth() + "\n" + super.getWheelDiameter() + "\n" + this.numWheels;
        return info;
    }
}
