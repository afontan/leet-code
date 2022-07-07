package problem_876

/**
 * 876. Middle of the Linked List
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 *
 **/
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

object Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var f = head
        var pointer = head
        var count = 0
        while (pointer != null) {
            count++
            pointer = pointer.next
        }
        for (i in 0 until count/2) {
            f = f!!.next
        }
        return f
    }
}