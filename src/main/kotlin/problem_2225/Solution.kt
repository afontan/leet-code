package problem_2225

object Solution {
    fun findWinners(matches: Array<IntArray>): List<List<Int>> {
        val resultMap = mutableMapOf<Int, Int>()
        for (match in matches) {
            val winner = match[0]
            val loser = match[1]
            if (!resultMap.containsKey(winner)) {
                resultMap[winner] = 0
            }
            if (resultMap.containsKey(loser)) {
                resultMap[loser] = resultMap[loser]!! + 1
            } else {
                resultMap[loser] = 1
            }
        }
        return listOf(
            resultMap.filter { it.value == 0 }.map { it.key }.toList().sorted(),
            resultMap.filter { it.value == 1 }.map { it.key }.toList().sorted()
        )
    }
}

class Solution2 {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.indices.reversed()) {
            if (digits[i] != 9) {
                digits[i]++
                break
            } else {
                digits[i] = 0
            }
        }
        if (digits[0] == 0) {
            return intArrayOf(1).plus(digits)
        }
        return digits
    }
}