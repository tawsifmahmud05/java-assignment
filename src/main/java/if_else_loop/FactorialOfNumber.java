


//6. Write  a program to find the factorial of a given number

package if_else_loop;

import java.util.Scanner;

public class FactorialOfNumber {
    public FactorialOfNumber() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
        factorialOfNumber.getFactorial(num);
    }

    public void getFactorial(int num) {
        int fact = 1;

        for(int i = 1; i <= num; ++i) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " : " + fact);
    }
}

