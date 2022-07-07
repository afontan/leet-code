package problem_404

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

        val case1 = Solution.sumOfLeftLeaves(tree)
        assertThat(case1).isEqualTo(24)
    }

    @Test
    fun `Description test case 2`() {
        val tree = TreeNode(1)

        val case2 = Solution.sumOfLeftLeaves(tree)
        assertThat(case2).isEqualTo(0)
    }
}