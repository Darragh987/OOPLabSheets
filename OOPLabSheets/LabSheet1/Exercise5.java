package LabSheet1;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        float massOtherPlanet, massEarth, radiusEarth, radiusOtherPlanet;
        final double g=9.81;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the mass of planet Earth: ");
        massEarth = input.nextFloat();
        System.out.println("Please enter the radius of planet Earth: ");
        radiusEarth = input.nextFloat();
        System.out.println("Please enter the mass of the other planet: ");
        massOtherPlanet = input.nextFloat();
        System.out.println("Please enter the radius of the other planet: ");
        radiusOtherPlanet = input.nextFloat();

        System.out.print("The acceleration due to gravity on the other planet is " +
                (g*massOtherPlanet)*(radiusEarth*radiusEarth)/massEarth*(radiusOtherPlanet*radiusOtherPlanet));
    }
}
