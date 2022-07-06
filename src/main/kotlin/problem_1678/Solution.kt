package problem_1678

/*
    1678. Goal Parser Interpretation
    https://leetcode.com/problems/goal-parser-interpretation/
*/

object Solution {
    fun interpret(command: String): String {
        var res = ""
        var index = 0
        while (index <= command.length - 1) {
            val c = command[index]
            if (c == 'G') {
                res += 'G'
                index++
            } else if(command[index + 1] == ')') {
                res += "o"
                index += 2
            } else {
                res += "al"
                index += 4
            }
        }
        return res
    }
}