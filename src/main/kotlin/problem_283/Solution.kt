package problem_283

/*
  283. Move Zeroes
  https://leetcode.com/problems/move-zeroes/
*/

class Solution {
  companion object {
    fun moveZeroes(nums: IntArray): Unit {
      var index = 0
      var zeroPointer = 0
      while (zeroPointer < nums.size) {
        if (nums[zeroPointer] != 0) {
          nums[index] = nums[zeroPointer]
          index++
        }
        zeroPointer++
      }
      while (index < nums.size) {
        nums[index] = 0
        index++
      }
    }
  }
}
