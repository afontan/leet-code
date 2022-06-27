package problem_1523

/*
    Count Odd Numbers in an Interval Range
    https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
*/

class Solution {
    fun countOdds(low: Int, high: Int): Int {
        if (high - low + 1 % 2 == 0)
            return high - low + 1
        else if (low % 2 == 0)
            return (high - low + 1) / 2
        else
            return ((high - low) / 2) + 1
    }
}