package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isLightGreen=true; // true or false
        boolean isLightYellow=false; // true or false

        if (isLightGreen){
            System.out.println("Drive!");
        } else if (isLightYellow){
            System.out.println("Slow down.");
        } else {
            System.out.println("Stop.");
        }
    }
}
