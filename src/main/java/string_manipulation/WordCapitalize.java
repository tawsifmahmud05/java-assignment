package string_manipulation;


//8. Write a program to convert each 1st char to uppercase from a string
//        Input: rahim lives in sylhet
//        Output: Rahim Lives in Sylhet


import java.util.Scanner;

public class WordCapitalize {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence : ");

//        String str = input.nextLine().trim();

        String str = "rahim lives in sylhet";
        System.out.println(str);

        String[] words = str.split(" ");

        for(int i=0;i<words.length;i++){
           String first = String.valueOf(words[i].charAt(0)).toUpperCase();
           String others = words[i].substring(1);

            System.out.println(first+others);
        }


    }

}
