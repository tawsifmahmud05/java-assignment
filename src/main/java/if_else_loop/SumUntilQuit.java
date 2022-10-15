


//9. Write a program to sum of user input until users input ‘q’ from keyboard
package if_else_loop;

import java.util.Scanner;

public class SumUntilQuit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int sum = 0;

        while(flag) {
            System.out.println("Enter any number to sum OR enter 'q' to exit");
            String n = input.next();
            if (n.equals("q")) {
                flag = false;
                break;
            }

            sum += Integer.parseInt(n);
            System.out.println("Sum is :" + sum);
        }

    }
}

