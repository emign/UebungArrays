import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals

class Test {
    val array1 = arrayOf(4, 6, 2, 8, 29, 32, 23, 6, 345, 57, 34, 2, 7, 2, 23, 42, 324, 23, 4234, 6).toIntArray()
    val array2 = arrayOf(4, 6, 2, 8, -29, 32, 23, 6, 345, 57, 34, 2, 7, -2, 23, 42, -324, 23, 4234, -6, -4486).toIntArray()
    val array3 = arrayOf(0).toIntArray()
    val array4 = arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0).toIntArray()
    @Test
    fun testArrayErstellenLange10() {
        Assert.assertArrayEquals(IntArray(10), ArrayUebung.intArrayErstellen(10))
    }

    @Test
    fun testArrayErstellenLange100() {
        Assert.assertArrayEquals(IntArray(100), ArrayUebung.intArrayErstellen(100))
    }

    @Test
    fun testArrayErstellenLange0() {
        Assert.assertArrayEquals(IntArray(0), ArrayUebung.intArrayErstellen(0))
    }

    @Test
    fun testSummeUeberArray() {
        Assert.assertEquals(5209, ArrayUebung.summeUeberArray(array1))
    }

    @Test
    fun testSummeUeberArrayNegatives() {
        Assert.assertEquals(1, ArrayUebung.summeUeberArray(array2))
    }

    @Test
    fun testSummeUeberArraySingleZero() {
        Assert.assertEquals(0, ArrayUebung.summeUeberArray(array3))
    }

    @Test
    fun testSummeUeberArrayAllZeros() {
        Assert.assertEquals(0, ArrayUebung.summeUeberArray(array4))
    }

    @Test
    fun testVertausche0Und1() {
        Assert.assertEquals(arrayOf(6, 4, 2, 8, 29, 32, 23, 6, 345, 57, 34, 2, 7, 2, 23, 42, 324, 23, 4234, 6).toIntArray().joinToString(), ArrayUebung.vertauscheIndizes(0,1,array1).joinToString())
    }

    @Test
    fun testVertauscheGleiche() {
        Assert.assertEquals(array2.joinToString(), ArrayUebung.vertauscheIndizes(5,5,array2).joinToString())
    }

    @Test
    fun testInvertiereArray1() {
        Assert.assertEquals("6, 4234, 23, 324, 42, 23, 2, 7, 2, 34, 57, 345, 6, 23, 32, 29, 8, 2, 6, 4", ArrayUebung.invertiere(array1).joinToString())
    }

    @Test
    fun testInvertiereArray2() {
        Assert.assertEquals("-4486, -6, 4234, 23, -324, 42, 23, -2, 7, 2, 34, 57, 345, 6, 23, 32, -29, 8, 2, 6, 4", ArrayUebung.invertiere(array2).joinToString())
    }

    @Test
    fun testInvertiereArray3() {
        Assert.assertEquals("0", ArrayUebung.invertiere(array3).joinToString())
    }

    @Test
    fun testInvertiereArray4() {
        Assert.assertEquals("0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0", ArrayUebung.invertiere(array4).joinToString())
    }
}