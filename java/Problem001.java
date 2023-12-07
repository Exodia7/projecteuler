package projecteuler.problems;

import projecteuler.problems.Problem;
import projecteuler.problems.Answer;

/** Solution to Problem 1 of Project Euler
  * Program by Valentin Ringlet
  * See https://projecteuler.net/problem=1 for more details
  *
  * Answer: 233 168
  */

public class Problem001 extends Problem {
    /** Constructor, sets the problem number to 1
      */
    public Problem001 () {
        super(1);
    }

    /** Computes the answer to Problem 1
      * which is the sum of all numbers below 1000 that are multiples of 3 or 5
      */
    protected Answer solveProblem () {
        long startTime = System.currentTimeMillis();
        int sum = 0;
        int upperLimit = 1000;

        for (int i = 1; i < upperLimit; i ++) {
            if (((i%3) == 0) || ((i%5) == 0)) {
                sum += i;
            }
        }
        long endTime = System.currentTimeMillis();

        return new Answer(sum, (endTime-startTime)/1000.0);
    }
}
