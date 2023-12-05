# Problem 1 of Project Euler
# Credit: Ringlet Valentin
#
# Solution: 233 168

from time import time

def solve():
    start = time()
    total = 0
    i = 3
    while i < 1000:
        if (i % 3 == 0) or (i % 5 == 0):
            total += i
        i += 1
    
    # EQUIVALENT ONE-LINER:
    #total = sum([x if ((x % 3 == 0) or (x % 5 == 0)) else 0 for x in range(1000)])
    
    end = time()
    print('The sum of all multiples of 3 or 5 below 1000 is {} \nExecution Time: {}'.format(total, end-start))

if __name__ == "__main__":
    solve()