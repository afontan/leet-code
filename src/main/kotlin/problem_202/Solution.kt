package problem_202

/*
    202. Happy Number
    https://leetcode.com/problems/happy-number/
*/

object Solution {
  fun isHappy(n: Int): Boolean {
    var input = n
    val set = mutableSetOf<Int>()
    while (input != 1) {
      var digitSquareSum = 0
      while (input > 0) {
        digitSquareSum += (input % 10) * (input % 10)
        input /= 10
      }
      if (set.contains(digitSquareSum)) return false
      set.add(digitSquareSum)
      input = digitSquareSum
    }
    return true
  }
}
