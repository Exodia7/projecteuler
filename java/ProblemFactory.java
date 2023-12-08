package projecteuler;

import projecteuler.problems.*;

public class ProblemFactory {
    // Array containing all problems resolved so far
    private static Problem[] problems = {
        new Problem001(), new Problem002(), new Problem003()
    };
    
    /** Checks if there is a problem with the given number.
      *
      * @param problemNumber the number of the problem to be found
      */
    public static boolean isAvailableProblemNumber(int problemNumber) {
        for (int i=0; i < problems.length; i++) {
            if (problems[i].getProblemNumber() == problemNumber) {
                return true;
            }
        }
        
        // if we reach this, it means no matching problem was found
        return false;
    }

    /** Executes a given problem
      *
      * @param problemNumber the number of the problem to be executed
      */
    public static void executeProblem (int problemNumber) {
        for (int i = 0; i < problems.length; i ++) {
            if (problems[i].getProblemNumber() == problemNumber) {
                problems[i].launch();
                break;
            }
        }
    }

    /** Displays all available problem numbers
      */
    public static void showProblemNumberOptions () {
        System.out.println("Available problems are:");

        for (int i = 0; i < problems.length; i ++) {
            System.out.println(" - Problem #" + problems[i].getProblemNumber());
        }
    }
}
