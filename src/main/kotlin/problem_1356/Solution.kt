package problem_1356

/*
    1356. Sort Integers by The Number of 1 Bits
    https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
*/

object Solution {
    fun sortByBits(arr: IntArray): IntArray = arr.sortedWith(compareBy<Int> { Integer.bitCount(it) }.thenBy { it }).toIntArray()
}