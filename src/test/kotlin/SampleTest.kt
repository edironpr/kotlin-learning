import kotlin.test.Test
import kotlin.test.assertEquals

internal class SampleTest{

    private val sample = Sample()

    @Test
    fun testSample() {
        val expected = 3
        val sum = sample.sum(1, 2)
        assertEquals(expected, sum)
    }

}
