/*
Name: Daiyana Brooks
Date: March 20th, 2024
Class: Comp 167 001
Description: Created a class called CommercialMower that consisted of specified attributes and operations.
*/
public class CommercialMower extends LawnTractor{
    private double operatingHours;
    private boolean zeroTurnRadius;

    //Constructor initializes instance variables
    public CommercialMower(){
        this.operatingHours = 0;
        this.zeroTurnRadius = false;
        this.setType('C');
    }

    //Getters and Setters
    public double getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }

    public boolean isZeroTurnRadius() {
        return zeroTurnRadius;
    }

    public void setZeroTurnRadius(boolean zeroTurnRadius) {
        this.zeroTurnRadius = zeroTurnRadius;
    }
    public String toString(){

        String info = super.getManufacturer()+ "\n" + super.getYear() + "\n" + this.getSerialNumber() + "\n" + "C\n" + super.getEngine().toString() + "\n" + super.getModel() + "\n" + super.getDeckWidth() + "\n" + this.operatingHours + "\n" + this.zeroTurnRadius;
        return info;
    }
}
