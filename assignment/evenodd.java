
import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("the given number is even: " + a);

        } else {
            System.out.println("the number is odd: " + a);
        }
    }
}
