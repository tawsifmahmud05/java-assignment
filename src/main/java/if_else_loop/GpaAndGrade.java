


//2. Write a program to calculate GPA and find grade
package if_else_loop;

import java.util.Scanner;

public class GpaAndGrade {
    public GpaAndGrade() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Subjects:");
        int n = input.nextInt();
        int[] marks = new int[n];
        float total = 0.0F;

        for(int i = 0; i < n; ++i) {
            System.out.print("Enter Marks of Subject " + (i + 1) + ":");
            marks[i] = input.nextInt();
            total += (float)marks[i];
        }

        GpaAndGrade gpaAndGrade = new GpaAndGrade();
        gpaAndGrade.findGpaGrade(total, n);
    }

    public void findGpaGrade(float total, int n) {
        int avg = (int)(total / (float)n);
        System.out.print("The student Grade is: ");
        if (avg >= 80) {
            System.out.print("A");
        } else if (avg >= 60 && avg < 80) {
            System.out.print("B");
        } else if (avg >= 40 && avg < 60) {
            System.out.print("C");
        } else {
            System.out.print("D");
        }

    }
}

