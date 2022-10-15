package function_array;


//4.Create your today's bazaar list/pocket expenditure which includes the item name and price.
//        Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price.
//        If found no item, then print message as "No item found" and another function named totalSum() which will return total price of items.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class BazarList {


    public static void main(String[] args) {
        boolean flag = true;

        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> list = new HashMap();

        while(flag) {
            System.out.println("Choose the following number to execute your task:\n1. Add item to list \n2. Search in Bazaar list \n3. Total Amount\n0. Exit ");
            int c = input.nextInt();
            switch (c) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    list.putAll(addItem());
                    break;
                case 2:
                    System.out.println("Enter item name to search:");
                    String searchName = input.next();
                    String searchPrice = searchList(list, searchName);
                    System.out.println("Price of " + searchName + " is " + searchPrice);
                    break;
                case 3:
                    int totalPrice = totalPriceList(list);
                    System.out.println("Total Price of all items:" + totalPrice);
            }
        }

    }

    public static HashMap addItem() {
        boolean f = true;
        HashMap<String, Integer> list = new HashMap();
        Scanner input = new Scanner(System.in);
        System.out.println("Add Item name and price into the list OR Enter 'q' in name section to quit adding:");

        while(f) {
            System.out.println("Enter item name");
            String name = input.next();
            if (name.equals("q")) {
                break;
            }

            System.out.println("Enter item price");
            int price = input.nextInt();
            list.put(name, price);
        }

        return list;
    }

    public static String searchList(HashMap<String, Integer> list, String searchName) {
        return list.get(searchName) != null ? String.valueOf(list.get(searchName)) : "No item found";
    }

    public static int totalPriceList(HashMap<String, Integer> list) {
        int sum = 0;

        int i;
        for(Iterator var2 = list.values().iterator(); var2.hasNext(); sum += i) {
            i = (Integer)var2.next();
        }

        return sum;
    }
}

