# Mower Inventory Application

## Description
This Java application manages and searches mower inventory for a mower store. It allows the user to select an input file (via JFileChooser or command-line argument) and displays details about different types of mowers: LawnTractor, CommercialMower, GasPoweredMower, and PushReelMower. The user can select a mower type to view its details and continue until 'S' is entered to stop the program.

## Classes
- **Engine.java**: Defines properties of an engine, including manufacturer, horsepower, and number of cylinders.
- **Mower.java**: Abstract class representing common properties of all mower types.
- **LawnTractor.java**: Represents a lawn tractor with specific properties like deck width.
- **CommercialMower.java**: Represents a commercial mower with properties like operating hours and zero-turn radius.
- **GasPoweredMower.java**: Represents a gas-powered mower.
- **PushReelMower.java**: Represents a push reel mower.
- **MowerWareHouse.java**: Manages a collection of mowers, handles reading and saving data.
- **Main.java**: The main program that loads mower data and allows the user to search for mowers.

## How to Run
1. Compile the Java files:
   ```bash
   javac *.java
   ```
   
3. Run the program with an input file path:
   ```bash
   java Main inputFile.txt
   ```

If no file is provided, the program will prompt you to select one using JFileChooser.

After the program loads the mower data, enter your choice for the mower type:
**L** for LawnTractor
**C** for Commercial Mower
**G** for Gas Powered Mower
**P** for Push Reel Mower
**S** to stop the program.

## Features:
- Handles input file selection with JFileChooser or command-line argument.
- Displays detailed information based on selected mower type.
- Continues prompting until the user enters 'S' to stop.

File Structure
CommercialMower.java
Engine.java
GasPoweredMower.java
LawnTractor.java
Mower.java
MowerWareHouse.java
PushReelMower.java
WalkBehindMower.java
Main.java
