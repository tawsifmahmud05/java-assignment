package function_array;


//1.Take input from a user and check if the number exists in the array
//        let the array is [1,3,5,7,2,4,6,8]
//        Input: 7
//        Output: Found in the position 3
//        Input: 9
//        Output: Found no element


import java.util.Scanner;

public class SearchNumberInArray {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[]{1, 3, 5, 7, 2, 4, 6, 8};
        System.out.println("Enter number to Search : ");
        int n = input.nextInt();
        SearchNumberInArray searchNumberInArray = new SearchNumberInArray();
        searchNumberInArray.search(arr, n);
    }

    public void search(int[] arr, int n) {
        int index = -1;

        for(int i = 0; i < arr.length; ++i) {
            if (n == arr[i]) {
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("Found no element");
        } else {
            System.out.println("Found in the position " + index);
        }

    }
}

