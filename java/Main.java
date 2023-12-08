package projecteuler;

import java.util.Scanner;
import projecteuler.ProblemFactory;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to select one of the available problems
        boolean validInput = false;
        int problemNumber = -1;
        while (! validInput) {
            System.out.println("Which Problem would you like to execute?");
            ProblemFactory.showProblemNumberOptions();
            System.out.print("\nEnter the number: ");
            String userInput = in.next();
            try {
                problemNumber = Integer.parseInt(userInput);
                if (ProblemFactory.isAvailableProblemNumber(problemNumber)) {
                    validInput = true;
                }
                else {
                    System.out.println("Please provide a number corresponding to one of the listed choices");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter an integer number!");
            }

            System.out.println("\n-----------------------");
        }

        ProblemFactory.executeProblem(problemNumber);
    }
}