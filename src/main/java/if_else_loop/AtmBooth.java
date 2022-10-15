


//4. Write a program to check balance and withdraw money from ATM booth using if else or switch case

package if_else_loop;

import java.util.Scanner;

public class AtmBooth {
    public AtmBooth() {
    }

    public static void main(String[] args) {
        int balance = 10000;
        int withdrawAmount = 5000;
        int depositAmount = 2000;
        boolean flag = true;
        Scanner input = new Scanner(System.in);

        while(flag) {
            System.out.println("Choose the following number to execute your task:\n1. Display Balance\n2. Withdraw Amount\n3. Deposit Amount\n0. Exit ");
            int a = input.nextInt();
            switch (a) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    displayBalance(balance);
                    break;
                case 2:
                    balance = amountWithdrawing(balance, withdrawAmount);
                    break;
                case 3:
                    balance = amountDepositing(balance, depositAmount);
            }
        }

    }

    public static void displayBalance(int balance) {
        System.out.println("Current Balance : " + balance);
        System.out.println();
    }

    public static int amountWithdrawing(int balance, int withdrawAmount) {
        System.out.println("Withdrawn Operation:");
        System.out.println("Withdrawing Amount : " + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println("Please collect your money and collect the card");
            displayBalance(balance);
        } else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }

        return balance;
    }

    public static int amountDepositing(int balance, int depositAmount) {
        System.out.println("Deposit Operation:");
        System.out.println("Depositing Amount : " + depositAmount);
        balance += depositAmount;
        System.out.println("Your Money has been successfully deposited");
        displayBalance(balance);
        return balance;
    }
}