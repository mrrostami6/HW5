package TizPa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean condition = true;
        while (condition){
            System.out.println("1 --> Calculate Travel Cost \n2 --> Exit");
            System.out.println("Enter A Number To Continue : ");
            int order = scan.nextInt();
            if (order == 1)
                Client.trip();
            else if (order == 2)
                condition = false;
            else
                System.out.println("Please Enter A Valid Number...\n\n");
        }
    }
}
