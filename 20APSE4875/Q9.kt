fun main() {
    val secret = 7
    var guess = 0

    while (guess != secret) {
        print("Guess a number: ")
        guess = readLine()!!.toInt()
    }

    println("Correct!")
}