# Problem 5 of Project Euler
# Credit: Ringlet Valentin
#
# Solution: 232 792 560

from time import time
from .MethodLibrary import primeFactorDecomposition

def solve():
    start = time()

    # Creates a dictionary that keeps the minimal exponent of the prime factors needed (i.e. the maximum exponent of each prime factor in the prime factor decomposition of each number from 2 to 20)
    to_mult = {}
    for i in range(19):
        pres_divs = primeFactorDecomposition(i+2)
        for key in pres_divs.keys():
            value = pres_divs[key]
            # for each prime factor,
            if key in to_mult.keys():
                if to_mult[key] < value:
                    to_mult[key] = value
            else:
                to_mult[key] = value

    result = 1
    for key in to_mult.keys():
        value = to_mult[key]
        for i in range(value):
            result *= key
    
    end = time()
    print('\nThe smallest positive number evenly divisible by all the numbers from 1 to 20 is {}\nExecution time (in secs): {}'.format(result, end-start))

if __name__ == "__main__":
    solve()