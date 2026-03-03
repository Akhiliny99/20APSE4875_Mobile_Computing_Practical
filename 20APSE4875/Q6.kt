fun main() {
    val words = listOf("apple", "banana", "cherry")
    val reversed = mutableListOf<String>()

    for (i in words.size - 1 downTo 0) { 
        reversed.add(words[i])
    }
    println("Reversed list: $reversed")
}