package problem_589

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases 1`() {
        val node1 = Node(3).withChildren(listOf(Node(5), Node(6)))
        val root = Node(1).withChildren(listOf(node1, Node(2), Node(4)))

        val case1 = Solution.preorder(root)
        assertThat(case1).isEqualTo(listOf(1, 3, 5, 6, 2, 4))
    }

    @Test
    fun `Description test cases 2`() {
        val node7 = Node(7).withChildren(listOf(Node(11).withChildren(listOf(Node(14)))))
        val node8 = Node(8).withChildren(listOf(Node(12)))
        val node9 = Node(9).withChildren(listOf(Node(13)))
        val node3 = Node(3).withChildren(listOf(Node(6), node7))
        val node4 = Node(4).withChildren(listOf(node8))
        val node5 = Node(5).withChildren(listOf(node9, Node(10)))
        val root = Node(1).withChildren(listOf(Node(2), node3, node4, node5))

        val case2 = Solution.preorder(root)
        assertThat(case2).isEqualTo(listOf(1,2,3,6,7,11,14,4,8,12,5,9,13,10))
    }

    @Test
    fun `One node tree`() {
        val root = Node(1)
        val node = Node(1)
        root.`val` = 2
        root.children = listOf(node)
        val case3 = Solution.preorder(root)
        assertThat(case3).isEqualTo(listOf(2, 1))
    }
}