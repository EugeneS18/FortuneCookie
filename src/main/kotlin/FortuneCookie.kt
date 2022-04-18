fun main(args: Array<String>) {

    for (i in 1..10) {
        var result = getFortuneCookie()
        println("Your fortune is: $result")
        if (result == "Take it easy and enjoy life!") break
    }

}

fun getFortuneCookie(): String {
    /*val listOfFortunes = mutableListOf<String>()

    listOfFortunes.add("You will have a great day!")
    listOfFortunes.add("Things will go well for you today.")
    listOfFortunes.add("Enjoy a wonderful day of success.")
    listOfFortunes.add("Be humble and all will turn out well.")
    listOfFortunes.add("Today is a good day for exercising restraint.")
    listOfFortunes.add("Take it easy and enjoy life!")
    listOfFortunes.add("Num 7")
    listOfFortunes.add("Num 8")
    listOfFortunes.add("Num 9")*/

    val listOfFortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Num 7",
        "Num 8",
        "Num 9"
    )

    print("Enter Your birthday: ")
    val stringInput = readLine()
    val result = (stringInput?.toIntOrNull() ?: 0).toDouble() % listOfFortunes.size

    return listOfFortunes[result.toInt()]

}

fun getBirthday(): Int {

    print("Enter Your birthday: ")
    return readLine()?.toIntOrNull() ?: 0
   
}


