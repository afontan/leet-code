package problem_976

/*
    976. Largest Perimeter Triangle
    https://leetcode.com/problems/largest-perimeter-triangle/
*/

class Solution {
  companion object {
    fun largestPerimeter(nums: IntArray): Int {
      nums.sortDescending()
      for (i in 0 until nums.size - 2) {
        if (nums[i] < nums[i + 1] + nums[i + 2]) {
          return nums[i] + nums[i + 1] + nums[i + 2]
        }
      }
      return 0
    }
  }
}
