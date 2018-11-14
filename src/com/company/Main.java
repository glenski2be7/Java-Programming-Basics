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
    }
}
