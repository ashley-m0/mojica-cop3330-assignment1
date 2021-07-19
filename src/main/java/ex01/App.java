package ex01;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 1 - Saying Hello

Create a program that prompts for your name and prints a greeting using your name.

Example Output:
What is your name? Brian
Hello, Brian, nice to meet you!

Constraint:
Keep the input, string concatenation, and output separate.

Challenges:
Write a new version of the program without using any variables.
Write a version of the program that displays different greetings for different people.
Write a version of the program that displays the greeting in a GUI window.
 */

import java.util.Scanner;

public class App
{
    //Class Variable
    static Scanner INPUT = new Scanner(System.in);

    public static void main( String[] args )
    {
        App myApp = new App();

        //Get user input
        String name = myApp.readName();

        //Concatenate string
        String outputString = myApp.generateOutputString(name);

        //Print output
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readName() {
        System.out.println( "What is your name?" );
        String name = INPUT.nextLine();
        return name;
    }

    public String generateOutputString(String name) {
        return "Hello, " + name + ", nice to meet you!";
    }

}