package problem_217

/*
  217. Contains Duplicate
  https://leetcode.com/problems/contains-duplicate/
*/

object Solution {
  fun containsDuplicate(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    for (num in nums) {
      if (set.contains(num)) {
        return true
      }
      set.add(num)
    }
    return false
  }
}
