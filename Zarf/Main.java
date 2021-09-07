package TrainingHW5.Zarf;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Container container1 = new Container(10);
        container1.addNumber(2);
        for (int i = 1; i < 10; i++)
            container1.addNumber(random.nextInt(100));

        System.out.println(container1.findElement(2));
        System.out.print("Array before sort : ");
        for (int num : container1.getListOfNumbers())
            System.out.print(num + " ");

        System.out.println();
        container1.sort();
        container1.removeElement(3);

        System.out.print("Array after sort : ");
        for (int num : container1.getListOfNumbers())
            System.out.print(num + " ");

    }
}
