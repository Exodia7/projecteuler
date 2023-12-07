# Solutions to Project Euler challenges
This repository will contain my solutions to the problems from the Project Euler webpage (https://projecteuler.net/archives).

I have written solutions in different languages and will group my solutions by language. 
This is more convenient as I have helper scripts which take user input to know which problem to execute.



## Python
### Execution
The Python answers can be run by executing the [main.py](/python/main.py) file, such as with the command `python python/main.py`.
The user will then be asked which problem from a list of solved problems they would like to launch and launch the one they selected.
### Code
The actual solutions to the problems can be found in the [answers](/python/answers/) folder, in the files named ProblemXXX.py (where XXX is replaced by the problem number).

### How to add a new solution?
First of all, create a new Python file called ProblemXXX.py  (with XXX replaced by the problem number). That class should containg a solve() method which prints the answer to the problem and the time that the computation took.
Then, a new import needs to be added in the file [\_\_init\_\_.py](/python/answers/\_\_init\_\_.py) for the solve method.
Lastly, a new entry needs to be added in the list completedProblems in the [main.py](/python/main.py) file, similary to the others.



## Java
### Compilation & Execution
The Java answers can be compiled by using the command ```javac *.java -d .``` from the [java](/java/) directory.
The code can then be executed by running the _Main.class_ file which should be located at java/projecteuler/Main. From the [java] directory, this is done using the command ```java projecteuler/Main```.
The user will then be asked which problem from a list of solved problems they would like to launch and launch the one they selected.

### Code
The actual solutions to the problems can be found in the [java](/java/) folder itself, in files named ProblemXXX.java (where XXX is replaced by the problem number).

### How to add a new solution?
First of all, create a new Java class called ProblemXXX.java (with XXX replaced by the problem number). That class should extend the abstract class Problem, in particular it should call the super-class constructor and define the solveProblem() method.
Once that is done, a new entry needs to be added in the array problems of the ProblemFactory in [ProblemFactory.java](/java/ProblemFactory.java).
