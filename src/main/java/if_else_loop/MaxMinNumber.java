


//10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.

package if_else_loop;

import java.util.Scanner;

public class MaxMinNumber {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        char c;
        do {
            System.out.print("Enter number :");
            int n = input.nextInt();
            if (n > max) {
                max = n;
            }

            if (n < min) {
                min = n;
            }

            System.out.print("Do you want to continue y/n? ");
            c = input.next().charAt(0);
        } while(c == 'Y' || c == 'y');

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}
