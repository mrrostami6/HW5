package TizPa;

import java.util.Random;
import java.util.Scanner;

public class Client {
    public static void trip() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        // define variables out of scope and initialize in the scope
        int currentZone;
        int destination;
        int zonePrice;
        // error handling for array out of bound exception
        while (true) {
            try {
                System.out.println("Which Zone Are You Now ? ");
                currentZone = scan.nextInt();
                System.out.println("Which Zone do you Want to go ? ");
                destination = scan.nextInt();

                // gereftan zarib fasele ha
                zonePrice = Ratio.TRIPPRICE[currentZone][destination];
                break;
            } catch (Exception e) {
                System.out.println("Please Enter A valid Number !!!\n\n");
            }
        }
        // define variable out of scope and initialize in the scope
        double finalPrice;

        while (true) {
            // get travel method from user
            System.out.println("Which Method Do You Want to Travel ? (Enter a number)");
            System.out.println("Method Guide : \n0 --> Egtesadi \n1 --> Vizhe \n2 --> Motor");
            int travelMethod = scan.nextInt();

            // error handling for array out of bound exception
            try {

                // gereftan method safar
                // using random for weather condition
                double ratio = Ratio.TRIPMETHOD[travelMethod][random.nextInt(3) + 1];
                zonePrice *= Ratio.TRIPMETHOD[travelMethod][0];
                finalPrice = zonePrice * ratio;
                break;
            } catch (Exception e) {
                System.out.println("Please Enter A valid number ...\n\n");
            }
        }
        // print the result
        System.out.printf("\n\nYour Travel Costs : %.0f Toman.\n\n%n",finalPrice);

    }
}
