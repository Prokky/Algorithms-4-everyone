import java.util.Collections.swap

fun <T : Comparable<T>> MutableList<T>.bubbleSort() {
    var swappedElements: Boolean
    do {
        swappedElements = false
        for (i in 0..this.size - 2) {
            if (this[i] > this[i + 1]) {
                swap(this, i, i + 1)
                swappedElements = true
            }
        }
    } while (swappedElements)
}
