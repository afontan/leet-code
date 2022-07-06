package problem_389

/*
    389. Find the Difference
    https://leetcode.com/problems/find-the-difference/
*/

object Solution {
    fun findTheDifference(s: String, t: String): Char {
        var c = 0.toChar()
        for (cs in s.toCharArray()) c = (c.toInt() xor cs.toInt()).toChar()
        for (ct in t.toCharArray()) c = (c.toInt() xor ct.toInt()).toChar()
        return c
    }
}