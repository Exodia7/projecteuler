# Problem 4 of Project Euler
# Credit: Ringlet Valentin
#
# Solution: 906 609

from time import time
from .MethodLibrary import isPalindrome

def solve():
    start = time()
    
    # Method 1 (~ 10 times faster than Method 2)
    maxVal = 0
    n1 = 999
    while n1 >= 100:
        n2 = 999
        while n2 >= 100:
            product = n1 * n2
            if product > maxVal and isPalindrome(product):
                    maxVal = product
        
            n2 -= 1
            # stop once the product is smaller than the maximum value as the product will only get smaller
            if n1 * n2 < maxVal:
                break

        n1 -= 1
        # stop once the product with 999 is smaller than the maximum value as the product will only get smaller
        if n1 * 999 < maxVal:
            break
    
    # Method 2 (~ 10 times slower than Method 1)
    '''
    not_found = True
    i = 999 * 999
    while (not_found) and i >= 10000:
        if isPalindrome(i):
            n = 999
            while n >= 100:
                if (i % n == 0) and 100 <= i/n <= 999:
                    not_found = False
                n -= 1
        if not_found:
            i -= 1
    maxVal = i
    '''

    end = time()
    print('\nThe largest palindrome made from the product of two 3-digit numbers is {}\nExecution time (in secs): {}'.format(maxVal, end-start))

if __name__ == "__main__":
    solve()