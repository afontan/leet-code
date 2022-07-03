package problem_566

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test case 1`() {
        val input = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4)
        )
        val case1 = Solution.matrixReshape(input, 1, 4)

        assertThat(case1).isEqualTo(arrayOf(
            intArrayOf(1, 2, 3, 4)
        ))
    }

    @Test
    fun `Description test case 2`() {
        val input = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4)
        )
        val case2 = Solution.matrixReshape(input, 2, 2)

        assertThat(case2).isEqualTo(arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4)
        ))
    }

    @Test
    fun `Edge case`() {
        val input = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4)
        )
        val edgeCase = Solution.matrixReshape(input, 2, 4)

        assertThat(edgeCase).isEqualTo(arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4)
        ))
    }
}