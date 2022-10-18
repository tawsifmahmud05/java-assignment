package string_manipulation;

//6. Replace "R" from Rahim with "F" from the given String:
//        Input: Ratul and Rahim lives in Rangpur
//        Output: Ratul and Fahim lives in Rangpur

public class ReplaceRtoF {

    public static void main(String[] args) {

        String str = "Ratul and Rahim lives in Rangpur";

        String replace = str.split(" ")[2].replace("R","F");

        str = str.replace("Rahim",replace);

        System.out.println(str);
    }
}
