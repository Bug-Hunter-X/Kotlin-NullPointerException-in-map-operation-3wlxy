fun main() {
    val list = listOf(1, 2, null, 4, 5)
    val result = list.mapNotNull { it?.times(2) }
    println(result) // Output: [2, 4, 8, 10]

    //Alternative solution using let:
    val result2 = list.map { it?.let { it * 2 } }
    println(result2) // Output: [2, 4, null, 8, 10]
}