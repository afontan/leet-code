package problem_1790

/*
    1790. Check if One String Swap Can Make Strings Equal
    https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
*/

object Solution {
  fun areAlmostEqual(s1: String, s2: String): Boolean {
    if (s1 == s2) return true
    if (s1.length != s2.length) return false
    var differenceA = 0
    var differenceB = 0
    s1.forEachIndexed { index, c ->
      if (c != s2[index]) {
        if (differenceA == 0) differenceA = index
        else if (differenceB == 0) differenceB = index else return false
      }
    }
    return s1[differenceA] == s2[differenceB] && s1[differenceB] == s2[differenceA]
  }
}
