import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
Name: Daiyana Brooks
Date: March 20th, 2024
Class: Comp 167 001
Description: This program prompts the user for the input file using the JFileChooser class.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        MowerWareHouse storage = new MowerWareHouse();
        File chosenFile = null;

        // Checks if the command line arguments are given.
        if (args.length == 0) {
            File openFile = new File(System.getProperty("java.class.path"));
            JFileChooser jFile = new JFileChooser(openFile);
            int thisFile = jFile.showOpenDialog(null);

            if(thisFile == JFileChooser.APPROVE_OPTION){
                chosenFile = jFile.getSelectedFile();
            }
        }
        else {
            chosenFile = new File(args[0]);
        }

        // Reads and saves mower data from the chosen file.
        storage.readMowerData(chosenFile.getAbsolutePath());
        storage.saveMowerData("Info.txt");

        // creates a loop for the input until 'S' is entered.
        char input;
        do {
            System.out.println("Enter your choice of Mower to get information.");
            System.out.println("Type C for Commercial Mower, G for Gas Powered Mower, P for Push reel Mower, L for Lawn Tractor, and S to stop");
            input = scnr.next().charAt(0);

            for (Mower mower : storage.getMowers()){
                if(mower.getType() == input){
                    System.out.println(mower.toString());
                }
            }
        } while (input != 'S');

    }
}