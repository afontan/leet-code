package problem_404

/**
 * 404. Sum of Left Leaves
 * https://leetcode.com/problems/sum-of-left-leaves/submissions/
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 **/
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

object Solution {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        return sumOfLeftLeavesWithFlag(root, false)
    }

    private fun sumOfLeftLeavesWithFlag(root: TreeNode?, isLeftLeave: Boolean): Int {
        if (root == null) return 0
        if (root.left == null && root.right == null && isLeftLeave) return root.`val`
        return sumOfLeftLeavesWithFlag(root.left, true) + sumOfLeftLeavesWithFlag(root.right, false)
    }
}