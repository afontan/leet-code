package problem_1572

/*
    1572. Matrix Diagonal Sum
    https://leetcode.com/problems/matrix-diagonal-sum/
*/

object Solution {
  fun diagonalSum(mat: Array<IntArray>): Int {
    var sum = 0
    for (i in mat.indices) {
      sum += mat[i][i]
      if (i != mat.size - 1 - i) {
        sum += mat[i][mat.size - 1 - i]
      }
    }
    return sum
  }
}
