package projecteuler.problems;

import projecteuler.problems.Problem;
import projecteuler.problems.Answer;

/** Solution to Problem 2 of Project Euler
  * Program by Valentin Ringlet
  * See https://projecteuler.net/problem=2 for more details
  *
  * Answer: 4 613 732
  */

public class Problem002 extends Problem {
    /** Constructor, sets the problem number to 2
      */
    public Problem002 () {
        super(2);
    }

    /** Computes the answer to Problem 2
      * which is the sum of the terms of the Fibonacci sequence under 4 000 000
      */
    protected Answer solveProblem () {
        long startTime = System.currentTimeMillis();
        int upperLimit = 4000000;

        int f1 = 1;
        int f2 = 2;
        int total = 0;
        while (f1 < upperLimit) {
            if (f2%2 == 0) {
                total += f2;
            }

            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        long endTime = System.currentTimeMillis();

        return new Answer(total, (endTime-startTime)/1000.0);
    }
}