package function_array;


//3. Suppose, in a company , here are some employee salaries in an array
//        [35000, 25000, 28000, 32500, 44000, 32800]
//        Find out the 3rd highest salary


import java.util.Arrays;

public class ThirdHighestSalary {

    public static void main(String[] args) {
        int[] arr = new int[]{35000, 25000, 28000, 32500, 44000, 32800};
        System.out.println("Finding Third Highest from : [35000, 25000, 28000, 32500, 44000, 32800]");
        ThirdHighestSalary thirdHighestSalary = new ThirdHighestSalary();
        thirdHighestSalary.getThirdHighest(arr, arr.length);
    }

    public void getThirdHighest(int[] arr, int n) {
        Arrays.sort(arr);
        System.out.println("Third Largest: " + arr[n - 3]);
    }
}

