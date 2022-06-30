package problem_589

/*
    589. N-ary Tree Preorder Traversal
    https://leetcode.com/problems/n-ary-tree-preorder-traversal/
*/

class Node(var `val`: Int) {
    var children: List<Node?> = listOf()
}

class Solution {
    fun preorder(root: Node?): List<Int> {
        if (root == null) return listOf()
        val result = mutableListOf<Int>()
        result.add(root.`val`)
        for (child in root.children) {
            result.addAll(preorder(child))
        }
        return result
    }
}