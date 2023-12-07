package projecteuler;

import projecteuler.problems.*;

public class ProblemFactory {
    // Array containing all problems resolved so far
    private static Problem[] problems = {
        new Problem001(), new Problem002()
    };

    /** Executes a given problem
      *
      * @param problemNumber, the number of the problem to be executed
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
        System.out.print("Available problems are: \n[");

        for (int i = 0; i <= problems.length-2; i ++) {
            System.out.print(problems[i].getProblemNumber() + ", ");
        }
        System.out.println(problems[problems.length-1].getProblemNumber() + "]");
    }
}
