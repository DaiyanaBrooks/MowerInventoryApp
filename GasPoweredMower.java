/*
Name: Daiyana Brooks
Date: March 20th, 2024
Class: Comp 167 001
Description: I created a class called GasPoweredMower that consists of specified attributes and operations.
*/
public class GasPoweredMower extends WalkBehindMower {
    private Engine engine;
    private boolean selfPropelled;

    //Constructor initializes instance variables.
    public GasPoweredMower(){
        this.engine = null;
        this.selfPropelled = false;
        this.setType('G');
    }

    //Getters and Setters
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isSelfPropelled() {
        return selfPropelled;
    }

    public void setSelfPropelled(boolean selfPropelled) {
        this.selfPropelled = selfPropelled;
    }

    public String toString(){
        String info = super.getManufacturer() + "\n" + super.getYear() + "\n" + super.getSerialNumber() + "\n" + "G\n" + super.getCutWidth() + "\n" + super.getWheelDiameter() + "\n" + this.engine.toString() + "\n" + this.selfPropelled;
        return info;
    }
}
