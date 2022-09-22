package LabSheet3.Exercise2;

import LabSheet3.Exercise1.Computer;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output ="";

        LabSheet3.Exercise1.Computer c1 = new LabSheet3.Exercise1.Computer();

        output += "Calling the no-argument Computer constructor. " +
                "The first Computer object details are: \n\n" + c1.toString();

        LabSheet3.Exercise1.Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);

        c2.getSpeed(-3.15);

        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The second Computer object details are: \n\n" +c2.toString();

        JOptionPane.showMessageDialog(null,output,"Computer Object Data", JOptionPane.INFORMATION_MESSAGE); System.exit(0);
    }
}
