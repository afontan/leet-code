package problem_1491

/*
    Average Salary Excluding the Minimum and Maximum Salary
    https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
*/

class Solution {
    fun average(salary: IntArray): Double {
        var maxValue = Int.MIN_VALUE
        var minValue = Int.MAX_VALUE
        var totalSum = 0.0
        salary.forEachIndexed { index, number ->
            if (salary[index] > maxValue) {
               maxValue = salary[index]
            }
            if (salary[index] < minValue) {
                minValue = salary[index]
            }
            totalSum += salary[index]
        }
        return (totalSum - maxValue - minValue) / (salary.size - 2)
    }
}