package problem_953

/*
    953. Verifying an Alien Dictionary
    https://leetcode.com/problems/verifying-an-alien-dictionary/
*/

object Solution {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        words.forEachIndexed { index, word ->
            if (index > 0) {
                if (!compareTwoWords(words[index - 1], words[index], order)) {
                    return false
                }
            }
        }
        return true
    }

    private fun compareTwoWords(word1: String, word2: String, order: String): Boolean {
        if (word1 == word2) {
            return true
        }
        for (i in 0 until minOf(word1.length, word2.length)) {
            if (order.indexOf(word1[i]) < order.indexOf(word2[i])) {
                return true
            } else if (order.indexOf(word1[i]) > order.indexOf(word2[i])) {
                return false
            }
        }
        return word1.length < word2.length
    }
}