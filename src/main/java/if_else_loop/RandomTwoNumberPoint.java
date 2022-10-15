


//8. Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers.
//        If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved.

package if_else_loop;

import java.util.Scanner;

public class RandomTwoNumberPoint {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int point = 0;
        int min = 1;
        int max = 10;
        System.out.println("Try 10 times to guess number and get points");

        for(int i = 0; i < 10; ++i) {
            int rand1 = (int)(Math.random() * (double)(max - min + 1) + (double)min);
            int rand2 = (int)(Math.random() * (double)(max - min + 1) + (double)min);
            System.out.println("Guess a number between 1 to 10:");
            int n = input.nextInt();
            if (n == rand1 || n == rand2) {
                ++point;
            }

            System.out.println("Guess Point : " + point);
        }

    }
}
