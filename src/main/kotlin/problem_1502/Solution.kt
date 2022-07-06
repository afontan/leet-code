package problem_1502

/*
    1502. Can Make Arithmetic Progression From Sequence
    https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
*/

object Solution {
  fun canMakeArithmeticProgression(arr: IntArray): Boolean {
    if (arr.size == 1) return true
    arr.sort()
    val distance = arr[1] - arr[0]
    arr.forEachIndexed { index, i ->
      if (index != 0 && index != arr.lastIndex) {
        if (arr[index + 1] - i != distance) return false
      }
    }
    return true
  }
}
