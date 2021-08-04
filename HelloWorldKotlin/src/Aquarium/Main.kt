package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

private fun buildAquarium() {
//    val spicinessLevel = SimpleSpice()
//    println("heat ${spicinessLevel.heat}")
//    val myAquarium = Aquarium()

//    println("Length: ${myAquarium.length} " +
//            "Width: ${myAquarium.width} " +
//            "Height: ${myAquarium.height}")
//
//    myAquarium.height = 80
//
//    println("Height: ${myAquarium.height}")
//
//    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfPish = 9)

    println(
        "Small Aquarium 2 : ${myAquarium2.volume} liters with " +
                "height: ${myAquarium2.height} " +
                "width: ${myAquarium2.width} " +
                "length: ${myAquarium2.length}"
    )
}

fun makeFish() {

}