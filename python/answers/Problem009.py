# Problem 9 of Project Euler
# Author: Ringlet Valentin
#
# Solution: 31 875 000 (a: 200, b: 375, c: 425)

from time import time

def solve():
    # Method 1:
    # start top-down for c and bottom-up for a, with b being computed as the remainder
    start = time()
    c = 998
    product = 0
    found = False
    while (c > 333) and not found:
        c -= 1
        a = 1
        while (a < 333) and not found:
            b = 1000-c-a
            if a*a + b*b == c*c:
                product = a*b*c
                found = True
            else: 
                a += 1
    '''
    # Method 2:
    a = 1
    product = 0
    not_found = True
    while (a <= 332) and not_found:
        b = (1000*a-500000)/(a-1000)
        c = 1000-a-b
        if b % 1 == 0:
            if (a*a + b*b == c*c):
                product = a*b*c
                not_found = False
            else:
                a += 1
        else:
            a += 1
    '''
    end = time()
    
    print('\nThe Pythagorean triplet for which a+b+c = 1000 is a: {},b: {},c: {}. \nThe product is {} \nExecution Time: {}'.format(a,b,c, product, end-start))

if __name__ == "__main__":
    solve()