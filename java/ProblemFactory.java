package projecteuler;

import projecteuler.problems.*;

public class ProblemFactory {
    // Array containing all problems resolved so far
    private static Problem[] problems = {new Problem1() /*, new Problem2(), new Problem3(), new Problem4(), new Problem5(), new Problem6(), new Problem7(), new Problem8(), new Problem9(), new Problem10(),
        new Problem11(), new Problem12(), new Problem13(), new Problem15() */};

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
