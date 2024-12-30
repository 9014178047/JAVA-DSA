
import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the fist number:");
        float a = input.nextFloat();
        System.out.println("enter the second number:");
        float b = input.nextFloat();
        if (a > b) {
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a / b);
        } else {
            System.out.println(a * b);

        }

    }
}
