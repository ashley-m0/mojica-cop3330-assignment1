package ex04;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 4 - Mad Lib

Mad libs are a simple game where you create a story template with blanks for words. You, or another
player, then construct a list of words and place them into the story, creating an often silly or funny
story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects
those into a story that you create.

Example Output:
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!

Constraints:
Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.

Challenges:
Add more inputs to the program to expand the story.
Implement a branching story, where the answers to questions determine how the story is constructed.
 */

import java.util.Scanner;

public class App
{
    static Scanner input = new Scanner(System.in);
    public static void main( String[] args )
    {
        App myApp = new App();

        //Get user input
        String noun = myApp.getNoun();
        String verb = myApp.getVerb();
        String adj = myApp.getAdjective();
        String adv = myApp.getAdverb();

        //Concatenate string
        String message = myApp.generateMessage(noun, verb, adj, adv);

        //Print output
        System.out.println(message);
    }

    public String getNoun(){
        System.out.print( "Enter a noun: " );
        String noun = input.nextLine();
        return noun;
    }

    public String getVerb(){
        System.out.print( "Enter a verb: " );
        String verb = input.nextLine();
        return verb;
    }

    public String getAdjective(){
        System.out.print( "Enter a adjective: " );
        String adjective = input.nextLine();
        return adjective;
    }

    public String getAdverb(){
        System.out.print( "Enter a adverb: " );
        String adverb = input.nextLine();
        return adverb;
    }

    public String generateMessage(String noun, String verb, String adj, String adv){
        return String.format("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adv);
    }
}
