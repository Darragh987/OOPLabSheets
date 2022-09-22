package LabSheet1;

import javax.swing.*;

public class Exercise4 {
    public static void main(String[] args) {

        String name;
        int kM=0;
        final double lowerRate=1.75;
        final double higherRate=2.50;
        double cost;

        name = JOptionPane.showInputDialog("Please enter your name");

        kM = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of km cycled"));

        if(kM <= 10)
            cost = lowerRate*kM;
        else
            cost = lowerRate*10 + higherRate*(kM-10);

        JOptionPane.showMessageDialog(null,"Name: " + name + "\nDistance Cycled: " + kM +
                "\nSponsorship amount due: " + String.format("%.2f",cost), "Receipt",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);


    }
}
