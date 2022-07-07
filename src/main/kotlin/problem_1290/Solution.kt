package problem_1290

/**
 * 1290. Convert Binary Number in a Linked List to Integer
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/submissions/
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
**/
class ListNode(var `val`: Int) {
   var next: ListNode? = null
}

object Solution {
    fun getDecimalValue(head: ListNode?): Int {
        var root = head
        val stack = ArrayDeque<Int>()
        while(root != null) {
            stack.addFirst(root.`val`)
            root = root.next
        }
        var pow = 1
        var result = 0
        while (stack.size > 0) {
            val number = stack.removeFirst()
            result += number * pow
            pow *= 2
        }
        return result
    }
}