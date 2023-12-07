package projecteuler;

import java.util.Scanner;
import projecteuler.ProblemFactory;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which problem do you want to run ?");
        ProblemFactory.showProblemNumberOptions();
        int problemNumber = in.nextInt();

        System.out.println();

        ProblemFactory.executeProblem(problemNumber);
    }
}