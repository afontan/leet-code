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