//Take 2 numbers as input and print the largest number.
//Input currency in rupees and output in USD.

import java.util.Scanner;

public class largenum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number1: ");
        int a = input.nextInt();
        System.out.println("enter the number2: ");
        int b = input.nextInt();
        System.out.println("enter the Indian currency:");
        float inr = input.nextInt();
        float usd = inr / 83;
        System.out.println("Indian currency in USD:$" + usd);
        if (a > b) {
            System.out.println("The largest number is: " + a);
        } else {
            System.out.println("INVALID");
        }

    }
}
