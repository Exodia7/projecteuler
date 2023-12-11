# Problem 6 of Project Euler
# Author: Ringlet Valentin
#
# Solution: 25 164 150

from time import time

def solve():
    start = time()

    lower = 1
    upper = 100
    # Compute the sum of all squares
    sum_of_squares = 0
    for i in range(1, upper+1):
        sum_of_squares += i**2

    # Compute the square of the sum
    square_of_sum = int(((upper+lower)*(upper/2))**2)
    # NOTE: using Gauss' method to compute sums (see e.g. https://nrich.maths.org/2478)
    #   The formula says that the sum of numbers from 1 to n is equal to n*(n+1)/2

    # And compute the difference between the two
    diff = square_of_sum - sum_of_squares
    end = time()

    print('\nThe difference between the sum of the squares and the square of the sum for the first hundred natural numbers is {} - {} = {} \nExecution time (in secs): {}'.format(square_of_sum, sum_of_squares, diff, end-start))

if __name__ == "__main__":
    solve()