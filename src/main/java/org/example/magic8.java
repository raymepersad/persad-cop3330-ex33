/*
 *  UCF COP3330 Summer 2021 Assignment 27 Solution
 *  Copyright 2021 RAYME PERSAD
 */

/*
Create a Magic 8 Ball game that prompts for a question
and then displays either "Yes," "No," "Maybe," or "Ask again later."
 */




package org.example;

public class magic8 {

    // declaring the random instance, use static to "save" the value when using in main
    static int rand= (int)(Math.random() * 8);

    public static void main(String[] args) {

        // run the code in main and print out the randomly decided fortune-telling
        switch(rand) {

            case 0:
                System.out.println("Yes");
                break;
            case 1:
                System.out.println("No");
                break;
            case 2:
                System.out.println("Ask Again Later");
                break;
            case 3:
                System.out.println("Yes");
                break;
            case 4:
                System.out.println("No");
                break;
            case 5:
                System.out.println("Ask Again Later");
                break;
            case 6:
                System.out.println("Yes");
                break;
            case 7:
                System.out.println("No");
                break;
            default:
                System.out.println("Ask AGain Later");
                break;
        }
    }
}
