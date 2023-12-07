package projecteuler.problems;

import projecteuler.problems.Problem;
import projecteuler.problems.Answer;
import projecteuler.MethodLibrary;

/** Solution to Problem 3 of Project Euler
  * Program by Valentin Ringlet
  * See https://projecteuler.net/problem=3 for more details
  *
  * Answer: 6 857
  */

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Problem003 extends Problem {
    /** Constructor, sets the problem number to 3
      */
    public Problem003 () {
        super(3);
    }

    /** Computes the answer to Problem 2
      * which is the largest prime factor of the number 600851475143
      */
    protected Answer solveProblem () {
        long startTime = System.currentTimeMillis();
        long n = 600851475143L;
        Map<Integer, Integer> primeFactors = MethodLibrary.computePrimeFactorDecomposition(n);

        int maxPrimeFactor = findMaxKeyOfMap(primeFactors);
        long endTime = System.currentTimeMillis();

        return new Answer(maxPrimeFactor, (endTime-startTime)/1000.0);
    }

    /** Finds and returns the biggest key of the given map
      *
      * @param map, the map whose keys we compare to find the max
      *
      * @return the biggest key of the given map
      */
    private int findMaxKeyOfMap (Map<Integer, Integer> map) {
        Iterator iterator = map.keySet().iterator();
        int maxItem = (int)iterator.next();

        while (iterator.hasNext()) {
            int next = (int)iterator.next();

            if (next > maxItem) {
                maxItem = next;
            }
        }

        return maxItem;
    }
}