
import java.util.Scanner;

public class intrest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the Principal amount");
        float p = input.nextInt();
        System.out.println("enter the Annual Time");
        float t = input.nextInt();
        System.out.println("enter the Annual interest rate");
        float r = input.nextInt();
        float SI = (p * t * r) / 100;
        System.out.println("the simple intrest is: " + SI);

    }
}
