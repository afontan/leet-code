package problem_43

import java.math.BigDecimal
import java.math.BigInteger

/*
    43. Multiply Strings
    https://leetcode.com/problems/multiply-strings/
*/

object Solution {
    fun multiply(num1: String, num2: String): String {
        val num1int = BigInteger(num1)
        val num2int = BigInteger(num2)
        return num1int.multiply(num2int).toString(10)
    }
}