package function_array;


//2. Input an amount from the user and find out the number of notes from input amount in given array
//        [1000,500,100,50,20,10,5,2,1]
//        Input: 1256
//        Output:
//        1000 1
//        100 2
//        50 1
//        5 1
//        1 1


import java.util.Scanner;

public class NumberOfNotes {


    public static void main(String[] argc) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount:");
        int amount = input.nextInt();
        NumberOfNotes numberOfNotes = new NumberOfNotes();
        numberOfNotes.countNotes(amount);
    }

    public void countNotes(int amount) {
        int[] notes = new int[]{1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int[] countNote = new int[9];

        int i;
        for(i = 0; i < 9; ++i) {
            if (amount >= notes[i]) {
                countNote[i] = amount / notes[i];
                amount %= notes[i];
            }
        }

        System.out.println("Currency Count :");

        for(i = 0; i < 9; ++i) {
            if (countNote[i] != 0) {
                System.out.println(notes[i] + " : " + countNote[i]);
            }
        }

    }
}
