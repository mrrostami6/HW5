package TrainingHW5;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your number : ");
        long number = scan.nextLong();
        if (isPrime(number, 2) == 1 && number != 1 || number == 2)
            System.out.println("Yes it's a prime number...");
        else
            System.out.println("No it's not a prime number...");
    }

    public static int isPrime(long number, int counter) {
        if (counter < number) {
            if (number % counter != 0)
                return isPrime(number, ++counter);
            else
                return 0;
        }
        return 1;
    }
}