package projecteuler;

//For the prime factor decomposition
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

/** A collection of generally useful methods.
  */
public class MethodLibrary {
    /** Default constructor for this class
      * Does nothing for now
      */
    public MethodLibrary () {
    }

    /** Returns the prime factor decomposition of the given long number
      *
      * @param n, the number whose prime factor decomposition we compute
      */
    public static Map<Integer, Integer> computePrimeFactorDecomposition (long n) {
        Map<Integer, Integer> primeFactorDecomp = new HashMap<Integer, Integer>();

        int primeFactor = 2;
        while (n > 1) {
            if (n%primeFactor == 0) {
                n = n/primeFactor;
                
                int oldCount = 0;
                if (primeFactorDecomp.containsKey(primeFactor)) {
                    oldCount = primeFactorDecomp.get(primeFactor);
                }
                
                primeFactorDecomp.put(primeFactor, oldCount + 1);
            }
            else {
                primeFactor ++;
            }
        }

        return primeFactorDecomp;
    }

    /** Multiplies all the prime factors from the prime factor decomposition together and returns the result
      */
    public static long getNumberFromPrimeFactorDecomposition (Map<Integer, Integer> map) {
        Iterator iterator = map.keySet().iterator();
        long total = 1;

        //For each key,
        while (iterator.hasNext()) {
            //Save it
            int primeFactor = (int)iterator.next();

            //And repeat as many times as its value in the map
            for (int i = 0; i < map.get(primeFactor); i ++) {
                //Multiply the total result by the primeFactor
                total *= primeFactor;
            }
        }

        return total;
    }

    /** Computes the number of different divisors of a given number based on the map representing its prime factor decomposition
      * Based on the theorem that the number of divisors of a number is, given a prime factor decomposition with prime factors p_i raised to powers s_i:
      * Multiplication for all i's of (s_i + 1)
      * see https://www.quora.com/How-do-I-calculate-the-number-of-divisors-by-the-prime-factors
      *
      * @param map, the map representing a prime factor decomposition
      */
    public static int numberDivisors(Map primeFactorDecomp) {
        int numDivs = 1;
        Iterator i = primeFactorDecomp.values().iterator();

        while (i.hasNext()) {
            numDivs *= ((int)i.next() + 1);
        }

        return numDivs;
    }

    /** Computes the number of different divisors of a given number
      */
    public static int numberDivisors(long n) {
        Map<Integer, Integer> primeFactorDecomposition = computePrimeFactorDecomposition(n);

        return numberDivisors(primeFactorDecomposition);
    }
}