package string_manipulation;


//3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?


public class LaptopPrice {

    public static void main(String[] args) {
        String str = "Core i 7 HP laptop price is 76000 tk and cash payment discount 10%";

        str = str.replaceAll("[^\\d]"," ").trim();
        str = str.replaceAll(" +"," ");
        String[] arr = str.split(" ");

        double original_price = Double.parseDouble(arr[1]);
        double discount_percent = Double.parseDouble(arr[2])/100;

        double discounted_price = original_price - (original_price*discount_percent);

        System.out.println("Laptop price after 10% discount :" + discounted_price);
    }
}
