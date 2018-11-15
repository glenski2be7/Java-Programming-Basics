package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int ticketPrice = 10;
        int age = 61;
        boolean isStudent = false;
        if (age <= 15) {
            ticketPrice = 5;
        } else if (age > 60) {
            ticketPrice = 5;
        } else if (isStudent) {
            ticketPrice = 5;
        }
        System.out.println("Ticket cost " + ticketPrice + "$.");

        //Nested if Statements
        boolean action = true;
        boolean romance = true;
        boolean horror = true;
        boolean comedy = false;
        if (action && romance) {
            //includes action and romance
            System.out.println("This movie include action and romance.");
            if (comedy || horror) {
                //everyone's preferences have been met!
                System.out.println("This also incudes comedy or horror!");
            }
        }
    }
}
