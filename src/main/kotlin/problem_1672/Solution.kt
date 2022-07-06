package problem_1672

/*
    1672. Richest Customer Wealth
    https://leetcode.com/problems/richest-customer-wealth/
*/

object Solution {
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
