package problem_242

/*
    242. Valid Anagram
    https://leetcode.com/problems/valid-anagram/
*/

object Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val sortedS = s.toCharArray().sorted().joinToString("")
        val sortedT = t.toCharArray().sorted().joinToString("")
        sortedS.forEachIndexed { index, c ->
            if (c != sortedT[index]) return false
        }
        return true
    }
}