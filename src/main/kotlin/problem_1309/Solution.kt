package problem_1309

/*
    1309. Decrypt String from Alphabet to Integer Mapping
    https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
*/

object Solution {
    fun freqAlphabets(s: String): String {
        var ans = s
        val map = buildMap()
        map.keys.forEach {
            ans = ans.replace(it, map[it]!!)
        }
        ans.forEachIndexed { index, c ->
            if (c.isDigit()) {
                ans = ans.replace(c, (c.toInt() - 49 + 'a'.toInt()).toChar())
            }
        }
        return ans
    }

    fun buildMap(): Map<String, String> {
        var map = HashMap<String, String>()
        var ascii = 'j'.toInt()
        for (i in 10..26) {
            map.put("$i#", ascii.toChar().toString())
            ascii++
        }
        return map
    }
}