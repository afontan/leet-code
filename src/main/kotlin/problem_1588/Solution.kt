package problem_1588

/*
    1588. Sum of All Odd Length Subarrays
    https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
*/

class Solution {
    companion object {
        fun sumOddLengthSubarrays(arr: IntArray): Int {
            var windowSize = if (arr.size % 2 == 0) arr.size - 1 else arr.size
            println("windowSize: $windowSize")
            var sum = 0
            while(windowSize > 0) {
                var windowStart = 0
                var windowEnd = windowSize - 1
                while(windowEnd < arr.size) {
                    sum += arr.slice(windowStart until windowEnd + 1).sum()
                    windowStart++
                    windowEnd++
                }
                windowSize -= 2
            }
            return sum
        }
    }
}