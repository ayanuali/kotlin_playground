fun main(args: Array<String>) {
    var fortune: String = ""
//    for (i in 1..10) {
//    repeat(10) {
    while(!fortune?.contains("Take it easy")) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy"))
    }
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends, because they are your greatest fortune."
    )
    return when (birthday) {
        28, 31 -> "Be humble and all will turn out well."
        in 1..7 -> "Take it easy and enjoy life!"
        else -> fortunes[birthday.rem(fortunes.size)]
    }
}

fun getBirthday(): Int {
    print("What is your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return birthday
}