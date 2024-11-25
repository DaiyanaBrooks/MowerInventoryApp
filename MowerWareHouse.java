import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Name: Daiyana Brooks
Date: March 20th, 2024
Class: Comp 167 001
Description: I created a class called MowerWareHouse that consists of specified attributes and operations.
*/
public class MowerWareHouse {
    private String storeName;
    private ArrayList<Mower> mowers;

    //Default constructor initializes instance variables
    public MowerWareHouse(){
        this.mowers = new ArrayList<Mower>();
        this.storeName = "";
    }

    //Getters and Setters
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public ArrayList<Mower> getMowers() {
        return mowers;
    }

    public void setMowers(ArrayList<Mower> mowers) {
        this.mowers = mowers;
    }

    public void addMower(Mower mower) {this.mowers.add(mower);}
    public int getNumMowers(){return this.mowers.size();}
    public void removeMower(int index) {this.mowers.remove(index);}
    public Mower getMower(int index) {return this.mowers.get(index);}
    public void setMower(int index, Mower mower) {this.mowers.set(index, mower);}

    //Reads mower data from a file and populates the warehouse
    public void readMowerData(String inputFileName) throws IOException {
        File myFile = new File(inputFileName);
        Scanner read = new Scanner(myFile);
        String company = "";
        String serialNum = "";
        char type;
        int year = 0;

        this.storeName = read.nextLine();

        while(read.hasNextLine()){
            String manufacturer;
            double hoursepower;
            int cylinder;
            int cutWidth;
            double wheelDiameter;

            company = read.nextLine();
            year = read.nextInt();
            read.nextLine();
            serialNum = read.nextLine();
            type = read.next().charAt(0);
            read.nextLine();

            switch (type) {
                case 'L' :
                    LawnTractor lawnMower = new LawnTractor();

                    lawnMower.setManufacturer(company);
                    lawnMower.setYear(year);
                    lawnMower.setSerialNumber(serialNum);

                    manufacturer = read.nextLine();
                    hoursepower = read.nextDouble();
                    read.nextLine();
                    cylinder = read.nextInt();
                    read.nextLine();

                    Engine lawnEngine = new Engine(manufacturer, hoursepower, cylinder);
                    lawnMower.setEngine(lawnEngine);
                    lawnMower.setModel(read.nextLine());
                    lawnMower.setDeckWidth(read.nextDouble());

                    if (read.hasNextLine()) {
                        read.nextLine();
                    }
                    mowers.add(lawnMower);
                    break;

                case 'C' :
                    CommercialMower commercialMower = new CommercialMower();

                    commercialMower.setManufacturer(company);
                    commercialMower.setYear(year);
                    commercialMower.setSerialNumber(serialNum);

                    manufacturer = read.nextLine();
                    hoursepower = read.nextDouble();
                    read.nextLine();
                    cylinder = read.nextInt();

                    Engine comEngine = new Engine(manufacturer, hoursepower, cylinder);
                    commercialMower.setEngine(comEngine);
                    read.nextLine();

                    commercialMower.setModel(read.nextLine());
                    commercialMower.setDeckWidth(read.nextDouble());
                    read.nextLine();
                    commercialMower.setOperatingHours(read.nextDouble());
                    read.nextLine();
                    commercialMower.setZeroTurnRadius(Boolean.parseBoolean(read.nextLine()));
                    mowers.add(commercialMower);
                    break;

                case 'G' :
                    GasPoweredMower gasMower = new GasPoweredMower();

                    gasMower.setManufacturer(company);
                    gasMower.setYear(year);
                    gasMower.setSerialNumber(serialNum);

                    cutWidth = read.nextInt();
                    read.nextLine();
                    wheelDiameter = read.nextInt();
                    read.nextLine();

                    gasMower.setCutWidth(cutWidth);
                    gasMower.setWheelDiameter(wheelDiameter);

                    manufacturer = read.nextLine();
                    hoursepower = read.nextDouble();
                    read.nextLine();
                    cylinder = read.nextInt();
                    read.nextLine();

                    Engine gasEngine = new Engine(manufacturer, hoursepower, cylinder);
                    gasMower.setEngine(gasEngine);

                    gasMower.setSelfPropelled(Boolean.parseBoolean(read.nextLine()));
                    mowers.add(gasMower);
                    break;

                case 'P' :
                    PushReelMower pushMower = new PushReelMower();

                    pushMower.setManufacturer(company);
                    pushMower.setYear(year);
                    pushMower.setSerialNumber(serialNum);

                    cutWidth = read.nextInt();
                    read.nextLine();
                    wheelDiameter = read.nextDouble();
                    read.nextLine();
                    pushMower.setCutWidth(cutWidth);
                    pushMower.setWheelDiameter(wheelDiameter);
                    pushMower.setNumWheels(read.nextInt());
                    if (read.hasNextLine()) {
                        read.nextLine();
                    }
                    mowers.add(pushMower);
                    break;
            }
        }

    }

    //Saves mower data to a file.
    public void saveMowerData(String outputFileName) throws IOException {
        File myFile = new File(outputFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(myFile);

        PrintWriter write = new PrintWriter(fileOutputStream);
        write.write(toString() + "\n");

        fileOutputStream.close();
    }

    public String toString(){
        String info = this.storeName + "\n";
        for (Mower mower : mowers){
            info = info + mower.toString();
            if (mower.getType() == 'C'){
                info = info + "\n";
            }
        }
        return info;
    }
}
