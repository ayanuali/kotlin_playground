package Aquarium

class SimpleSpice {
    var spiceName: String = "curry"
    var spicinessLevel: String = "mild"
    val heat: Int
        get(): Int {
            return when {
                spicinessLevel.equals("mild") -> 5
                else -> 1
            }
        }
}