package problem_1232

/*
    1232. Check If It Is a Straight Line
    https://leetcode.com/problems/check-if-it-is-a-straight-line/
*/

class Solution {
  companion object {
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
      if (coordinates.size == 2) {
        return true
      }
      val x1 = coordinates[0][0]
      val y1 = coordinates[0][1]
      val x2 = coordinates[1][0]
      val y2 = coordinates[1][1]
      val slope = (y2 - y1).toDouble() / (x2 - x1)
      if (slope.isInfinite() && coordinates.all { it[0] == x1 }) return true
      for (i in 2 until coordinates.size) {
        val x = coordinates[i][0]
        val y = coordinates[i][1]
        if (y.toDouble() != slope * (x - x1) + y1) {
          return false
        }
      }
      return true
    }
  }
}
