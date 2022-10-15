


//7. Write a program to print prime numbers from 2 to n
package if_else_loop;

import java.util.Scanner;

public class PrimeNumber {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter max number: ");
        int n = input.nextInt();
        System.out.println("Prime number between 1 - " + n + ":");

        for(int i = 2; i <= n; ++i) {
            boolean isPrime = true;

            for(int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }

    }
}
