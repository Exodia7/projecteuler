# Problem 8 of Project Euler
# Author: Ringlet Valentin
#
# Solution: 23 514 624 000

from time import time
from functools import reduce
from operator import mul

def solve():
    start = time()
    
    num = '''73167176531330624919225119674426574742355349194934
96983520312774506326239578318016984801869478851843
85861560789112949495459501737958331952853208805511
12540698747158523863050715693290963295227443043557
66896648950445244523161731856403098711121722383113
62229893423380308135336276614282806444486645238749
30358907296290491560440772390713810515859307960866
70172427121883998797908792274921901699720888093776
65727333001053367881220235421809751254540594752243
52584907711670556013604839586446706324415722155397
53697817977846174064955149290862569321978468622482
83972241375657056057490261407972968652414535100474
82166370484403199890008895243450658541227588666881
16427171479924442928230863465674813919123162824586
17866458359124566529476545682848912883142607690042
24219022671055626321111109370544217506941658960408
07198403850962455444362981230987879927244284909188
84580156166097919133875499200524063689912560717606
05886116467109405077541002256983155200055935729725
71636269561882670428252483600823257530420752963450'''

    # PARSING: Remove all newline characters and cast everything to ints
    num = [int(char) for char in num.replace("\n", "")]
    # ACTUAL RESOLUTION:
    # 1) make groups of all possible sequences of 13 digits
    # 2) reduce the sequences by computing the product
    # 3) reduce the products by finding the max
    maxProduct = max([reduce(mul, num[i:i+13]) for i in range(len(num)-13)])
    
    ''' # ALTERNATIVE METHOD (without using reduces):
    # ADVANTAGE: we also know the 13 digits that lead to the product
    
    def calculateProductOfList(nums: [int]) -> int:
        """ Calculates the product of the numbers from index start to end in num
        """
        prod = 1
        for i in range(len(nums)):
            prod *= nums[i]
        
        return prod
    
    # ACTUAL RESOLUTION:
    # Try every single series of 13 subsequent digits
    maxProduct = 0
    digits = []
    for i in range(len(num)-13):
        currentProduct = calculateProductOfList([int(n) for n in num[i:i+13]])
        if currentProduct > maxProduct:
            # If it's larger than the previous max, replace it
            maxProduct = currentProduct
            digits = []
            for j in range(i, i+13):
                digits.append(num[j])
    '''
     
    end = time()
    
    print('\nThe largest product of 13 adjacent digits in the 1000-digit number is {} \nExecution time (in secs): {}'.format(maxProduct, end-start))

if __name__ == "__main__":
    solve()