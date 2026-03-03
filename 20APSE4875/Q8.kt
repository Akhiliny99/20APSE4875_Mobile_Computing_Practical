fun main() {
    val numbers = listOf(-3, 5, -1, 8, 2, -7, 4)
    var sum = 0

    for (num in numbers) {
        if (num > 0) {                   
            sum = sum + num
        }
    }
    println("Sum of positive numbers: $sum")
}