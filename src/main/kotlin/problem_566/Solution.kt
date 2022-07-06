package problem_566

/*
    566. Reshape the Matrix
    https://leetcode.com/problems/reshape-the-matrix/
*/

object Solution {
  fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    if (mat.size * mat[0].size != r * c) return mat
    if (mat.size == r && mat[0].size == c) return mat
    val result = Array(r) { IntArray(c) }
    var row = 0
    var col = 0
    for (matRow in mat) {
      for (j in 0 until mat[0].size) {
        result[row][col] = matRow[j]
        col++
        if (col == c) {
          col = 0
          row++
        }
      }
    }
    return result
  }
}
