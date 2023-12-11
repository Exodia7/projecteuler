# This file contains generally useful functions used in different problems.
# Author: Ringlet Valentin

def isPrime(n):
    """ Computes whether the given number n is prime or not and returns the corresponding value.
    """
    # first handle some base cases and common cases
    if (n < 2):
        return False
    elif (n == 2):
        return True
    elif (n % 2) == 0:
        return False
    else:
        # lastly, handle the more complex cases
        i = 3
        prime = True
        while i*i <= n and prime:
            if n % i == 0:
                prime = False
            else:
                i += 2  # +2 since we disqualified all even numbers earlier
        
        return prime

def isPalindrome(n):
    """ Checks whether the number n is a palindrome or not
    """
    s = str(n)
    pal = True
    i = 0
    while (i < len(s)/2) and pal:
        if s[i] != s[len(s)-1-i]:
            pal = False
        else:
            i += 1
    
    return pal

def primeFactorDecomposition(n):
    """ Returns a dictionary containing the divisors of n as keys and their exponent as value
    """
    divs = {}
    i = 2
    while n != 1:
        if n % i == 0:
            if i in divs:
                divs[i] += 1
            else:
                divs[i] = 1
            
            n = n/i
        else:
            i += 1
    
    return divs