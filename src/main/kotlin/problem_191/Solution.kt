package problem_191;

/*
    191. Number of 1 Bits
    https://leetcode.com/problems/number-of-1-bits/
*/

class Solution {
    // you need treat n as an unsigned value
    fun hammingWeight(n:Int):Int {
        var count = 0u
        var value = n.toUInt()
        while (value > 0u) {
            count += value and 1u
            value = value shr 1
        }
        return count.toInt()
    }
}

class Main {
    fun main() {
        val solution = Solution()
        println(solution.hammingWeight(11))
    }
}
