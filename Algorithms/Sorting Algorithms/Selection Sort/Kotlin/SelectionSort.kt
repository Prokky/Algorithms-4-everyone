import java.util.Collections.swap

fun <T : Comparable<T>> MutableList<T>.selectionSort() {
    for (min in 0 until size){
        var least = min
        (min until size)
                .asSequence()
                .filter { this[it] < this[least] }
                .forEach { least = it }
        if (least != min){
            swap(this, min, least)
        }
    }
}
