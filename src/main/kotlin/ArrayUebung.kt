object ArrayUebung {

    fun intArrayErstellen(laenge : Int) : IntArray {
        return IntArray(laenge)
    }

    fun summeUeberArray(array : IntArray) : Int {
        return array.sum()
    }

    fun vertauscheIndizes(i : Int, j: Int, array : IntArray) : IntArray{
        val tmp = array[i]
        array[i] = array[j]
        array[j] = tmp
        return array
    }

    fun invertiere(array : IntArray) : IntArray{
        return array.reversedArray()
    }
}