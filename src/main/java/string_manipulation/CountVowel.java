package string_manipulation;

//5. Write a program that will count how many vowels in the given string:
//        "roadtosdet"
//        Output: 4



import java.util.Scanner;

public class CountVowel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = input.next().toLowerCase();

        getVowel(str);


    }

    public static void getVowel(String str){

        int count = 0;

        for (int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }

        System.out.println("Number of Vowel(s) : "+count);

    }
}
