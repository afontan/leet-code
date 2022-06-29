package problem_1822

/*
    1822. Sign of the Product of an Array
    https://leetcode.com/problems/sign-of-the-product-of-an-array/
*/

class Solution {
    fun arraySign(nums: IntArray): Int {
        var sign = 1
        nums.forEach {
            if (it == 0) return 0
            if (it < 0) sign *= -1
        }
        return sign
    }
}