fun main() {
    val text = "Hello World"
    val vowels = "aeiouAEIOU"
    var count = 0

    for (letter in text) {
        if (letter in vowels) {
            count++                    
        }
    }
    println("Number of vowels: $count")
}