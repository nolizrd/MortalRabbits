fun countRabbits(n: Int, m: Int): Long {
    var rabbits = LongArray(m) { 0 }
    rabbits[0] = 1

    for (i in 1 until n) {
        var sum = 0L
        for (j in 1 until m) {
            sum += rabbits[j]
        }

        for (k in m - 1 downTo 1) {
            rabbits[k] = rabbits[k - 1]
        }

        rabbits[0] = sum
    }

    return rabbits.sum()
}

fun main() {
    println(countRabbits(85, 19))
}
