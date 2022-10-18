package string_manipulation;

//2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk.
//        If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?

public class ShirtShareePrice {

    public static void main(String[] args) {
        String str = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted.";
        str = str.replaceAll("[^\\d]"," ").trim();
        str = str.replaceAll(" +"," ");
        String[] arr = str.split(" ");
        double shirt_price = Double.parseDouble(arr[0]);
        double sharee_price = Double.parseDouble(arr[1]);

        double shirt_quantity = Double.parseDouble(arr[2]);
        double sharee_quantity = Double.parseDouble(arr[3]);

        double discount = Double.parseDouble(arr[4]);

        double total_cost = (shirt_quantity*shirt_price) + (sharee_quantity*sharee_price) - discount;

        System.out.println("Total Cost :" + total_cost);

    }
}
