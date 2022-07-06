package problem_1678

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.interpret("G()(al)")
        assertThat(case1).isEqualTo("Goal")

        val case2 = Solution.interpret("G()()()()(al)")
        assertThat(case2).isEqualTo("Gooooal")

        val case3 = Solution.interpret("(al)G(al)()()G")
        assertThat(case3).isEqualTo("alGalooG")
    }
}