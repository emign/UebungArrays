object ArrayUebung {

    /**
     * Soll einfach ein IntArray mit der gegebenen Länge erstellen und zurück geben
     * @param laenge Int
     * @return IntArray
     */
    fun intArrayErstellen(laenge: Int): IntArray {
        return IntArray(laenge)
    }

    /**
     * Soll die Summe aller Zahlen der einzelnen Indexpositionen berechnen und zurück geben
     * Verwenden Sie hierfür eine Schleife. Kotlin liefert für IntArrays die Funktion .sum() mit,
     * welche Sie zum Testen verwenden können. Ihre Implementierung soll aber selbst erzeugt sein
     * und nicht auf die Funktion sum() zurück greifen.
     * @param array IntArray
     * @return Int
     */
    fun summeUeberArray(array: IntArray): Int {
        return array.sum()
    }

    /**
     * Vertauscht die Werte an den Index-Positionen i und j miteinander und gibt das Array zurück
     * @param i IndexPositon 1
     * @param j IndexPositon 2
     * @param array IntArray
     * @return IntArray
     */
    fun vertauscheIndizes(i: Int, j: Int, array: IntArray): IntArray {
        val tmp = array[i]
        array[i] = array[j]
        array[j] = tmp
        return array
    }

    /**
     * Invertieret das Array. Aus [1,2,3] wird also [3,2,1]
     * Zum Testen können Sie auf die funktion .reversedArray() zurück greifen. Ihre Implementierung soll
     * aber auf diese (oder ähnliche von Kotlin mitgelieferte Funktionen) verzichten und selbst erstellt sein.
     * @param array IntArray
     * @return IntArray
     */
    fun invertiere(array: IntArray): IntArray {
        return array.reversedArray()
    }

    /**
     * Mischt das Array (diesmal ein CharArray) so lange, bis das gesuchte Wort zufällig zusammen gesetzt wird.
     * Sie können aus einem CharArray einfach einen String machen, indem Sie den Konstruktor von String mit dem
     * CharArray "füttern": Zum Beispiel String(meinCharArray)
     * @param wort Das gesuchte Wort. Zum Beispiel "eis"
     * @param array Das (vermischte) CharArray. Zum Beispiel [s,e,i]
     * @return Das entsprechende Wort.
     */
    fun charArrayMischenBisWortHerauskommt(wort: String, array: CharArray): String {
        while (String(array) != wort) {
            val rnd = array.indices.random()
            val rnd2 = array.indices.random()
            val tmp = array[rnd]
            array[rnd] = array[rnd2]
            array[rnd2] = tmp
        }
        return String(array)
    }
}