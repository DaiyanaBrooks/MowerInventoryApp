/*
Name: Daiyana Brooks
Date: March 20th, 2024
Class: Comp 167 001
Description: Created a class called LawnTractor that consists of specified attributes and operations.
*/
public class LawnTractor extends Mower{
    private Engine engine;
    private String model;
    private double deckWidth;

    //Constructor initializes instance variables.
    public LawnTractor(){
        this.deckWidth = 0;
        this.model = "";
        this.engine = null;
        this.setType('L');
    }

    //Getters and setters.
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDeckWidth() {
        return deckWidth;
    }

    public void setDeckWidth(double deckWidth) {
        this.deckWidth = deckWidth;
    }
    public String toString(){
        String info = super.getManufacturer() + "\n" + super.getYear() + "\n" + this.getSerialNumber() + "\n" + " L\n" + this.engine.toString() +"\n" + this.model + "\n" + this.deckWidth;
        return info;
    }
}
