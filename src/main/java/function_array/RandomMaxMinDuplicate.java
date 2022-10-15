package function_array;


//7. Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any)


public class RandomMaxMinDuplicate {


    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int arrMin = 100;
        int arrMax = 1;
        int[] arr = new int[20];

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = (int)(Math.random() * (double)(max - min + 1) + (double)min);
            if (arrMax < arr[i]) {
                arrMax = arr[i];
            }

            if (arrMin > arr[i]) {
                arrMin = arr[i];
            }
        }

        System.out.println("Max Number: " + arrMax + "\nMin Number: " + arrMin);
        duplicate(arr);
    }

    public static void duplicate(int[] arr) {
        System.out.println("Duplicate Number(s):");

        for(int i = 0; i < arr.length; ++i) {
            for(int j = i + 1; j < arr.length; ++j) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }

    }
}

