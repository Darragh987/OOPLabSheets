package LabSheet1;
import javax.swing.JOptionPane;

public class Exercise3 {
    public static void main(String[] args) {

        String name, course;
        int snacks, cost = 0;

        name = JOptionPane.showInputDialog("Please enter your name");

        course  = JOptionPane.showInputDialog("Please enter your course");

        snacks = Integer.parseInt(JOptionPane.showInputDialog("How many snacks would you like"));

        cost = snacks*2;



        JOptionPane.showMessageDialog(null,"Name: " + name + "\n" + "Course: " + course +
                                      "\nSnacks: " + snacks + "\nCost: " + cost);

    }
}
