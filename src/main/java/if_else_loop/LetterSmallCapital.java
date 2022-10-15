


//1. Write a program to check if inputted letter is small or capital

package if_else_loop;

import java.util.Scanner;

public class LetterSmallCapital {
    public LetterSmallCapital() {
    }

    public static void main(String[] args) {
        System.out.println("Enter char: ");
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        LetterSmallCapital letterSmallCapital = new LetterSmallCapital();
        letterSmallCapital.findLetterSmallCapital(c);
    }

    public void findLetterSmallCapital(char c) {
        if (c >= 'A' && c <= 'Z') {
            System.out.println("Capital Letter");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println("Small Letter");
        }

    }
}
