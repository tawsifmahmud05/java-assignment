package string_manipulation;

//1. Extract the transaction ID from the HTML body
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>



public class ExtractID {

    public static void main(String[] args) {
        String str = "<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";


        getTxnId(str);


    }

    public static void getTxnId(String str){

        str = str.split("\n")[3].trim();

        str = str.substring(str.indexOf("TXN"));

        System.out.println(str);
    }
}
