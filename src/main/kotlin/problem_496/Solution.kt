package problem_496

/*
    496. Next Greater Element I
    https://leetcode.com/problems/next-greater-element-i/
*/

class Solution {
  companion object {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
      val result = mutableListOf<Int>()
      nums1.forEach {
        var value = -1
        val num1Index = nums2.indexOf(it)
        for (i in num1Index + 1 until nums2.size) {
          if (nums2[i] > it) {
            value = nums2[i]
            break
          }
        }
        result.add(value)
      }
      return result.toIntArray()
    }
  }
}
