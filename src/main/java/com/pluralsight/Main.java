package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //initial question
        System.out.println("Which calculator would you like to use?");
        System.out.println("(1) Mortgage Calculator");
        System.out.println("(2) Compound Interest Calculator");

        //create new scanner, answer first question
        Scanner stanley = new Scanner(System.in);
        String input1 = stanley.nextLine();

        //procedures for answer to first question
        if (input1.equals("1")){

            //user input
            System.out.println("Enter your loan amount");
            int principal = stanley.nextInt();
            System.out.println("Enter your interest rate (in decimal form)");
            float rate = stanley.nextFloat();
            System.out.println("Enter your loan term (in years)");
            int term = stanley.nextInt();

            //calculations
            float totalPayment = principal * rate * term;
            float totalInterest = totalPayment - principal;
            int timeInMonths = term * 12;
            float monthlyPayment = totalPayment / timeInMonths;

            //clean up answers for output
            double freshen1 = (int) (totalInterest * 100) / 100.0;
            double freshen2 = (int) (monthlyPayment * 100) / 100.0;

            //final output
            System.out.println("your total interest paid is $" + freshen1);
            System.out.println("your monthly payment is $" + freshen2);

        } else if (input1.equals("2")) {

            //user input
            System.out.println("Enter your initial deposit");
            int initialDeposit = stanley.nextInt();
            System.out.println("Enter your interest rate (in decimal form)");
            double rate2 = stanley.nextDouble();
            System.out.println("Enter the time until maturity (in years)");
            int maturity = stanley.nextInt();

            //calculations
            double futureValue = initialDeposit * Math.pow(1 + (rate2 / 365), 365 * maturity);
            double interestEarned = futureValue - initialDeposit;

            //clean up answers for output
            double freshen1 = (int) (futureValue * 100) / 100.0;
            double freshen2 = (int) (interestEarned * 100) / 100.0;

            //final output
            System.out.println("The future value of your CD will be $" + freshen1);
            System.out.println("The total interest earned is $" + freshen2);
        }else {
            System.out.println("Please enter '1' or '2'");
        }
    }
}