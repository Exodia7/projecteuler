# Problem 10 of Project Euler
# Author: Ringlet Valentin
#
# Solution: 142 913 828 922

from time import time
from math import sqrt
from .MethodLibrary import isPrime

def solve():
    start = time()

    sum = 2
    n = 3
    # starting the search at 3 so we can increment by 2 every time
    while n < 2000000:
        if isPrime(n):
            sum += n
        n += 2

    end = time()
    
    print('\nThe sum of all the primes below 2 million is {} \nExecution Time: {}'.format(sum, end-start))

if __name__ == "__main__":
    solve()