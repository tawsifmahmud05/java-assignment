package function_array;


//6. Suppose a software system excepts valid credentials from user to logged in to the system.
//        if the user inputs wrong password for 3 times, system will say that
//        "Your user has been temporary locked". Let the username: admin, password: admin@123


import java.util.Scanner;

public class AdminLogin {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "admin";
        String password = "admin@123";
        System.out.println("Enter Username:");
        String usernameInput = input.next();
        System.out.println("Enter Password:");

        for(int i = 2; i >= 0; --i) {
            String passwordInput = input.next();
            if (passwordInput.equals(password)) {
                System.out.println("Successfully Logged in!");
                break;
            }

            if (i == 0) {
                System.out.println("Your account as been temporary locked");
                break;
            }

            System.out.println("Password is Wrong! You can try only " + Integer.toString(i) + " time to avoid temporary lock");
        }

    }
}
