package function_array;


//5. Take 5 numbers from users in an array.
//        Then find out the average number, how many even and how
//        many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers()


import java.util.Scanner;

public class AvgEvenOdd {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter any 5 number:");

        for(int i = 0; i < arr.length; ++i) {
            System.out.println("Number " + Integer.toString(i + 1));
            int num = input.nextInt();
            arr[i] = num;
        }

        average(arr);
        countEvenNumbers(arr);
        countOddNumbers(arr);
    }

    public static void average(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }

        System.out.println("Average :" + sum / arr.length);
    }

    public static void countEvenNumbers(int[] arr) {
        int c = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0) {
                ++c;
            }
        }

        System.out.println("Even Number Count : " + c);
    }

    public static void countOddNumbers(int[] arr) {
        int c = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 != 0) {
                ++c;
            }
        }

        System.out.println("Odd Number Count : " + c);
    }
}

