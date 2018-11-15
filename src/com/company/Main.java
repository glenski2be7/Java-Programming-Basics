package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int rating = 2;
        if (rating >= 0 && rating <= 5) {
            //rating is 0-5
            if (rating <= 2) {
                //rating is less than or equal to 2
                System.out.println("What's the reason for your low rating?");
            }
            System.out.println("Thank you for your feedback.");
        }
    }
}
