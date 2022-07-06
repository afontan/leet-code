package problem_1768

/*
    1768. Merge Strings Alternately
    https://leetcode.com/problems/merge-strings-alternately/submissions/
*/

object Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var word1Pointer = 0
        var word2Pointer = 0
        var result = ""
        while(word1Pointer < word1.length && word2Pointer < word2.length) {
            if(word1Pointer == word2Pointer) {
                result += word1[word1Pointer]
                word1Pointer++
            } else {
                result += word2[word2Pointer]
                word2Pointer++
            }
        }
        while(word1Pointer < word1.length) {
            result += word1[word1Pointer]
            word1Pointer++
        }
        while (word2Pointer < word2.length) {
            result += word2[word2Pointer]
            word2Pointer++
        }
        return result
    }
}