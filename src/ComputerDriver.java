

import javax.swing.*;

public class ComputerDriver {
    public static Computer[] computers = new Computer[2];
    public static void main(String[] args) {
        //Laptop laptop = addLaptop();
        //JOptionPane.showMessageDialog(null, laptop.toString());
        //laptop.setID("12345");
        //JOptionPane.showMessageDialog(null, laptop.toString());
        populateComputerArray();
        //System.out.println(computers[0].toString());
        displayComputerArray();
    }

    public static Laptop addLaptop(){
        String make = JOptionPane.showInputDialog(null, "Enter the make of the laptop");
        String memType = JOptionPane.showInputDialog(null, "Enter the type of memory");
        int memSize = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the size of memory"));
        boolean tScreen = (JOptionPane.showConfirmDialog(null, "Is laptop touchscreen", "Touch Screen?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
        Laptop laptop = new Laptop(make, memType, memSize, tScreen);
        return laptop;
    }

    public static Computer addComputer(){
        String make = JOptionPane.showInputDialog(null, "Enter the make of the computer");
        String memType = JOptionPane.showInputDialog(null, "Enter the type of memory");
        int memSize = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the size of memory"));
        Computer computer = new Computer(make, memType, memSize);
        return computer;
    }

    public static void populateComputerArray(){
        for (int i=0; i<computers.length; i++){
            if(JOptionPane.showConfirmDialog(null, "Is this computer a laptop", "Laptop?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                computers[i] = addLaptop();
            }
            else{
                computers[i] = addComputer();
            }
        }
    }

    public static void displayComputerArray(){
        for (int i=0; i<computers.length;i++){
            JOptionPane.showMessageDialog(null, computers[i].toString());
        }
    }
}
