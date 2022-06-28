package problem_1281

/*
    1281. Subtract the Product and Sum of Digits of an Integer
    https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
*/

class Solution {
    fun subtractProductAndSum(n: Int): Int {
        var product = 1
        var sum = 0
        var number = n
        while (number > 0) {
            val digit = number % 10
            product *= digit
            sum += digit
            number /= 10
        }
        return product - sum
    }
}