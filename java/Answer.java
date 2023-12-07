package projecteuler.problems;

/** This class represents an answer to a Problem
  */
public class Answer {
    public StringBuilder answer;

    /** Constructor for the Answer with an integer as starting item
      */
    public Answer (int intAnswer) {
        this(Integer.toString(intAnswer));
    }

    /** Constructor for the Answer with a long as starting item
      */
    public Answer (long longAnswer) {
        this(Long.toString(longAnswer));
    }

    /** Constructor for the Answer with a string as starting item
      */
    public Answer (String stringAnswer) {
        answer = new StringBuilder(stringAnswer);
    }

    /** Appends a string to the current answer
      *
      * @param str, the string to append to the answer
      */
    public void append (String str) {
        answer.append(str);
    }

    /** Appends an integer to the current answer
      *
      * @param n, the integer to append to the answer
      */
    public void append (int n) {
        answer.append(n);
    }

    /** Appends a long to the current answer
      *
      * @param n, the long to append to the answer
      */
    public void append (long n) {
        answer.append(n);
    }

    /** Returns a string representation of the answer
      */
    public String toString () {
        return answer.toString();
    }
}
