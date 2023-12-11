# Problem 3 of Project Euler
# Author: Ringlet Valentin
#
# Solution: 6857

from time import time
from math import sqrt
from .MethodLibrary import isPrime

def solve():
    start = time()
    
    num = 600851475143
    divider = 2
    result = 0
    divisors = []
    while num != 1:
        if num % divider == 0:
            divisors.append(divider)
            num /= divider
            
            # Check if prime
            if isPrime(divider):
                result = divider
        else:
            divider += 1

    end = time()
    print('\nThe largest prime factor of 600851475143 is {} \nExecution time (in secs): {}'.format(result, end-start))

if __name__ == "__main__":
    solve()