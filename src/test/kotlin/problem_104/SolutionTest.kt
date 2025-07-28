package problem_104

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test case 1`() {
        val tree = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        val case1 = Solution.maxDepth(tree)
        assertThat(case1).isEqualTo(3)
    }

    @Test
    fun `Description test case 2`() {
        println("Hola mundo3")
        val tree = TreeNode(1).apply {
            right = TreeNode(2)
        }

        val case2 = Solution.maxDepth(tree)
        assertThat(case2).isEqualTo(2)
    }
}
