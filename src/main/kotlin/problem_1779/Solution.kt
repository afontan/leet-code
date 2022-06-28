package problem_1779

import kotlin.math.abs

/*
    1779. Find Nearest Point That Has the Same X or Y Coordinate
    https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
*/

class Solution {
    fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {
        var minDistance = Int.MAX_VALUE
        var ans = -1
        points.forEachIndexed { index, pair ->
            if (pair[0] == x || pair[1] == y) {
                if (abs(x - pair[0]) + abs(y - pair[1]) < minDistance) {
                    minDistance = abs(x - pair[0]) + abs(y - pair[1])
                    ans = index
                }
            }
        }
        return ans
    }
}