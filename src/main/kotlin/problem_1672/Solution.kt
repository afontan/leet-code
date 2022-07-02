package problem_1672

class Solution {
    companion object {
        fun maximumWealth(accounts: Array<IntArray>): Int {
            var maxWealth = Int.MIN_VALUE
            accounts.forEach { customer ->
                var wealth = 0
                customer.forEach { wealth += it }
                maxWealth = maxOf(maxWealth, wealth)
            }
            return maxWealth
        }
    }
}