
fun <T : Comparable<T>> MutableList<T>.bubbleSort() {
    for (next in 1 until size) {
        var cur = next - 1
        val curValue = this[next]
        while ((cur >= 0) && (this[cur] > curValue)) {
            this[cur + 1] = this[cur]
            cur--
        }
        this[cur + 1] = curValue
    }
}
