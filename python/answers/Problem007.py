# Problem 7 of Project Euler
# Author: Ringlet Valentin
#
# Solution: 104 743

from time import time
from math import sqrt
from .MethodLibrary import isPrime

def solve():
    start = time()
    
    # Search for primes until we have found 100001 primes
    searchedPrime = 10001
    numPrimes = 0
    n = 1
    while numPrimes < searchedPrime:
        n += 1
        
        if isPrime(n):
            numPrimes += 1
    
    # NOTE: the search above can be made slightly faster if we start at n=3 instead and increment n by 2 at every step (to skip even numbers)
    
    end = time()
    print('\nThe {}st prime number is {} \nExecution Time: {}'.format(searchedPrime, n, end-start))

if __name__ == "__main__":
    solve()