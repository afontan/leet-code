package problem_2225

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test case 1`() {
        val case1 = arrayOf(
            intArrayOf(1,3),
            intArrayOf(2,3),
            intArrayOf(3,6),
            intArrayOf(5,6),
            intArrayOf(5,7),
            intArrayOf(4,5),
            intArrayOf(4,8),
            intArrayOf(4,9),
            intArrayOf(10,4),
            intArrayOf(10,9)
        )

        assertThat(Solution.findWinners(case1)).isEqualTo(
            listOf(
                listOf(1, 2, 10),
                listOf(4, 5, 7, 8)
            )
        )
    }

    @Test
    fun `Description test case 2`() {
        val case2 = arrayOf(
            intArrayOf(2, 3),
            intArrayOf(1, 3),
            intArrayOf(5, 4),
            intArrayOf(6, 4)
        )

        "asd".indexOf("asd")

        assertThat(Solution.findWinners(case2)).isEqualTo(
            listOf(
                listOf(1, 2, 5, 6),
                listOf()
            )
        )
    }
}