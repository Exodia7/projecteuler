package projecteuler.problems;

import projecteuler.problems.Answer;

/** This class represents a problem, enables the User to set and get the number of the problem
  * and calls an abstract method to compute the Solution to the Problem that needs to be implemented by subclasses
  */
public abstract class Problem {
    private int problemNumber;

    /** Constructor for the problem, sets the problem number
      *
      * @param problemNum, the number of the problem we creates
      */
    protected Problem (int problemNum) {
        setProblemNumber(problemNum);
    }

    /** Function executed to display the solution of this problem
      */
    public void launch () {
        Answer answer = solveProblem();

        showResult(answer);
    }

    /** Displays the answer to the problem
      *
      * @param result, the answer to this problem
      */
    protected void showResult (Answer result) {
        System.out.println("The result to Problem #" + problemNumber + " is " + result.toString());
    }

    /** Setter for the problemNumber variable
      *
      * @param probNum, the new value for problemNumber
      */
    protected void setProblemNumber (int probNum) {
        problemNumber = probNum;
    }

    /** Getter for the problemNumber variable
      *
      * @return the number of this specific problem
      */
    public int getProblemNumber () {
        return problemNumber;
    }

    /** The function to override to solve the problem
      *
      * @return Answer, an "Answer"-class object representing the answer
      */
    protected abstract Answer solveProblem ();
}
