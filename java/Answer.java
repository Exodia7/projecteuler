package projecteuler.problems;

/** This class represents an answer to a Problem
  */
public class Answer {
    public StringBuilder answer;
    public double executionTime;

    /** Constructor for the Answer with an integer as starting item
      */
    public Answer (int intAnswer, double time) {
        this(Integer.toString(intAnswer), time);
    }

    /** Constructor for the Answer with a long as starting item
      */
    public Answer (long longAnswer, double time) {
        this(Long.toString(longAnswer), time);
    }

    /** Constructor for the Answer with a string as starting item
      */
    public Answer (String stringAnswer, double time) {
        answer = new StringBuilder(stringAnswer);
        executionTime = time;
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
    public String answerToString () {
        return answer.toString();
    }
    
    /** Sets the execution time of the problem
      */
    public void setExecutionTime(double time) {
        executionTime = time;
    }
    
    /** Returns the execution time of the problem
      */
    public double getExecutionTime() {
        return executionTime;
    }
}
