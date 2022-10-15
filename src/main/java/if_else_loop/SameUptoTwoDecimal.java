


//3. Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241
package if_else_loop;

import java.util.Scanner;

public class SameUptoTwoDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first floating point number: ");
        double num1 = input.nextDouble();
        System.out.print("Input second floating point number: ");
        double num2 = input.nextDouble();
        SameUptoTwoDecimal sameUptoTwoDecimal = new SameUptoTwoDecimal();
        sameUptoTwoDecimal.checkValue(num1, num2);
    }

    public void checkValue(double num1, double num2) {
        if (Math.abs(num1 - num2) <= 0.01) {
            System.out.println("These numbers are the same.");
        } else {
            System.out.println("These numbers are different.");
        }

    }
}

