fun main() {
    val numbers = listOf(3, 7, 1, 9, 4, 6)
    var max = numbers[0]

    for (num in numbers) {
        if (num > max) {
            max = num                   
        }
    }
    println("Largest number: $max")
}