package string_manipulation;

//4. Writea program that will give following output:
//        Input: chattogram
//        Output: C8M

import java.util.Scanner;

public class StringShortner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any string to be shorten:");
        String str = input.next();

        getShortner(str);


    }

    public static void getShortner(String str){

        String start = String.valueOf(str.charAt(0)).toUpperCase();

        int len = str.length() - 2;

        String last = String.valueOf(str.charAt(str.length() - 1)).toUpperCase();

        System.out.println(start + len + last);
    }
}
