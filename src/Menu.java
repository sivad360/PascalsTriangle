//Name: Davis Tyler
//Project: Pascal's Triangle
//Class: Cs145
//Project Description:
//  This Program Prints out a visual representation of pascals Triangle.
//
//File Description:
//  The Menu class contains static methods and is just used interact with the
//user. Does not call anything from the Triangle class.

import java.util.Scanner;

public class Menu {


    public static void welcome(){ // method which prints out the welcome message.

        System.out.printf("%n%s%n%n%s%s%n%s%s%n"
        ,"Welcome to the Pascal's Triangle Program"
        ,"This program prints a Pascal's Triangle with a specified length to"
        ," the terminal."
        ,"Pascal's Triangle is a the triangular arrangement of"
        ,"numbers that gives the coefficients in the expansion of any binomial expression.");

    }



    public static int main(){ // method which prompts for and returns int
    // representing the desired length of Pascal's triangle. 

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n", "please enter 'c' to continue or 'q' to close the program");

        char inputChar = input.nextLine().charAt(0);

        int length = 0;

        if(inputChar == 'c') {

        System.out.printf("%s%n", "please enter the number of rows:");

        length = input.nextInt();

        return length;

        } else if( inputChar == 'q') {
            System.exit(0);
        }

        return length;

    }


    
}
