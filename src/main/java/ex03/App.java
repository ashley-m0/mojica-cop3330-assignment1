package ex03;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 3 - Printing Quotes:

Quotation marks are often used to denote the start and end of a string. But sometimes we need to print
out the quotation marks themselves by using escape characters.

Create a program that prompts for a quote and an author. Display the quotation and author as shown in
the example output.

Example Output:
What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."

Constraints:
-Use a single output statement to produce this output, using appropriate string-escaping techniques
 for quotes.
-If your language supports string interpolation or string substitution, don’t use it for this exercise.
 Use string concatenation instead.

Challenge:
Modify this program so that instead of prompting for quotes from the user, you create a structure that
holds quotes and their associated attributions and then display all of the quotes using the format in
the example. An array of maps would be a good choice.
 */

import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);

    public static void main(String[]args) {
        App myApp = new App();

        //Get user input
        String quote = myApp.getQuote();
        String speaker = myApp.getSpeaker();

        //Concatenate string
        String message = myApp.generateMessage(quote, speaker);

        //Print output
        myApp.printMessage(message);
    }

    public String getQuote () {
        System.out.println("What is the quote?");
        String quote = input.nextLine();
        return quote;
    }

    public String getSpeaker(){
        System.out.println("Who said it?");
        String speaker = input.nextLine();
        return speaker;
    }

    public String generateMessage(String quote, String speaker){
        return speaker + " says, \"" + quote + "\"" ;
    }

    public void printMessage(String message){
        System.out.println(message);
    }

}

