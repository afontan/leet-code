package problem_1523

/*
    Count Odd Numbers in an Interval Range
    https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
*/

class Solution {
  companion object {
    fun countOdds(low: Int, high: Int): Int {
      return if (high - low + 1 % 2 == 0) high - low + 1
      else if (low % 2 == 0) (high - low + 1) / 2 else ((high - low) / 2) + 1
    }
  }
}
