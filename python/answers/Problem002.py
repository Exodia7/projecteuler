# Problem 2 of Project Euler
# Author: Ringlet Valentin
#
# Solution: 4 613 732

from time import time

def solve():
    start = time()
    total = 2   # for starting value of n2
    n1 = 1
    n2 = 2
    temp = 0
    while n2 < 4000000:
        temp = n1
        n1 = n2
        n2 += temp
        # EQUIVALENT ONE-LINER:
        #n1, n2 = n2, n1+n2

        if (n2 % 2 == 0):
            total += n2

    end = time()
    print('\nThe sum of the even-valued Fibonacci terms below 4 millions is {} \nExecution time (in secs): {}'.format(total, end-start))

if __name__ == "__main__":
    solve()