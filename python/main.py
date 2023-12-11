# Author: Ringlet Valentin

from os import listdir
from answers import *

if __name__ == "__main__":
    # List of the available problems
    completedProblems = {
        1: Problem001.solve, 2: Problem002.solve, 3: Problem003.solve,
        4: Problem004.solve, 5: Problem005.solve, 6: Problem006.solve
    }
    
    # ask the user for a valid input
    validInput = False
    chosenProblemNum = -1
    while (not validInput):
        # Ask the user which problem he wants to run
        print("Which Problem would you like to execute?\nAvailable problems are:")
        for problemNum in completedProblems:
            print(f" - Problem #{problemNum}")
        print("\nEnter the number: ", end='')
        
        # get the user's input
        userChoice = input()
        # make sure that it's an integer
        chosenProblemNum = -1
        try:
            chosenProblemNum = int(userChoice)
            
            # and make sure it is the number of one of the completed problems
            if (chosenProblemNum not in completedProblems.keys()):
                print("Please provide a number corresponding to one of the listed choices")
            else:
                validInput = True
        except ValueError:
            print("Please enter an integer number!")
        
        # separator print
        print("\n-----------------------")
    
    # Now, launch the corresponding problem
    completedProblems[chosenProblemNum]()